package model.dto;

import java.math.BigInteger;

public class CombustivelDTO {
	private String nomeCombustivel;
	private BigInteger qtdVendas;

	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public BigInteger getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(BigInteger qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}
