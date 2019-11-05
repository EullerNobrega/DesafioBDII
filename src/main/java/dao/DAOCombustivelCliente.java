package dao;

import model.CombustivelCliente;

public class DAOCombustivelCliente extends DAOGenericoJPA<CombustivelCliente> {
	private static DAOCombustivelCliente instance;

	public static DAOCombustivelCliente getInstance() {

		if (instance == null) {
			instance = new DAOCombustivelCliente();
		}
		return instance;

	}
}
