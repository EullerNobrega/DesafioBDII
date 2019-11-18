package gui;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class RankingFornecedorGraficoController {

	
	@FXML
	private BarChart<String, Double> graficoRakingFornecedor;
	
	@FXML
	private CategoryAxis xAxis;
	
	/* private RankingCombustivelController controler; */
	
	
	private ObservableList<String> combustivel = FXCollections.observableArrayList(Arrays.asList("Shell","Ale","Esso","Ipiranga","BR Distribuidoea"));;
	
	
	
	@FXML
	public void initialize() {
		
		xAxis.setCategories(combustivel);
	}
	
	public void setVariacaoRankingFornecedor() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();
		
		
		//shell
		series.getData().add(new XYChart.Data<>(combustivel.get(0),48750.0));

		
			
		series.getData().add(new XYChart.Data<>(combustivel.get(1),45760.0));
		
		
		series.getData().add(new XYChart.Data<>(combustivel.get(2),33150.0));
	
		
		
		series.getData().add(new XYChart.Data<>(combustivel.get(3),45640.0));
		
		series.getData().add(new XYChart.Data<>(combustivel.get(4),32200.0));

		
		graficoRakingFornecedor.getData().add(series);
		
		
	}
	
	/*
	 * private List<String> setListFornecedorNome() { List<String> nomeFornecedor =
	 * new ArrayList<>(); List<TabelaRankingFornecedores> aux = new ArrayList<>();
	 * aux = controler.teste();
	 * 
	 * for(TabelaRankingFornecedores e: aux) {
	 * nomeFornecedor.add(e.getNomeFornecedor()); } return nomeFornecedor;
	 * 
	 * }
	 * 
	 * private List<Double> setListValor() { List<TabelaRankingFornecedores> aux =
	 * new ArrayList<>(); aux = controler.teste();
	 * 
	 * List<Double> listaValor = new ArrayList<>();
	 * 
	 * for(TabelaRankingFornecedores e : aux) { listaValor.add(e.getValor()); }
	 * return listaValor; }
	 */

}
