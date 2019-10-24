package desafio_posto;

import javax.persistence.Entity;

@Entity
public class Pessoa extends AbstractEntity {
	
	
	private String nome;
	
	
	private String cpf;
	
	
//	Getters & Setters
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
