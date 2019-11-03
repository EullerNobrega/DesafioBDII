package dao;

import model.Cliente;

public class DAOCliente extends DAOGenericoJPA<Cliente> {
	private static DAOCliente instance;

	public static DAOCliente getInstance() {

		if (instance == null) {
			instance = new DAOCliente();
		}
		return instance;

	}
}
