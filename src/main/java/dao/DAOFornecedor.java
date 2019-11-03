package dao;

import model.Fornecedor;

public class DAOFornecedor extends DAOGenericoJPA<Fornecedor> {

	private static DAOFornecedor instance;

	public static DAOFornecedor getInstance() {

		if (instance == null) {
			instance = new DAOFornecedor();
		}
		return instance;

	}
}
