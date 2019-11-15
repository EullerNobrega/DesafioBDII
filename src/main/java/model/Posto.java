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

}
