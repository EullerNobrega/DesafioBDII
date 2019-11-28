package dao;

import controller.ControllerPosto;
import model.CombustivelCliente;
import model.Fornecimento;
import model.Posto;

public class DAOFornecimento extends DAOGenericoJPA<Fornecimento> {
	private static DAOFornecimento instance;

	public static DAOFornecimento getInstance() {

		if (instance == null) {
			instance = new DAOFornecimento();
		}
		return instance;

	}

	public void insertTransactionFrPost(Fornecimento fr) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(fr);
			Posto p = selectPos((long) 1);
			p.setCaixa(p.getCaixa() - fr.getValor());
			entityManager.merge(p);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		}

	}

	private Posto selectPos(Long id) {
		ControllerPosto<Posto> controllerPosto = new ControllerPosto<Posto>();
		return controllerPosto.consultarPorId(id, Posto.class);
	}
}
