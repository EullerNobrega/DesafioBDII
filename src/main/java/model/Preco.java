package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Preco extends AbstractEntity {
	@NotNull
	private Double valor;

	public Preco(Double valor) {
		super();
		this.valor = valor;
	}

	public Preco() {
		super();
	}

}
