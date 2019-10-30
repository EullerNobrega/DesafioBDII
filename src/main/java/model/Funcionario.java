package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Funcionario extends Pessoa {
	@NotNull
	private String login;
	@NotNull
	private String senha;

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

}
