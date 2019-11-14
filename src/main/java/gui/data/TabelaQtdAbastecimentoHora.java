package gui.data;

import java.time.LocalDateTime;

public class TabelaQtdAbastecimentoHora {
	
	private Double litro;
	private LocalDateTime data;
	
	
	public TabelaQtdAbastecimentoHora(Double litro, LocalDateTime data) {
		super();
		this.litro = litro;
		this.data = data;
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
		return "TabelaQtdAbastecimentoHora [litro=" + litro + ", data=" + data + "]";
	}
}
