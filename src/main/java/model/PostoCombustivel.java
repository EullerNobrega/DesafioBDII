package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class PostoCombustivel extends AbstractEntity{
	@NotNull
	@OneToOne
	private Posto posto;
	@NotNull
	@OneToOne
	private Combustivel combustivel;
	@NotNull
	@OneToOne
	private Cliente cliente;
	@NotNull
	private float litros;
	@NotNull
	private float totalCompra;
	
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
