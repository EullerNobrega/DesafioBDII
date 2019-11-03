package controller;

import java.util.List;

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

}
