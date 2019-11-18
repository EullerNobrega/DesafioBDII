package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tanque extends AbstractEntity {
	@OneToOne
	@JoinColumn(name = "combustivel")
	private Combustivel combustivel;
	private double volumeMax;
	private double volumeAtual;

	public Tanque(Combustivel combustivel, double volumeMax, double volumeAtual) {
		super();
		this.combustivel = combustivel;
		this.volumeMax = volumeMax;
		this.volumeAtual = volumeAtual;
	}

	public Tanque() {
		super();
	}
}
