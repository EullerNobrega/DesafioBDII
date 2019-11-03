package controller;

import java.util.List;

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

}
