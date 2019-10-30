package model;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import br.com.caelum.stella.bean.validation.CNPJ;
import br.com.caelum.stella.bean.validation.CPF;

@MappedSuperclass
public class Pessoa extends AbstractEntity {
	@NotNull
	private String nome;
	@CPF
	private String cpf;
	@CNPJ
	private String cpnj;

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

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

}