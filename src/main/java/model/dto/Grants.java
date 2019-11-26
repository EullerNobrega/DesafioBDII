package model.dto;

import java.util.List;

import model.AbstractEntity;

public class Grants extends AbstractEntity {
	private List<String> permissoesFrentista;
	private List<String> permissoesGerente;
	private List<String> tablesFrentista;
	private List<String> tablesGerente;

	public Grants(List<String> permissoesFrentista, List<String> permissoesGerente, List<String> tablesFrentista,
			List<String> tablesGerente) {
		super();
		this.permissoesFrentista = permissoesFrentista;
		this.permissoesGerente = permissoesGerente;
		this.tablesFrentista = tablesFrentista;
		this.tablesGerente = tablesGerente;
	}

	public List<String> getPermissoesFrentista() {
		return permissoesFrentista;
	}

	public void setPermissoesFrentista(List<String> permissoesFrentista) {
		this.permissoesFrentista = permissoesFrentista;
	}

	public List<String> getPermissoesGerente() {
		return permissoesGerente;
	}

	public void setPermissoesGerente(List<String> permissoesGerente) {
		this.permissoesGerente = permissoesGerente;
	}

	public List<String> getTablesFrentista() {
		return tablesFrentista;
	}

	public void setTablesFrentista(List<String> tablesFrentista) {
		this.tablesFrentista = tablesFrentista;
	}

	public List<String> getTablesGerente() {
		return tablesGerente;
	}

	public void setTablesGerente(List<String> tablesGerente) {
		this.tablesGerente = tablesGerente;
	}

}
