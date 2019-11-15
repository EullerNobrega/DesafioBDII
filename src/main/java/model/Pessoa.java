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

	public Pessoa(String nome, String cpf, String cpnj) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cpnj = cpnj;
	}

	public Pessoa() {
	}

}
