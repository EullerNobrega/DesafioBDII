package controller;

import java.util.List;

import dao.DAOGrantsSecurity;
import model.dto.Grants;

public class ControllerGrantsSecurity {
	DAOGrantsSecurity daoGrantsSecurity = new DAOGrantsSecurity();

	public List<String> showTables() {
		return daoGrantsSecurity.showTables();
	}

	public void configurarGrants(List<String> tablesFrentista, List<String> tablesGerente,
			List<String> permissoesFrentista, List<String> permissoesGerente) {
		Grants g = new Grants(permissoesFrentista, permissoesGerente, tablesFrentista, tablesGerente);
		this.daoGrantsSecurity.inserirPermissoes(g);
	}

}
