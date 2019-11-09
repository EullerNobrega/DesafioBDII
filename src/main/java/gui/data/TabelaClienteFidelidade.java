package gui.data;

public class TabelaClienteFidelidade {
	
	private String nomeCliente;
	private String numeroCartao;
	private String cpf;
	
	
	public TabelaClienteFidelidade(String nomeCliente, String numeroCartao,String cpf) {
	
		super();
		this.nomeCliente = nomeCliente;
		this.numeroCartao = numeroCartao;
		this.cpf = cpf;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "TabelaClienteFidelidade [nomeCliente=" + nomeCliente + ", numeroCartao=" + numeroCartao + "]";
	}
	
	
	
	
}
