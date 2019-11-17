package model.dto;

import java.sql.Timestamp;

public class HorarioPicoDTO {
	private double qtdGasolina;
	private Timestamp dataPico;
	private String nomeCombustivel;

	public double getQtdGasolina() {
		return qtdGasolina;
	}

	public void setQtdGasolina(double qtdGasolina) {
		this.qtdGasolina = qtdGasolina;
	}


	public Timestamp getDataPico() {
		return dataPico;
	}

	public void setDataPico(Timestamp dataPico) {
		this.dataPico = dataPico;
	}

	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

}
