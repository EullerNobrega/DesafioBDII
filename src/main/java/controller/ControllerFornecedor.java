package controller;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.ScrollableResults;

import dao.DAOFornecedor;
import model.AbstractEntity;
import model.Fornecedor;
import model.Fornecimento;

public class ControllerFornecedor<T extends AbstractEntity> {
	private DAOFornecedor daoFornecedor;
	private Query createNativeQuery;

	public ControllerFornecedor() {
		daoFornecedor = DAOFornecedor.getInstance();
	}

	public void inserir(Fornecedor fornecedor) {
		daoFornecedor.persist(fornecedor);
	}

	public void atualizar(Fornecedor fornecedor) {
		daoFornecedor.merge(fornecedor);
	}

	public void remover(Fornecedor t) {
		daoFornecedor.remove(t);
	}

	public void removerPorId(Long id, Fornecedor fornecedor) {
		daoFornecedor.removeById(id, fornecedor.getClass());
	}

	public Fornecedor consultarPorId(Long id, Class c) {
		return daoFornecedor.getById(id, c);
	}

	public List<Fornecedor> consultarTodos() {
		return daoFornecedor.findAll();
	}

	public List<Fornecedor> Ranking() {

		 Query createNativeQuery = daoFornecedor.getEntityManager()
				.createNativeQuery("SELECT F.NOMEFANTASIA,F.CNPJ, "
						+ "C.NOMECOMBUSTIVEL,MAX(FORNECIMENTO.VALOR)AS VALOR "
						+ "FROM FORNECIMENTO INNER JOIN FORNECEDOR F ON FORNECIMENTO.FORNECEDOR_ID = F.ID "
						+ "INNER JOIN COMBUSTIVEL C ON FORNECIMENTO.COMBUSTIVEL_ID = C.ID "
						+ "ORDER BY VALOR DESC ");

		System.out.println(createNativeQuery.getSingleResult().toString());
//		List<Fornecedor> fornecedores = (List<Fornecedor>) query.getResultList();
		return null;

//		 = session.createSQLQuery("CALL top_veiculo()").scroll(ScrollMode.SCROLL_INSENSITIVE);
//		while(scResults.next()) {
//			Object[] row= scResults.get();
//			System.out.println(row[0]+", "+ row[1]+", "+ row[2]+", "+row[3]);
	}

}
