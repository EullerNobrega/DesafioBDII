package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import model.AbstractEntity;

public abstract class DAOGenericoJPA<T extends AbstractEntity> {

	@PersistenceContext(unitName = "teste")
	protected EntityManager entityManager;
	private Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	public DAOGenericoJPA() {
		entityManager = getEntityManager();
	}

	public EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");

		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public T getById(Long id, Class c) {
		return (T) entityManager.find(c, id);
	}

	public List<T> findAll() {
		return entityManager.createQuery("from " + persistentClass.getCanonicalName()).getResultList();

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

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	
	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
}
