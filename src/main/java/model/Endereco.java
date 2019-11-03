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

//	Getters & Setters

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
