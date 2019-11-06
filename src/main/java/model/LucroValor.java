package model;

public class LucroValor {
	private double lucro;
	private double valorMedio;
	
	
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public double getValorMedio() {
		return valorMedio;
	}
	public void setValorMedio(double valorMedio) {
		this.valorMedio = valorMedio;
	}
	@Override
	public String toString() {
		return "LucroValor [lucro=" + lucro + ", valorMedio=" + valorMedio + "]";
	}
	
	
}
