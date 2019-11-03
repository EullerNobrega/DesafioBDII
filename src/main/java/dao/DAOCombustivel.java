package dao;

import model.Combustivel;

public class DAOCombustivel extends DAOGenericoJPA<Combustivel> {
	private static DAOCombustivel instance;

	public static DAOCombustivel getInstance() {

		if (instance == null) {
			instance = new DAOCombustivel();
		}
		return instance;

	}
}
