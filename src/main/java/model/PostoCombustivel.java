package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class PostoCombustivel extends AbstractEntity {
	@NotNull
	@OneToOne
	private Posto posto;
	@NotNull
	@OneToOne
	@JoinColumn(name = "combustivel")
	private Combustivel combustivel;
	@NotNull
	@OneToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	@NotNull
	private float litros;
	@NotNull
	private float totalCompra;

	public PostoCombustivel(Posto posto, Combustivel combustivel, Cliente cliente, float litros, float totalCompra) {
		super();
		this.posto = posto;
		this.combustivel = combustivel;
		this.cliente = cliente;
		this.litros = litros;
		this.totalCompra = totalCompra;
	}

	public PostoCombustivel() {
		super();
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

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(float totalCompra) {
		this.totalCompra = totalCompra;
	}

}
