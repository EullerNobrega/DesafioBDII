package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCartaoFidelidade;
import dao.DAOGenericoJPA;
import model.CartaoFidelidade;

public class PersistCartaoFidelidade implements persistEntity {
	private ControllerCartaoFidelidade<CartaoFidelidade> controllerCartaoFidelidade = new ControllerCartaoFidelidade<CartaoFidelidade>();

	public void persistMock() {
		List<CartaoFidelidade> list = new ArrayList<CartaoFidelidade>();
		list.add(new CartaoFidelidade("4521274934"));
		list.add(new CartaoFidelidade("7045490937"));
		list.add(new CartaoFidelidade("2144551770"));
		list.add(new CartaoFidelidade("4397224956"));
		list.add(new CartaoFidelidade("3080543237"));
		list.add(new CartaoFidelidade("1961753359"));

		for (CartaoFidelidade cf : list) {
			System.out.println(cf);
			controllerCartaoFidelidade.inserir(cf);
		}

	}

}
