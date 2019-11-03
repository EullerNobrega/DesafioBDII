package controller;

import java.util.List;

import dao.DAOPostoCombustivel;
import model.AbstractEntity;
import model.PostoCombustivel;

public class ControllerPostoCombustivel<T extends AbstractEntity> {
	private DAOPostoCombustivel daoPostoCombustivel;

	public ControllerPostoCombustivel() {
		daoPostoCombustivel = DAOPostoCombustivel.getInstance();
	}

	public void inserir(PostoCombustivel postoCombustivel) {
		daoPostoCombustivel.persist(postoCombustivel);
	}

	public void atualizar(PostoCombustivel postoCombustivel) {
		daoPostoCombustivel.merge(postoCombustivel);
	}

	public void remover(PostoCombustivel t) {
		daoPostoCombustivel.remove(t);
	}

	public void removerPorId(Long id, PostoCombustivel postoCombustivel) {
		daoPostoCombustivel.removeById(id, postoCombustivel.getClass());
	}

	public PostoCombustivel consultarPorId(Long id, Class c) {
		return daoPostoCombustivel.getById(id, c);
	}

	public List<PostoCombustivel> consultarTodos() {
		return daoPostoCombustivel.findAll();
	}

}
