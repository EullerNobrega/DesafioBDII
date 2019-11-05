
package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import br.com.caelum.stella.bean.validation.CNPJ;

@Entity
public class Fornecedor extends AbstractEntity {
	private String razaoSocial;
	private String nomeFantasia;
	@CNPJ
	private String CNPJ;
	@ManyToMany()
	private List<Combustivel> combustiveis;

	public Fornecedor(String razaoSocial, String nomeFantasia, String cNPJ, List<Combustivel> combustiveis) {
		super();
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		CNPJ = cNPJ;
		this.combustiveis = combustiveis;
	}

	public Fornecedor() {
		super();
	}

//	Getters & Setters
	
	public Long getId() {
		return super.getId();
	}

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

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public List<Combustivel> getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(List<Combustivel> combustiveis) {
		this.combustiveis = combustiveis;
	}

	@Override
	public String toString() {
		return "Fornecedor [razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", CNPJ=" + CNPJ
				+ ", combustiveis=" + combustiveis + "]";
	}
	
	

}
