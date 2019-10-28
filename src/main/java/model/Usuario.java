package model;

import javax.persistence.Entity;

@Entity
public class Usuario extends AbstractEntity{
	private String login;
	private String senha;
	private Pessoa pessoa;
	private	Posto posto;
	
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
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Posto getPosto() {
		return posto;
	}
	public void setPosto(Posto posto) {
		this.posto = posto;
	}
	
	
}
