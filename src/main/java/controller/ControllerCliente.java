package controller;

import java.util.List;

import dao.DAOCliente;
import model.AbstractEntity;
import model.Cliente;

public class ControllerCliente<T extends AbstractEntity> {
	private DAOCliente daoCliente;

	public ControllerCliente() {
		daoCliente = DAOCliente.getInstance();
	}

	public void inserir(Cliente cliente) {
		daoCliente.persist(cliente);
	}

	public void atualizar(Cliente cliente) {
		daoCliente.merge(cliente);
	}

	public void remover(Cliente t) {
		daoCliente.remove(t);
	}

	public void removerPorId(Long id, Cliente cliente) {
		daoCliente.removeById(id, cliente.getClass());
	}

	public Cliente consultarPorId(Long id, Class c) {
		return daoCliente.getById(id, c);
	}

	public List<Cliente> consultarTodos() {
		return daoCliente.findAll();
	}

}
