package model;

import javax.persistence.Entity;

@Entity
public class CartaoFidelidade extends AbstractEntity {
	private String numeroCartao;

	public CartaoFidelidade(String numeroCartao) {
		super();
		this.numeroCartao = numeroCartao;
	}

	public CartaoFidelidade() {
		super();
	}

//	Getters & Setters

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public String toString() {
		return "CartaoFidelidade [numeroCartao=" + numeroCartao + "]";
	}

}
