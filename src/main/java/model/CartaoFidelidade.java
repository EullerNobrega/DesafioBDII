package model;

import javax.persistence.Entity;

@Entity
public class CartaoFidelidade extends AbstractEntity {
	private String numeroCartao;

//	Getters & Setters

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

}
