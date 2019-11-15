package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Endereco extends AbstractEntity {
	private String logradouro;
	@NotNull
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, String cep, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Endereco() {
		super();
	}

}
