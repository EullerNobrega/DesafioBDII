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

}
