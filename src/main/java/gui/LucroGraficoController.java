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
	private BarChart<String, Double> barChart;
	@FXML
	private BarChart<String, Double> barChart2;
	@FXML
	private CategoryAxis xAxis;
	
	@FXML
	private CategoryAxis xAxis2;

	private ObservableList<String> lucro = FXCollections
			.observableArrayList(Arrays.asList("06/2018", "07/2018", "08/2018"));
	
	private ObservableList<String> lucro2 = FXCollections
			.observableArrayList(Arrays.asList("06/2018", "07/2018", "08/2018"));

	ControllerCombustivelCliente<CombustivelCliente> cccl = new controller.ControllerCombustivelCliente<>();

	@FXML
	public void initialize() {
		xAxis.setCategories(lucro);
		
	}
	@FXML
	public void initialize2() {
		xAxis2.setCategories(lucro2);
	}

	// lucro 
	public void setVariacaoLucro() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();

		series.getData().add(new XYChart.Data<>(lucro.get(0), 359.63));

		series.getData().add(new XYChart.Data<>(lucro.get(1), 443.85));

		series.getData().add(new XYChart.Data<>(lucro.get(2), 577.29));

		barChart.getData().add(series);
	}

	//valor medio
	public void setMediaLucro() {
		XYChart.Series<String, Double> series = new XYChart.Series<>();

		series.getData().add(new XYChart.Data<>(lucro.get(0), 4.67));

		series.getData().add(new XYChart.Data<>(lucro.get(1), 4.07));

		series.getData().add(new XYChart.Data<>(lucro.get(2), 4.21));
		
		barChart2.getData().add(series);
	}

}
