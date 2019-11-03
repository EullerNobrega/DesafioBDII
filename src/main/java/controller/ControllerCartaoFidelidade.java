package controller;

import java.util.List;

import dao.DAOCartaoFidelidade;
import model.AbstractEntity;
import model.CartaoFidelidade;

public class ControllerCartaoFidelidade<T extends AbstractEntity> {
	private DAOCartaoFidelidade daoCartaoFidelidade;

	public ControllerCartaoFidelidade() {
		daoCartaoFidelidade = DAOCartaoFidelidade.getInstance();
	}

	public void inserir(CartaoFidelidade cartaoFidelidade) {
		daoCartaoFidelidade.persist(cartaoFidelidade);
	}

	public void atualizar(CartaoFidelidade cartaoFidelidade) {
		daoCartaoFidelidade.merge(cartaoFidelidade);
	}

	public void remover(CartaoFidelidade t) {
		daoCartaoFidelidade.remove(t);
	}

	public void removerPorId(Long id, CartaoFidelidade cartaoFidelidade) {
		daoCartaoFidelidade.removeById(id, cartaoFidelidade.getClass());
	}

	public void consultarPorId(CartaoFidelidade cartaoFidelidade) {
		daoCartaoFidelidade.getById(cartaoFidelidade.getId(), cartaoFidelidade.getClass());
	}

	public List<CartaoFidelidade> consultarTodos() {
		return daoCartaoFidelidade.findAll();
	}

}
