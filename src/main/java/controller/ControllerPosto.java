package controller;

import java.util.List;

import dao.DAOPosto;
import model.AbstractEntity;
import model.Posto;

public class ControllerPosto<T extends AbstractEntity> {
	private DAOPosto daoPosto;

	public ControllerPosto() {
		daoPosto = DAOPosto.getInstance();
	}

	public void inserir(Posto posto) {
		daoPosto.persist(posto);
	}

	public void atualizar(Posto posto) {
		daoPosto.merge(posto);
	}

	public void remover(Posto t) {
		daoPosto.remove(t);
	}

	public void removerPorId(Long id, Posto posto) {
		daoPosto.removeById(id, posto.getClass());
	}

	public Posto consultarPorId(Long id, Class c) {
		return daoPosto.getById(id, c);
	}

	public List<Posto> consultarTodos() {
		return daoPosto.findAll();
	}

}
