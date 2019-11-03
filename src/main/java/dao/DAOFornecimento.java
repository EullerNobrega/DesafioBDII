package dao;

import model.Fornecimento;

public class DAOFornecimento extends DAOGenericoJPA<Fornecimento> {
	private static DAOFornecimento instance;

	public static DAOFornecimento getInstance() {

		if (instance == null) {
			instance = new DAOFornecimento();
		}
		return instance;

	}
}
