package dao;

import controller.ControllerPosto;
import model.CombustivelCliente;
import model.Posto;

public class DAOCombustivelCliente extends DAOGenericoJPA<CombustivelCliente> {
	private static DAOCombustivelCliente instance;

	public static DAOCombustivelCliente getInstance() {

		if (instance == null) {
			instance = new DAOCombustivelCliente();
		}
		return instance;

	}

	public void insertTransactionCclPost(CombustivelCliente ccl) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(ccl);
			Posto p = selectPos((long) 1);
			p.setCaixa(p.getCaixa() + ccl.getValorTotal());
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
