package model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Combustivel extends AbstractEntity {
	private String nomeCombustivel;

	@Transient
	private long totalVendas;

	public Combustivel(String nomeCombustivel) {
		super();
		this.nomeCombustivel = nomeCombustivel;
	}

	public Combustivel() {
		super();
	}

}
