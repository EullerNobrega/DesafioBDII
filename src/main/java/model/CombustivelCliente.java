package model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class CombustivelCliente extends AbstractEntity {
	@ManyToOne
	@JoinColumn(name = "posto")
	private Posto posto;
	@ManyToOne
	@JoinColumn(name = "combustivel")
	private Combustivel combustivel;
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "tanque")
	private Tanque tanque;

	private LocalDateTime data;
	private Double litro;
	private Double valorTotal;

	public CombustivelCliente(Posto posto, Combustivel combustivel, Cliente cliente, Tanque tanque, LocalDateTime data,
			Double litro, Double valorTotal) {
		super();
		this.posto = posto;
		this.combustivel = combustivel;
		this.cliente = cliente;
		this.tanque = tanque;
		this.data = data;
		this.litro = litro;
		this.valorTotal = valorTotal;
	}

	public CombustivelCliente() {
	}

}
