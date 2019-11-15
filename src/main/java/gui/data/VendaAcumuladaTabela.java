package gui.data;

public class VendaAcumuladaTabela {
	
	
	private double somaMes;
	
	
	
	public VendaAcumuladaTabela(double somaMes) {
		super();
		this.somaMes = somaMes;
	}

	public double getSomaMes() {
		return somaMes;
	}

	public void setSomaMes(double somaMes) {
		this.somaMes = somaMes;
	}

	@Override
	public String toString() {
		return "VendaAcumuladaTabela [somaMes=" + somaMes + "]";
	}
	
	
	
}
