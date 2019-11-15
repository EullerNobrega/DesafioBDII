package model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Fornecimento extends AbstractEntity{
	@ManyToOne
	@JoinColumn(name = "fornecedor")
	private Fornecedor fornecedor;
	@ManyToOne
	@JoinColumn(name = "combustivel")
	private Combustivel combustivel;
	@ManyToOne
	@JoinColumn(name = "posto")
	private Posto posto;
	@ManyToOne
	@JoinColumn(name = "tanque")
	private Tanque tanque;
	private Double valor;
	private double litro;
	private LocalDateTime data;

	public Fornecimento(Fornecedor fornecedor, Combustivel conbustivel, Posto posto, Tanque tanque, Double valor,
			double litro, LocalDateTime data) {
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

}
