package dao;

import model.Tanque;

public class DAOTanque extends DAOGenericoJPA<Tanque> {
	private static DAOTanque instance;

	public static DAOTanque getInstance() {

		if (instance == null) {
			instance = new DAOTanque();
		}
		return instance;

	}
}
