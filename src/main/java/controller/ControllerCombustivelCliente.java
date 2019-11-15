package controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import dao.DAOCombustivelCliente;
import model.AbstractEntity;
import model.CombustivelCliente;
import model.dto.CombustivelDTO;
import model.dto.HorarioPicoDTO;
import model.dto.LucroValorDTO;
import model.dto.TotalVendaCombustivelDTO;

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

//	SELECTS

	public List<CombustivelDTO> combustiveisMaisVendidos() {
		List<Object[]> resultList = daoCombustivelCliente.getEntityManager()
				.createNativeQuery("select c.nomeCombustivel, count(c.id) QtdVendas from combustivelcliente ccl " + 
						"inner join combustivel c " + 
						"on ccl.combustivel = c.id " + 
						"group by c.nomeCombustivel;").getResultList();
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
	
	public HorarioPicoDTO horarioPicoQtdAbastecimento() {
		
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
		

		return lista;
	}

}
