package model;

import javax.persistence.OneToOne;

public class Tanque extends AbstractEntity {
	@OneToOne
	private Combustivel combustivel;
	private double volumeMax;
	private double volumeAtual;

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

}
