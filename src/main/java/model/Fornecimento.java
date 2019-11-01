package model;

import java.util.Date;

public class Fornecimento extends AbstractEntity {
	
	private Fornecedor fornecedor;
	private Combustivel conbustivel;
	private Posto posto;
	private double valor;
	private double litro;
	private Date data;

//	Getters & Setters
	
	public Fornecedor getForncedor() {
		return fornecedor;
	}

	public void setForncedor(Fornecedor forncedor) {
		this.fornecedor = forncedor;
	}

	public Combustivel getConbustivel() {
		return conbustivel;
	}

	public void setConbustivel(Combustivel conbustivel) {
		this.conbustivel = conbustivel;
	}

	public Posto getPosto() {
		return posto;
	}

	public void setPosto(Posto posto) {
		this.posto = posto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getLitro() {
		return litro;
	}

	public void setLitro(double litro) {
		this.litro = litro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
