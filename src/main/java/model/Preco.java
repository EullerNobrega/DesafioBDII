package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Preco extends AbstractEntity {
	@NotNull
	private Double valor;

	public Preco() {
		super();
	}

	public Preco(Double valor) {
		super();
		this.valor = valor;
	}

//	Getters & Setters

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
