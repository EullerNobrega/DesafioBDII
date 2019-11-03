package controller;

import java.util.List;

import dao.DAOEndereco;
import model.AbstractEntity;
import model.Endereco;

public class ControllerEndereco<T extends AbstractEntity> {
	private DAOEndereco daoEndereco;

	public ControllerEndereco() {
		daoEndereco = DAOEndereco.getInstance();
	}

	public void inserir(Endereco endereco) {
		daoEndereco.persist(endereco);
	}

	public void atualizar(Endereco endereco) {
		daoEndereco.merge(endereco);
	}

	public void remover(Endereco t) {
		daoEndereco.remove(t);
	}

	public void removerPorId(Long id, Endereco endereco) {
		daoEndereco.removeById(id, endereco.getClass());
	}

	public Endereco consultarPorId(Long id) {
		return daoEndereco.getById(id, Endereco.class);
	}

	public List<Endereco> consultarTodos() {
		return daoEndereco.findAll();
	}

}
