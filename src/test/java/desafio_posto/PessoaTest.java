package desafio_posto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaTest {
	private void psvm() {
		Pessoa p = new Pessoa();
		p.setNome("Euller");
		p.setCpf("7045154691");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");	
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
