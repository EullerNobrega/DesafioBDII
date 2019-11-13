package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import controller.ControllerCombustivelCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Combustivel;
import model.CombustivelCliente;

public class CombustivelMaisVendidoController implements Initializable {
	
	
	
	@FXML
	private TableView<Combustivel> tableViewCombustive;
	
	@FXML
	private TableColumn<Combustivel, String> columnNomeCombustivel;
	
	@FXML
	private TableColumn<Combustivel, Long> columnNomeTotalVendas;

	private ObservableList<Combustivel> obsList;
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		columnNomeCombustivel.setCellValueFactory(new PropertyValueFactory<>("nomeCombustivel"));
		columnNomeTotalVendas.setCellValueFactory(new PropertyValueFactory<>("totalVendas"));
		
	}
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	public void updateTable() {
		if(service == null) {
			throw new IllegalStateException("Combustivel was null");
		}
		
		obsList = FXCollections.observableArrayList(setList());
		tableViewCombustive.setItems(obsList);
	}
	
	private List<Combustivel> setList(){
		List<Combustivel> l = new ArrayList<>();
		l.add(service.maisVendido());
		System.out.println(l);
		return l;
	}
	
	
}
