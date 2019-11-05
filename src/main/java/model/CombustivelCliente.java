package model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

	private LocalDateTime data;
	private Double litro;
	private Double valorTotal;

	public CombustivelCliente(Posto posto, Combustivel combustivel, Cliente cliente, LocalDateTime data, Double litro,
			Double valorTotal) {
		super();
		this.posto = posto;
		this.combustivel = combustivel;
		this.cliente = cliente;
		this.data = data;
		this.litro = litro;
		this.valorTotal = valorTotal;
	}
//	Getters & Setters

	public Posto getPosto() {
		return posto;
	}

	public void setPosto(Posto posto) {
		this.posto = posto;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Double getLitro() {
		return litro;
	}

	public void setLitro(Double litro) {
		this.litro = litro;
	}

	public Double getValorTotao() {
		return valorTotal;
	}

	public void setValorTotao(Double valorTotao) {
		this.valorTotal = valorTotao;
	}

}
