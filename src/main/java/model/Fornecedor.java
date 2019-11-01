package model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.caelum.stella.bean.validation.CNPJ;

@Entity
public class Fornecedor extends AbstractEntity{
	private String razaoSocial;
	private String nomeFantasia;
	@CNPJ
	private String CNPJ;
	private Combustivel combustivel;
	
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
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
}
