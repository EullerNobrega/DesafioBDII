package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivelPreco;
import model.CombustivelPreco;

public class PersistCombustivelPreco implements persistEntity {
	private ControllerCombustivelPreco<CombustivelPreco> controllerCombustivelPreco = new ControllerCombustivelPreco<CombustivelPreco>();

	public void persistMock() {
		List<CombustivelPreco> list = new ArrayList<CombustivelPreco>();
		
		for (CombustivelPreco cp : list) {
			controllerCombustivelPreco.inserir(cp);
		}

	}

}
