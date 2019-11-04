package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Fornecimento extends AbstractEntity {
	@ManyToOne
	private Fornecedor fornecedor;
	@ManyToOne
	private Combustivel combustivel;
	@ManyToOne
	private Posto posto;
	@ManyToOne
	private Tanque tanque;
	private Double valor;
	private double litro;
	private String data;

	public Fornecimento(Fornecedor fornecedor, Combustivel conbustivel, Posto posto, Tanque tanque, Double valor, double litro,
			String data) {
		super();
		this.fornecedor = fornecedor;
		this.combustivel = conbustivel;
		this.posto = posto;
		this.tanque = tanque;
		this.valor = valor;
		this.litro = litro;
		this.data = data;
	}

	public Fornecimento() {
		super();
	}
	
//	Getters & Setters

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Posto getPosto() {
		return posto;
	}

	public void setPosto(Posto posto) {
		this.posto = posto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
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
