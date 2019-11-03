package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import model.Combustivel;

public class PersistCombustivel implements persistEntity {
	private ControllerCombustivel<Combustivel> controllerCombustivel = new ControllerCombustivel<Combustivel>();

	public void persistMock() {
		List<Combustivel> list = new ArrayList<Combustivel>();

		list.add(new Combustivel("Gasolina"));
		list.add(new Combustivel("Gasolina Aditivada"));
		list.add(new Combustivel("Etanol"));
		list.add(new Combustivel("GNV"));
		list.add(new Combustivel("Diesel"));

		for (Combustivel c : list) {
			controllerCombustivel.inserir(c);
		}
	}

}
