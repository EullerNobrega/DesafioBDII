package dao;

import model.Posto;

public class DAOPosto extends DAOGenericoJPA<Posto> {
	private static DAOPosto instance;

	public static DAOPosto getInstance() {

		if (instance == null) {
			instance = new DAOPosto();
		}
		return instance;

	}
}
