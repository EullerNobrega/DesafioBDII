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
			("2018-07-02T08:20","2018-06-30T16:20", "2018-07-01T14:05", "2018-06-30T09:40", "2018-07-03T09:20",
			"2018-06-30T04:30", "2018-07-01T06:00", "2018-07-01T14:50", "2018-07-01T05:10", "2018-06-30T15:20", 
			"2018-07-01T06:50", "2018-06-30T07:20", "2018-07-01T14:40", "2018-07-02T09:20"));
	
	@FXML
	public void initialize() {
		xAxis.setCategories(data);
	}
	
	public void setQtdAbastecimentoHora() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data<>(data.get(0),4500.0));
		series.getData().add(new XYChart.Data<>(data.get(1),6200.0));
		series.getData().add(new XYChart.Data<>(data.get(2),9000.0));
		series.getData().add(new XYChart.Data<>(data.get(3),9750.0));
		series.getData().add(new XYChart.Data<>(data.get(4),7800.0));
		
		series.getData().add(new XYChart.Data<>(data.get(5),10000.0));
		series.getData().add(new XYChart.Data<>(data.get(6),12800.0));
		series.getData().add(new XYChart.Data<>(data.get(7),13000.0));
		series.getData().add(new XYChart.Data<>(data.get(8),13000.0));
		series.getData().add(new XYChart.Data<>(data.get(9),13000.0));
		series.getData().add(new XYChart.Data<>(data.get(10),13700.0));
		series.getData().add(new XYChart.Data<>(data.get(11),14000.0));
		
		series.getData().add(new XYChart.Data<>(data.get(12),14500.0));
		series.getData().add(new XYChart.Data<>(data.get(13),6000.0));
		
		barChart.getData().add(series);
	}
}
