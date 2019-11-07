package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import br.com.caelum.stella.bean.validation.CNPJ;

@Entity
public class Posto extends AbstractEntity {
	@OneToOne
	@NotNull
	@JoinColumn(name = "endereco")
	private Endereco endereco;
	private String razaoSocial;
	private String nomeFantasia;
	@CNPJ
	private String CNPJ;
	private String bandeira;

	public Posto(Endereco endereco, String razaoSocial, String nomeFantasia, String cNPJ, String bandeira) {
		super();
		this.endereco = endereco;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		CNPJ = cNPJ;
		this.bandeira = bandeira;
	}

	public Posto() {
		super();
	}

//	Getters & Setters

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
