package controller;

import java.util.ArrayList;
import java.util.List;

import dao.DAOGrantsSecurity;
import model.dto.Grants;

public class ControllerGrantsSecurity {
	DAOGrantsSecurity daoGrantsSecurity = new DAOGrantsSecurity();

	public List<String> showTables() {
		return daoGrantsSecurity.showTables();
	}
	
	public List<String> showPermissions(){
		List<String> permisssions = new ArrayList<>();
		permisssions.add("insert");
		permisssions.add("update");
		permisssions.add("delete");
		permisssions.add("select");
		return permisssions;
	}

	public void configurarGrants(List<String> tablesFrentista, List<String> tablesGerente,
			List<String> permissoesFrentista, List<String> permissoesGerente) {
		Grants g = new Grants(permissoesFrentista, permissoesGerente, tablesFrentista, tablesGerente);
		this.daoGrantsSecurity.inserirPermissoes(g);
	}

}
