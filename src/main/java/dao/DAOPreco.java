package dao;

import model.Preco;

public class DAOPreco extends DAOGenericoJPA<Preco> {
	private static DAOPreco instance;

	public static DAOPreco getInstance() {

		if (instance == null) {
			instance = new DAOPreco();
		}
		return instance;

	}
}
