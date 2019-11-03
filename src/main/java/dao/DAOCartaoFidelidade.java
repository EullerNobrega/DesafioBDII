package dao;

import model.CartaoFidelidade;

public class DAOCartaoFidelidade extends DAOGenericoJPA<CartaoFidelidade> {
	private static DAOCartaoFidelidade instance;

	public static DAOCartaoFidelidade getInstance() {

		if (instance == null) {
			instance = new DAOCartaoFidelidade();
		}
		return instance;

	}
}
