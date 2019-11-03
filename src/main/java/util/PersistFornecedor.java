package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import controller.ControllerFornecedor;
import model.Combustivel;
import model.Fornecedor;

public class PersistFornecedor implements persistEntity {
	private ControllerFornecedor<Fornecedor> controllerFornecedor = new ControllerFornecedor<Fornecedor>();
	
	public void persistMock() {

		List<Combustivel> lc = select();
		List<Fornecedor> lista = new ArrayList<Fornecedor>();

		lista.add(new Fornecedor("PETROBRAS DISTRIBUIDORA SA", "BR Distribuidora", "18.689.555/0001-58", lc));
		lista.add(new Fornecedor("Ipiranga Produtos de Petróleo S.A", "Ipiranga", "64.749.619/0001-86", lc));
		lista.add(new Fornecedor("AleSat Combustíveis S/A ", "Ale", "03.468.375/0001-79", lc));
		lista.add(new Fornecedor("Shell Brasil Ltda", "Shell", "29.536.672/0001-06", lc));
		lista.add(new Fornecedor("Esso Brasileira de Petróleo Ltda", "Esso", "48.229.096/0001-90", lc));
		
		for(Fornecedor f : lista) {
			controllerFornecedor.inserir(f);
		}
	}

	private List<Combustivel> select() {
		List<Combustivel> lista;
		ControllerCombustivel<Combustivel> cCombustivel = new ControllerCombustivel<Combustivel>();
		lista = cCombustivel.consultarTodos();
		return lista;
	}

}
