package dao;

import java.util.ArrayList;
import java.util.List;

import model.dto.Grants;

public class DAOGrantsSecurity extends DAOGenericoJPA<Grants>{
	
	public List<String> configurarGrants() {
		List<String> resultList = this.getEntityManager().createNativeQuery("show tables").getResultList();
		
		List<String> list = new ArrayList<>();
		for (String obj : resultList) {
			String s = obj;
			list.add(s);
		}
		System.out.println(list);
		
		return list;
	}
	
	
}
