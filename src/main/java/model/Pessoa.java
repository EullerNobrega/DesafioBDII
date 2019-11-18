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
	private String cnpj;

	public Pessoa(String nome, String cpf, String cnpj) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}

	public Pessoa() {
	}

}
