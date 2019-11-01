package model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {
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
