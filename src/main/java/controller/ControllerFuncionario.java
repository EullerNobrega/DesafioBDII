package controller;

import java.util.List;

import dao.DAOFuncionario;
import model.AbstractEntity;
import model.Funcionario;

public class ControllerFuncionario<T extends AbstractEntity> {
	private DAOFuncionario daoFuncionario;

	public ControllerFuncionario() {
		daoFuncionario = DAOFuncionario.getInstance();
	}

	public void inserir(Funcionario funcionario) {
		daoFuncionario.persist(funcionario);
	}

	public void atualizar(Funcionario funcionario) {
		daoFuncionario.merge(funcionario);
	}

	public void remover(Funcionario t) {
		daoFuncionario.remove(t);
	}

	public void removerPorId(Long id, Funcionario funcionario) {
		daoFuncionario.removeById(id, funcionario.getClass());
	}

	public Funcionario consultarPorId(Long id) {
		return daoFuncionario.getById(id, Funcionario.class);
	}

	public List<Funcionario> consultarTodos() {
		return daoFuncionario.findAll();
	}

}
