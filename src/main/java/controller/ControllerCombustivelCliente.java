package controller;

import java.util.List;

import javax.persistence.Query;

import dao.DAOCombustivelCliente;
import model.AbstractEntity;
import model.Combustivel;
import model.CombustivelCliente;
import model.LucroValor;

public class ControllerCombustivelCliente<T extends AbstractEntity> {
	private DAOCombustivelCliente daoCombustivelCliente;

	public ControllerCombustivelCliente() {
		daoCombustivelCliente = DAOCombustivelCliente.getInstance();
	}

	public void inserir(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.persist(combustivelCliente);
	}

	public void atualizar(CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.merge(combustivelCliente);
	}

	public void remover(CombustivelCliente t) {
		daoCombustivelCliente.remove(t);
	}

	public void removerPorId(Long id, CombustivelCliente combustivelCliente) {
		daoCombustivelCliente.removeById(id, daoCombustivelCliente.getClass());
	}

	public CombustivelCliente consultarPorId(Long id, Class c) {
		return daoCombustivelCliente.getById(id, c);
	}

	public List<CombustivelCliente> consultarTodos() {
		return daoCombustivelCliente.findAll();
	}

	public class DTO {
		int max;
		Combustivel c;

	}
	
//	SELECTS

	public Combustivel maisVendido() {
		Query createQuery = daoCombustivelCliente.getEntityManager()
				.createQuery("SELECT count(CL.id), combustivel FROM CombustivelCliente CL group by combustivel");
		List<Object[]> resultList = createQuery.getResultList();

		Combustivel maior = new Combustivel();
		maior.setTotalVendas(0);

		for (Object[] o : resultList) {
			Combustivel c = (Combustivel) o[1];
			c.setTotalVendas((long) o[0]);

			if (c.getTotalVendas() > maior.getTotalVendas()) {
				maior = c;
			}

		}
		System.out.println(maior);

		return maior;

	}
	
	public LucroValor lucroBrutoValorMedio() {
		Query createQuery = daoCombustivelCliente.getEntityManager().createQuery("SELECT SUM(valorTotal), SUM(valorTotal)/SUM(litro) FROM "
				+ "CombustivelCliente CL where data < current_date()");
		List<Object[]> resultList = createQuery.getResultList();
		
		for(Object[] o : resultList) {
			LucroValor lv = new LucroValor();
			lv.setLucro((double) o[0]) ;
			lv.setValorMedio((double) o[1]);
			System.out.println(lv);
		}
		
		return null;
	}
	
////	PROCEDURES
//	
//		public CombustivelCliente VendaAcumulada () {
////			StoredProcedureParameter storedProcedureParameter = (StoredProcedureParameter) daoCombustivelCliente.
////					getEntityManager().createStoredProcedureQuery("")
////					.setParameter(0, new Object()).getResultList();
//			
//			
//			return null;
//		}
//	

}
