package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import controller.ControllerCombustivelCliente;
import gui.data.TabelaClienteFidelidade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CombustivelCliente;
import model.LucroValor;

public class LucroTableController  implements Initializable{

	
	@FXML
	private TableView<LucroValor> tableViewLucro;
	@FXML
	private TableColumn<LucroValor, Double> columnLucro;
	@FXML
	private TableColumn<LucroValor, Double> columnValor;
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	private ObservableList<LucroValor> obsList;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		initializeNodes();		
	}
	
	
	private void initializeNodes() {
		columnLucro.setCellValueFactory(new PropertyValueFactory<>("lucro"));
		columnValor.setCellValueFactory(new PropertyValueFactory<>("valorMedio"));
		
	}
	
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	public void updateTable() {
		if(service == null) {
			throw new IllegalStateException("Cliente Fidelidade was null");
		}

		obsList = FXCollections.observableArrayList(setListLucro());
		tableViewLucro.setItems(obsList);
	}
	
	private List<LucroValor> setListLucro(){
		LucroValor aux = service.lucroBrutoValorMedio();
		List<LucroValor> l = new ArrayList<>();
		System.out.println(aux);
		l.add(aux);
		return l;
	}
}