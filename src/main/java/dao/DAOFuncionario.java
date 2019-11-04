package dao;

import model.Funcionario;


public class DAOFuncionario extends DAOGenericoJPA<Funcionario> {
	private static DAOFuncionario instance;

	public static DAOFuncionario getInstance() {

		if (instance == null) {
			instance = new DAOFuncionario();
		}
		return instance;

	}
}
