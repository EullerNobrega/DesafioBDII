package gui;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class CombustiveisGraficoController {

	@FXML
	private BarChart<String, Integer> barChart;
	@FXML
	private CategoryAxis xAxis;
	
	private ObservableList<String> combustivel = FXCollections.observableArrayList(Arrays.asList("Gasolina Comun","Gasolina aditivada","Etanol","Diesel","GNV"));
	
	
	
	@FXML
	public void initialize() {
		xAxis.setCategories(combustivel);
	}
	
	public void setVariacaoPrecoCombustivel() {
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>(combustivel.get(0),6));
		
		
		series.getData().add(new XYChart.Data<>(combustivel.get(1),3));
		
		
		series.getData().add(new XYChart.Data<>(combustivel.get(2),3));
		
		
		series.getData().add(new XYChart.Data<>(combustivel.get(3),1));
		
		series.getData().add(new XYChart.Data<>(combustivel.get(4),3));
		
		
		barChart.getData().add(series);
	}







}
