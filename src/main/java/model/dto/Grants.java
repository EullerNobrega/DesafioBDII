package model.dto;

import java.util.List;

import model.AbstractEntity;

public class Grants extends AbstractEntity{
	private List<String> tables;
	
	public Grants(List<String> tables) {
		super();
		this.tables = tables;
	}


	public List<String> getTables() {
		return tables;
	}

	public void setTables(List<String> tables) {
		this.tables = tables;
	}

}
