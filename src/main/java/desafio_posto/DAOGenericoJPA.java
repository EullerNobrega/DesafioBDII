package desafio_posto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DAOGenericoJPA<T> {

	private static DAOGenericoJPA instance;
	protected EntityManager entityManager;

	public static DAOGenericoJPA getInstance() {

		if (instance == null) {
			instance = new DAOGenericoJPA();
		}
		return instance;
	}

	private EntityManager getEntityManager() {

		EntityManegeFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");

		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public T getById(final int id) {
		return entityManager.find(T.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("FROM" + T.class.getName()).getResultList();

	}

	public void persist(T t) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(t);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void merge(T t) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(t);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void remove(T t) {
		try {
			entityManager.getTransaction().begin();
			t = entityManager.find(T.class,t.getId());
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void removeById(final int id) {
		try {
			T t = getById(id);
			remove(t);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
