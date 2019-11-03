package controller;

import java.util.List;

import dao.DAOCombustivelPreco;
import model.AbstractEntity;
import model.CombustivelPreco;

public class ControllerCombustivelPreco<T extends AbstractEntity> {
	private DAOCombustivelPreco daoCombustivelPreco;

	public ControllerCombustivelPreco() {
		daoCombustivelPreco = DAOCombustivelPreco.getInstance();
	}

	public void inserir(CombustivelPreco combustivelPreco) {
		daoCombustivelPreco.persist(combustivelPreco);
	}

	public void atualizar(CombustivelPreco combustivelPreco) {
		daoCombustivelPreco.merge(combustivelPreco);
	}

	public void remover(CombustivelPreco t) {
		daoCombustivelPreco.remove(t);
	}

	public void removerPorId(Long id, CombustivelPreco combustivelPreco) {
		daoCombustivelPreco.removeById(id, combustivelPreco.getClass());
	}

	public CombustivelPreco consultarPorId(Long id, Class c) {
		return daoCombustivelPreco.getById(id, c);
	}

	public List<CombustivelPreco> consultarTodos() {
		return daoCombustivelPreco.findAll();
	}

}
