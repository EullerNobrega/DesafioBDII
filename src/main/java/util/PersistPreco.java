package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerPreco;
import model.Preco;

public class PersistPreco implements persistEntity {
	private ControllerPreco<Preco> controllerPreco = new ControllerPreco<Preco>();

	public void persistMock() {
		List<Preco> list = new ArrayList<Preco>();

		list.add(new Preco(3.22));
		list.add(new Preco(3.52));
		list.add(new Preco(3.22));
		list.add(new Preco(3.26));
		list.add(new Preco(3.40));
		list.add(new Preco(3.75));
		list.add(new Preco(3.56));
		list.add(new Preco(3.14));
		list.add(new Preco(3.54));
		list.add(new Preco(3.39));
		list.add(new Preco(3.61));

		for (Preco p : list) {
			controllerPreco.inserir(p);
		}

	}

}
