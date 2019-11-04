package controller;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dao.DAOFornecedor;
import model.AbstractEntity;
import model.Fornecedor;
import model.Fornecimento;

public class ControllerFornecedor<T extends AbstractEntity> {
	private DAOFornecedor daoFornecedor;

	public ControllerFornecedor() {
		daoFornecedor = DAOFornecedor.getInstance();
	}

	public void inserir(Fornecedor fornecedor) {
		daoFornecedor.persist(fornecedor);
	}

	public void atualizar(Fornecedor fornecedor) {
		daoFornecedor.merge(fornecedor);
	}

	public void remover(Fornecedor t) {
		daoFornecedor.remove(t);
	}

	public void removerPorId(Long id, Fornecedor fornecedor) {
		daoFornecedor.removeById(id, fornecedor.getClass());
	}

	public Fornecedor consultarPorId(Long id, Class c) {
		return daoFornecedor.getById(id, c);
	}

	public List<Fornecedor> consultarTodos() {
		return daoFornecedor.findAll();
	}

}
