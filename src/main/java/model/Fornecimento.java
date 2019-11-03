package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Fornecimento extends AbstractEntity {
	@OneToOne
	private Fornecedor fornecedor;
	@OneToOne
	private Combustivel conbustivel;
	@OneToOne
	private Posto posto;
	private double valor;
	private double litro;
	private String data;

	public Fornecimento(Fornecedor fornecedor, Combustivel conbustivel, Posto posto, double valor, double litro,
			String data) {
		super();
		this.fornecedor = fornecedor;
		this.conbustivel = conbustivel;
		this.posto = posto;
		this.valor = valor;
		this.litro = litro;
		this.data = data;
	}

	public Fornecimento() {
		super();
	}

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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
