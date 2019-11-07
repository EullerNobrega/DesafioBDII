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

//	Getters & Setters

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public double getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(double volumeMax) {
		this.volumeMax = volumeMax;
	}

	public double getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(double volumeAtual) {
		this.volumeAtual = volumeAtual;
	}

	@Override
	public String toString() {
		return "Tanque [combustivel=" + combustivel + ", volumeMax=" + volumeMax + ", volumeAtual=" + volumeAtual + "]";
	}

	
}
