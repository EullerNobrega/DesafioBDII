package controller;

import java.util.ArrayList;
import java.util.List;

import dao.DAOFornecimento;
import model.AbstractEntity;
import model.Fornecimento;
import model.dto.FornecedorDTO;

public class ControllerFornecimento<T extends AbstractEntity> {
	private DAOFornecimento daoFornecimento;

	public ControllerFornecimento() {
		daoFornecimento = DAOFornecimento.getInstance();
	}

	public void inserir(Fornecimento fornecimento) {
		daoFornecimento.persist(fornecimento);
	}

	public void atualizar(Fornecimento fornecimento) {
		daoFornecimento.merge(fornecimento);
	}

	public void remover(Fornecimento t) {
		daoFornecimento.remove(t);
	}

	public void removerPorId(Long id, Fornecimento fornecimento) {
		daoFornecimento.removeById(id, fornecimento.getClass());
	}

	public void consultarPorId(Fornecimento fornecimento) {
		daoFornecimento.getById(fornecimento.getId(), fornecimento.getClass());
	}

	public List<Fornecimento> consultarTodos() {
		return daoFornecimento.findAll();
	}

	public List<FornecedorDTO> rankingFornecedorMaisBarato() {

		List<Object[]> resultList = daoFornecimento.getEntityManager()
				.createNativeQuery("select DATE_FORMAT(data, '%Y/%m') as Data, f.nomeFantasia as Fornecedor,"
						+ " truncate(fct.valor,2) as PrecoTotal from fornecimento fct " + "inner join fornecedor f "
						+ "on fct.fornecedor = f.id " + "group by  fornecedor " + "order by fct.valor asc;")
				.getResultList();
		List<FornecedorDTO> list = new ArrayList<>();
		for (Object[] obj : resultList) {
			FornecedorDTO f = new FornecedorDTO();
			f.setData((String) obj[0]);
			f.setNomeFantasia((String) obj[1]);
			f.setValor((double) obj[2]);
			list.add(f);
		}
		
		return list;

	}

}
