package model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class CombustivelPreco extends AbstractEntity{
	@NotNull
	private Date data;
	
//	Getters & Setters

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
