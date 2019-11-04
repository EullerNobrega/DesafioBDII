package controller;

import java.util.List;

import javax.persistence.Query;

import dao.DAOCombustivel;
import model.AbstractEntity;
import model.CartaoFidelidade;
import model.Combustivel;

public class ControllerCombustivel<T extends AbstractEntity> {
	private DAOCombustivel daoCombustivel;

	public ControllerCombustivel() {
		daoCombustivel = DAOCombustivel.getInstance();
	}

	public void inserir(Combustivel combustivel) {
		daoCombustivel.persist(combustivel);
	}

	public void atualizar(Combustivel combustivel) {
		daoCombustivel.merge(combustivel);
	}

	public void remover(Combustivel t) {
		daoCombustivel.remove(t);
	}

	public void removerPorId(Long id, CartaoFidelidade cartaoFidelidade) {
		daoCombustivel.removeById(id, cartaoFidelidade.getClass());
	}

	public Combustivel consultarPorId(Long id, Class c) {
		return daoCombustivel.getById(id, c);
	}

	public List<Combustivel> consultarTodos() {
		return daoCombustivel.findAll();
	}
	
	public Combustivel maisVendido() {
		Query createQuery = daoCombustivel.getEntityManager().
				createQuery("SELECT C FROM Combustivel C");
		List<Combustivel> combustiveis = createQuery.getResultList();
		System.out.println(combustiveis);
		
		return null;
		
	}

}
