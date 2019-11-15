package controller;

import java.util.List;
import javax.persistence.Query;
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
	
	public  List<Cliente> clientesFidelidade(){
		Query createQuery = daoCliente.getEntityManager().createQuery("SELECT C FROM Cliente C WHERE cartao_id is not null");
		List<Cliente> list = createQuery.getResultList();
		System.out.println(list);
		return list;
		
	}

}
