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

	public CartaoFidelidade consultarPorId(Long id) {
		return daoCartaoFidelidade.getById(id, CartaoFidelidade.class);
	}

	public List<CartaoFidelidade> consultarTodos() {
		return daoCartaoFidelidade.findAll();
	}

}
