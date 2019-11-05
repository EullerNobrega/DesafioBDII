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

//	Getters & Setters

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoFuncionario getTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionario tipo) {
		this.tipo = tipo;
	}

}
