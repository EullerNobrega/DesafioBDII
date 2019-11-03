package dao;

import model.PostoCombustivel;

public class DAOPostoCombustivel extends DAOGenericoJPA<PostoCombustivel> {
	private static DAOPostoCombustivel instance;

	public static DAOPostoCombustivel getInstance() {

		if (instance == null) {
			instance = new DAOPostoCombustivel();
		}
		return instance;

	}
}
