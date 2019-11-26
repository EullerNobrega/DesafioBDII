package controller;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import dao.DAOCombustivelCliente;
import model.AbstractEntity;
import model.CombustivelCliente;
import model.dto.ClienteFidelidadeDTO;
import model.dto.CombustivelDTO;
import model.dto.FuncionarioDTO;
import model.dto.HorarioPicoDTO;
import model.dto.LucroValorDTO;
import model.dto.TotalVendaCombustivelDTO;
import util.PersistCombustivelCliente;

public class ControllerCombustivelCliente<T extends AbstractEntity> {
	private DAOCombustivelCliente daoCombustivelCliente;

	public ControllerCombustivelCliente() {
		daoCombustivelCliente = DAOCombustivelCliente.getInstance();
	}

	public void inserir(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.persist(combustivelCliente);
	}

	public void atualizar(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.merge(combustivelCliente);
	}

	public void remover(CombustivelCliente t) {
		daoCombustivelCliente.remove(t);
	}

	public void removerPorId(Long id, CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.removeById(id, daoCombustivelCliente.getClass());
	}

	public CombustivelCliente consultarPorId(Long id, Class c) {
		return daoCombustivelCliente.getById(id, c);
	}

	public List<CombustivelCliente> consultarTodos() {
		return daoCombustivelCliente.findAll();
	}
	
	public void ativaTriggerCartaoFidelidade() {
		PersistCombustivelCliente psc = new PersistCombustivelCliente();
		psc.mockarValoresTriggerCartaoFidelidade();
	}
	
//	SELECTS

	public List<CombustivelDTO> combustiveisMaisVendidos() {
		List<Object[]> resultList = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("select c.nomeCombustivel, count(c.id) QtdVendas from combustivelcliente ccl "
						+ "inner join combustivel c " + "on ccl.combustivel = c.id " + "group by c.nomeCombustivel " +
								"order by count(combustivel) desc;")
				.getResultList();
		List<CombustivelDTO> list = new ArrayList<>();
		for (Object[] obj : resultList) {
			CombustivelDTO c = new CombustivelDTO();
			c.setNomeCombustivel((String) obj[0]);
			c.setQtdVendas((BigInteger) obj[1]);
			list.add(c);
		}
		return list;
	}

	public List<LucroValorDTO> lucroBrutoValorMedioPorMes() {
		List<Object[]> resultList = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("SELECT DATE_FORMAT(data, '%Y/%m') as Data,"
						+ " SUM(valorTotal) as LucroCombustivel, "
						+ "truncate(SUM(valorTotal)/SUM(Litro), 2) AS valorMedioCombustivel "
						+ "FROM combustivelcliente " + "WHERE DATE(data) " + "group by DATE_FORMAT(data, '%Y/%m');")
				.getResultList();

		List<LucroValorDTO> lista = new ArrayList<>();
		for (Object[] o : resultList) {
			LucroValorDTO lv = new LucroValorDTO();
			lv.setData((String) o[0]);
			lv.setLucro((double) o[1]);
			lv.setValorMedio((double) o[2]);
			lista.add(lv);
		}

		return lista;
	}

	public List<HorarioPicoDTO> horarioPicoQtdAbastecimento() {
		List<Object[]> resultList = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("SELECT sum(litro) as QtdCombustivel, data as Pico, c.nomeCombustivel "
						+ "FROM Fornecimento F " + "inner join combustivel c " + "on f.combustivel = c.id "
						+ "WHERE DATE(data) " + "group by  data " + "order by sum(litro) desc;")
				.getResultList();

		List<HorarioPicoDTO> list = new ArrayList<>();

		for (Object[] obj : resultList) {
			HorarioPicoDTO h = new HorarioPicoDTO();
			h.setQtdGasolina((double) obj[0]);
			h.setDataPico((Timestamp) obj[1]);
			h.setNomeCombustivel((String) obj[2]);
			list.add(h);
		}

		System.out.println(list);

		return list;

	}

	public List<ClienteFidelidadeDTO> consumoClienteFidelidade() {
		List<Object[]> resultList = daoCombustivelCliente.getEntityManager()
				.createNativeQuery(
						"select c.nome, c.cpf, c.cnpj, cf.numeroCartao, truncate((clc.valorTotal),2) as Compras_total "
								+ "from cliente c " + "inner join combustivelcliente clc " + "on c.id = clc.cliente "
								+ "inner join cartaofidelidade cf " + "on c.cartao = cf.id " + "group by cliente "
								+ "order by truncate((clc.valorTotal),2) desc;")
				.getResultList();

		List<ClienteFidelidadeDTO> list = new ArrayList<>();

		for (Object[] obj : resultList) {
			ClienteFidelidadeDTO clf = new ClienteFidelidadeDTO();
			clf.setNomeCliente((String) obj[0]);
			clf.setCpfCliente((String) obj[1]);
			clf.setCnpjCliente((String) obj[2]);
			clf.setNumeroCartao((String) obj[3]);
			clf.setConsumo((double) obj[4]);
			list.add(clf);
		}

		System.out.println(list);
		return list;

	}

//	PROCEDURES

	public List<TotalVendaCombustivelDTO> rankingTotalValorCombustivel(String anoMes) {

		List<Object[]> query = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("call TotalVenda(:data_escolhida)").setParameter("data_escolhida", anoMes)
				.getResultList();

		List<TotalVendaCombustivelDTO> lista = new ArrayList<>();

		for (Object[] obj : query) {
			TotalVendaCombustivelDTO tvc = new TotalVendaCombustivelDTO();
			tvc.setValorTotal((double) obj[0]);
			tvc.setNomeCombustivel((String) obj[1]);
			tvc.setData((String) obj[2]);
			lista.add(tvc);
		}

		System.out.println(lista);

		return lista;
	}

	public List<FuncionarioDTO> topFuncionarios(String anoMes) {
		List<Object[]> query = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("call topFuncionarios(:data_escolhida)").setParameter("data_escolhida", anoMes)
				.getResultList();

		List<FuncionarioDTO> lista = new ArrayList<>();

		for (Object[] obj : query) {
			FuncionarioDTO f = new FuncionarioDTO();
			f.setNomeFuncionario((String) obj[0]);
			f.setCpf((String) obj[1]);
			f.setCnpj((String) obj[2]);
			f.setValorTotal((double) obj[3]);
			lista.add(f);
		}
		return lista;
	}

}
