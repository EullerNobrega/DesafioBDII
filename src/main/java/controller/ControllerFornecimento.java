package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.persistence.Query;

import dao.DAOFornecimento;
import model.AbstractEntity;
import model.Fornecimento;

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

	public List<Fornecimento> rankingCombustivel() {

		Query createQuery = daoFornecimento.getEntityManager()
				.createQuery("SELECT f " + "FROM Fornecimento f " + "ORDER BY f.valor desc");

		List<Fornecimento> Fornecimento = createQuery.getResultList();

		for (Fornecimento f : Fornecimento) {
			System.out.println(f);
		}
		return Fornecimento;

	}
	
	public List<Fornecimento> rankingAbstecimentoHora() {
		Query createQuery = daoFornecimento.getEntityManager()
				.createQuery("SELECT f, SUM(litro) FROM Fornecimento f where data < current_date() group by data order by SUM(litro) asc");
		
		List<Object[]> resultList = createQuery.getResultList();
		List<Fornecimento> retorno = new ArrayList<Fornecimento>();
		
		for (Object[] objects : resultList) {
			Fornecimento f = (Fornecimento)objects[0];
			f.setSomaLitros((double) objects[1]);
			retorno.add(f);
		}
		
		System.out.println(retorno);
		
		return retorno;
		
	}
	

}
