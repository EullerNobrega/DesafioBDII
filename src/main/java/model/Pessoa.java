package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.com.caelum.stella.bean.validation.CPF;

@Entity
public class Pessoa extends AbstractEntity {
	@CPF
	private String cpf;
	@NotNull
	private String nome;
	private Endereco endereco;

//	Getters & Setters

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
