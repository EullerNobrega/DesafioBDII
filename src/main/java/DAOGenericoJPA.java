

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class DAOGenericoJPA<T extends AbstractEntity> {

	private static DAOGenericoJPA<?> instance;
	@PersistenceContext(unitName = "teste")
	protected EntityManager entityManager;

	public static DAOGenericoJPA getInstance() {

		if (instance == null) {
			instance = new DAOGenericoJPA();
		}
		return instance;
	}
	
	public DAOGenericoJPA(){
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("desafio_posto");

		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public T getById(Long id, Class c) {
		return (T) entityManager.find(c, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("FROM" + toString().getClass().getName()).getResultList();

	}

	public void persist(T t) {
		try {
			System.out.println("Persist: " + t);
			entityManager.getTransaction().begin();
			entityManager.persist(t);
			System.out.println("Ok");
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
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void remove(T t) {
		try {
			entityManager.getTransaction().begin();
			t = (T) entityManager.find(t.getClass(), t.getId());
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(Long id, Class c) {
		try {
			T t = getById(id, c);
			remove(t);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
