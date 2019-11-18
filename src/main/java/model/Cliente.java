package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {

	@OneToOne
	@JoinColumn(name = "cartao")
	private CartaoFidelidade cartao;

	public Cliente(String nome, String cpf, String cpnj, CartaoFidelidade cartao) {
		super(nome, cpf, cpnj);
		this.cartao = cartao;
	}

	public Cliente(String nome, String cpf, String cpnj) {
		super(nome, cpf, cpnj);
	}

	public Cliente() {
		super();
	}

}
