package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {

	public Cliente(String nome, String cpf, String cpnj, CartaoFidelidade cartao) {
		super(nome, cpf, cpnj);
		this.cartao = cartao;
	}

	public Cliente(String nome, String cpf, String cpnj) {
		super(nome, cpf, cpnj);
	}

	@OneToOne
	private CartaoFidelidade cartao;

//	Getters & Setters

	public CartaoFidelidade getCartao() {
		return cartao;
	}

	public void setCartao(CartaoFidelidade cartao) {
		this.cartao = cartao;
	}

}
