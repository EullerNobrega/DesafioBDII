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
	private BarChart<String, Double> barChart;
	@FXML
	private CategoryAxis xAxis;
	
	private ObservableList<String> combustivel = FXCollections.observableArrayList(Arrays.asList("Gasolina Comun","Gasolina aditivada","Etanol","Diesel"));
	
	
	
	@FXML
	public void initialize() {
		xAxis.setCategories(combustivel);
	}
	
	public void setVariacaoPrecoCombustivel() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>(combustivel.get(0),4.399));
		series.getData().add(new XYChart.Data<>(combustivel.get(0),4.999));
		series.getData().add(new XYChart.Data<>(combustivel.get(0),5.00));
		series.getData().add(new XYChart.Data<>(combustivel.get(0),3.999));
		series.getData().add(new XYChart.Data<>(combustivel.get(0),3.954));
		
		series.getData().add(new XYChart.Data<>(combustivel.get(1),4.741));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),4.789));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),4.898));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),5.000));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),5.020));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),4.399));
		series.getData().add(new XYChart.Data<>(combustivel.get(1),4.989));
		
		series.getData().add(new XYChart.Data<>(combustivel.get(2),1.598));
		series.getData().add(new XYChart.Data<>(combustivel.get(2),2.399));
		series.getData().add(new XYChart.Data<>(combustivel.get(2),3.490));
		series.getData().add(new XYChart.Data<>(combustivel.get(2),1.899));
		
		series.getData().add(new XYChart.Data<>(combustivel.get(3),2.099));
		series.getData().add(new XYChart.Data<>(combustivel.get(3),2.209));
		series.getData().add(new XYChart.Data<>(combustivel.get(3),3.000));
		series.getData().add(new XYChart.Data<>(combustivel.get(3),2.499));
		series.getData().add(new XYChart.Data<>(combustivel.get(3),2.490));
		
		barChart.getData().add(series);
	}







}
