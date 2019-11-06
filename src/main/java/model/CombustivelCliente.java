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

	private LocalDateTime data;
	private Double litro;
	private Double valorTotal;
	
	@Transient
	private double lucro;
	@Transient
	private double valorMedio;

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

	public CombustivelCliente() {

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

	public void setValorTotao(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getValorMedio() {
		return valorMedio;
	}

	public void setValorMedio(double valorMedio) {
		this.valorMedio = valorMedio;
	}

	@Override
	public String toString() {
		return "CombustivelCliente [posto=" + posto + ", \ncombustivel=" + combustivel + ", \ncliente=" + cliente
				+ ", \ndata=" + data + ", \nlitro=" + litro + ", \nvalorTotal=" + valorTotal + ", \nlucro=" + lucro
				+ ", \nvalorMedio=" + valorMedio + "]";
	}

}