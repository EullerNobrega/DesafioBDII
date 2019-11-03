package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class CombustivelPreco extends AbstractEntity {
	@NotNull
	private Date data;

	public CombustivelPreco() {
		super();
	}

//	Getters & Setters

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
