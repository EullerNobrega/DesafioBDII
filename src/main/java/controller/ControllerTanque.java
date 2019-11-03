package controller;

import java.util.List;

import dao.DAOTanque;
import model.AbstractEntity;
import model.Tanque;

public class ControllerTanque<T extends AbstractEntity> {
	private DAOTanque daoTanque;

	public ControllerTanque() {
		daoTanque = DAOTanque.getInstance();
	}

	public void inserir(Tanque tanque) {
		daoTanque.persist(tanque);
	}

	public void atualizar(Tanque tanque) {
		daoTanque.merge(tanque);
	}

	public void remover(Tanque t) {
		daoTanque.remove(t);
	}

	public void removerPorId(Long id, Tanque tanque) {
		daoTanque.removeById(id, tanque.getClass());
	}

	public void consultarPorId(Tanque tanque) {
		daoTanque.getById(tanque.getId(), tanque.getClass());
	}

	public List<Tanque> consultarTodos() {
		return daoTanque.findAll();
	}

}
