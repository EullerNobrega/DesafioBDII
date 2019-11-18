package gui;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class QtdAbastecimentoHoraGraficoController {
	
	@FXML
	private BarChart<String, Double> barChart;
	@FXML
	private CategoryAxis xAxis;
		
	private ObservableList<String> data = FXCollections.observableArrayList(Arrays.asList
			("Gasolina","Gasolina Aditivada","Etanol","GNV","Disel"));
	
	@FXML
	public void initialize() {
		xAxis.setCategories(data);
	}
	
	public void setQtdAbastecimentoHora() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();
		
		// GASOLINA
		series.getData().add(new XYChart.Data<>(data.get(0),51700.00 ));
		series.getData().add(new XYChart.Data<>(data.get(0),14500.00));
		series.getData().add(new XYChart.Data<>(data.get(0),13700.00 ));
		series.getData().add(new XYChart.Data<>(data.get(0),13000.00 ));
		series.getData().add(new XYChart.Data<>(data.get(0),13000.00 ));
		series.getData().add(new XYChart.Data<>(data.get(0),12800.00 ));
		series.getData().add(new XYChart.Data<>(data.get(0),9800.00 ));
		// GASOLINA ADITIVADA
		series.getData().add(new XYChart.Data<>(data.get(1),10000.00 ));
		series.getData().add(new XYChart.Data<>(data.get(1),9750.00 ));
		series.getData().add(new XYChart.Data<>(data.get(1),6200.00 ));
	
		//ETANOL
		series.getData().add(new XYChart.Data<>(data.get(2),14000.00 ));
		series.getData().add(new XYChart.Data<>(data.get(2),13000.00));
		
		//GNV
		series.getData().add(new XYChart.Data<>(data.get(3),9000.00));
		
		
		//disel
		series.getData().add(new XYChart.Data<>(data.get(4),4500.00 ));
		barChart.getData().add(series);
	}
}
