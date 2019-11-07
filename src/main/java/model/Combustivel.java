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

//	Getters & Setters

	public Long getId() {
		return super.getId();
	}

	public String getNomeCombustivel() {
		return nomeCombustivel;

	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public long getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(long totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public String toString() {
		return "Combustivel [nomeCombustivel=" + nomeCombustivel + ", totalVendas=" + totalVendas + "]";
	}

}
