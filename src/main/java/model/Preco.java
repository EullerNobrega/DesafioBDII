package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Preco extends AbstractEntity {
	@NotNull
	private String valor;
	@NotNull
	private Date momento;

	public Preco() {
		super();
	}

	public Preco(String valor, Date momento) {
		super();
		this.valor = valor;
		this.momento = momento;
	}

//	Getters & Setters

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

}
