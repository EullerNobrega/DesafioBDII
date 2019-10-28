package model;

import javax.persistence.Entity;

@Entity
public class Bandeira extends AbstractEntity {
	private String nome;
	private String url;

//	Getters & Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
