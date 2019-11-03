package controller;

import java.util.List;

import dao.DAOPreco;
import model.AbstractEntity;
import model.Preco;

public class ControllerPreco<T extends AbstractEntity> {
	private DAOPreco daoPreco;

	public ControllerPreco() {
		daoPreco = DAOPreco.getInstance();
	}

	public void inserir(Preco preco) {
		daoPreco.persist(preco);
	}

	public void atualizar(Preco preco) {
		daoPreco.merge(preco);
	}

	public void remover(Preco t) {
		daoPreco.remove(t);
	}

	public void removerPorId(Long id, Preco preco) {
		daoPreco.removeById(id, preco.getClass());
	}

	public Preco consultarPorId(Long id, Class c) {
		return daoPreco.getById(id, c);
	}

	public List<Preco> consultarTodos() {
		return daoPreco.findAll();
	}

}
