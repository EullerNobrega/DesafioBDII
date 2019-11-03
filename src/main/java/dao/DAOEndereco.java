package dao;

import model.Endereco;

public class DAOEndereco extends DAOGenericoJPA<Endereco> {
	private static DAOEndereco instance;

	public static DAOEndereco getInstance() {

		if (instance == null) {
			instance = new DAOEndereco();
		}
		return instance;

	}
}
