
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
	private double caixa;
	
	
	
	public Posto() {
		super();
	}

	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}
	

}
