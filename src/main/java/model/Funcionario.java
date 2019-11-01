package model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Funcionario extends Pessoa {
	private String login;
	@Size(min = 8)
	private String senha;
	private TipoFuncionario tipo;

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
