package gui.data;

import java.time.LocalDateTime;

/*
 * CLASSE COM OBJETIVO DE FILTRAR DADOS QUEM 
 * IRAM APARECER NA TABELA PARA O USUÁRIO
 * 
 */
public class TabelaRankingFornecedores {
	
	
	private String nomeFornecedor;
	private String nomeCombustivel;
	private String nomePosto;
	private Long tanque;
	private Double valor;
	private Double litro;
	private LocalDateTime data;
	
	
	
	public TabelaRankingFornecedores(String nomeFornecedor, String nomeCombustivel, String nomePosto, Long tanque,
			Double valor, Double litro, LocalDateTime data) {
		super();
		this.nomeFornecedor = nomeFornecedor;
		this.nomeCombustivel = nomeCombustivel;
		this.nomePosto = nomePosto;
		this.tanque = tanque;
		this.valor = valor;
		this.litro = litro;
		this.data = data;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public String getNomePosto() {
		return nomePosto;
	}
	public void setNomePosto(String nomePosto) {
		this.nomePosto = nomePosto;
	}
	public Long getTanque() {
		return tanque;
	}
	public void setTanque(Long tanque) {
		this.tanque = tanque;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getLitro() {
		return litro;
	}
	public void setLitro(Double litro) {
		this.litro = litro;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "TabelaRankingFornecedores [nomeFornecedor=" + nomeFornecedor + ", nomeCombustivel=" + nomeCombustivel
				+ ", nomePosto=" + nomePosto + ", tanque=" + tanque + ", valor=" + valor + ", litro=" + litro
				+ ", data=" + data + "]";
	}

	
	
	
}
