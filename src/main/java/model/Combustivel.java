package model;

import javax.persistence.Entity;

@Entity
public class Combustivel extends AbstractEntity {
	private String nomeCombustivel;

	public Combustivel(String nomeCombustivelo) {
		super();
		this.nomeCombustivel = nomeCombustivel;
	}

	public Combustivel() {
		super();
	}

//	Getters & Setters

	public String getNomeCombustivel() {
		return nomeCombustivel;

	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

}
