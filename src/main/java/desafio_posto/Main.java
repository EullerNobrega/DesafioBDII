package desafio_posto;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Euller", "4454684");
		
		DAOGenericoJPA<Pessoa> daoP = DAOGenericoJPA.getInstance();
		System.out.println(p);
		System.out.println(daoP);
		daoP.persist(p);
	}

}
