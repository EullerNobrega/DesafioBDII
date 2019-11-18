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
}
