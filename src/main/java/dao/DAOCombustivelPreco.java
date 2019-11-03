package dao;

import model.CombustivelPreco;

public class DAOCombustivelPreco extends DAOGenericoJPA<CombustivelPreco> {
	private static DAOCombustivelPreco instance;

	public static DAOCombustivelPreco getInstance() {

		if (instance == null) {
			instance = new DAOCombustivelPreco();
		}
		return instance;

	}
}
