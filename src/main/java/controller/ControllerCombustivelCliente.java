package controller;

import java.util.List;

import javax.persistence.Query;

import dao.DAOCombustivelCliente;
import model.AbstractEntity;
import model.Combustivel;
import model.CombustivelCliente;

public class ControllerCombustivelCliente<T extends AbstractEntity> {
	private DAOCombustivelCliente daoCombustivelCliente;

	public ControllerCombustivelCliente() {
		daoCombustivelCliente = DAOCombustivelCliente.getInstance();
	}

	public void inserir(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.persist(combustivelCliente);
	}

	public void atualizar(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.merge(combustivelCliente);
	}

	public void remover(CombustivelCliente t) {
		daoCombustivelCliente.remove(t);
	}

	public void removerPorId(Long id, CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.removeById(id, daoCombustivelCliente.getClass());
	}

	public CombustivelCliente consultarPorId(Long id, Class c) {
		return daoCombustivelCliente.getById(id, c);
	}

	public List<CombustivelCliente> consultarTodos() {
		return daoCombustivelCliente.findAll();
	}
	
	private  class CombustivelQTD {
		Combustivel c;
		int qtd;
	}

	public void maisVendido() {
		List<CombustivelCliente> list;
		Query createQuery = daoCombustivelCliente.getEntityManager().
				createQuery("SELECT CL FROM CombustivelCliente CL");
		list = createQuery.getResultList();
		
		
		
		List<CombustivelQTD> listCQtd;
		
		for(CombustivelCliente c : list) {
			if(FindGasolina(c)) {
				
			}
		}
		
	}
	
	private boolean FindGasolina(CombustivelCliente comb) {
		for(CombustivelCliente c : listCQtd) {
			comb.
		}
	}

}
