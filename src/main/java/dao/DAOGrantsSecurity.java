package dao;

import java.util.ArrayList;
import java.util.List;

import model.dto.Grants;

public class DAOGrantsSecurity extends DAOGenericoJPA<Grants>{
	
	public List<String> showTables() {
		List<String> resultList = this.getEntityManager().createNativeQuery("show tables").getResultList();
		
		List<String> list = new ArrayList<>();
		for (String obj : resultList) {
			String s = obj;
			list.add(s);
		}
		System.out.println(list);
		
		return list;
	}
	
	public void inserirPermissoes(Grants g) {
		this.getEntityManager().createNativeQuery("create user gerente; grant " + g.getPermissoesGerente() + 
				"on " + g.getTablesGerente() +  
				" to gerente; create user frentista; grant " + g.getPermissoesFrentista() +  
				" on " + g.getTablesGerente() +  
				" to gerente;");
	}
	
}
