package gui;

import java.util.Arrays;

import controller.ControllerCombustivelCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import model.CombustivelCliente;

public class LucroGraficoController {

	@FXML
	private BarChart<String, Integer> barChart;
	@FXML
	private CategoryAxis xAxis;
	
	private ObservableList<String> lucro = FXCollections.observableArrayList(Arrays.asList("06/2018","07/2018","08/2018"));
	
	ControllerCombustivelCliente<CombustivelCliente> cccl = 
	new controller.ControllerCombustivelCliente<>();
	
	
	@FXML
	public void initialize() {
		xAxis.setCategories(lucro);
	}
	
	public void setVariacaoLucro() {
		XYChart.Series<String, Integer> series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>(lucro.get(0),6));
		
		
		series.getData().add(new XYChart.Data<>(lucro.get(1),3));
		
		
		series.getData().add(new XYChart.Data<>(lucro.get(2),3));
		
		
		series.getData().add(new XYChart.Data<>(lucro.get(3),1));
		
		series.getData().add(new XYChart.Data<>(lucro.get(4),3));
		
		
		barChart.getData().add(series);
	}



}
