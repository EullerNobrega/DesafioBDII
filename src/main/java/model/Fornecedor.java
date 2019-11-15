
package model;

import java.util.List;

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

}
