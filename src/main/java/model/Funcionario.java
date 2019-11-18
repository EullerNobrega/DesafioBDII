package model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Funcionario extends Pessoa {

	private String login;
	@Size(min = 8)
	private String senha;
	private TipoFuncionario tipo;

	public Funcionario(String nome, String cpf, String cpnj, String login, String senha, TipoFuncionario tipo) {
		super(nome, cpf, cpnj);
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}

	public Funcionario(String nome, String cpf, String cpnj) {
		super(nome, cpf, cpnj);
	}

	public Funcionario() {
		super();
	}

}
