package gui;

import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

import controller.ControllerCombustivelCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CombustivelCliente;
import model.dto.CombustivelDTO;

public class CombustivelMaisVendidoController implements Initializable {
	
	@FXML
	private TableView<CombustivelDTO> tableCombustivel;
	
	@FXML
	private TableColumn<CombustivelDTO, String> tableColumnNome;
	
	@FXML
	private TableColumn<CombustivelDTO, BigInteger> tableColumnTotalVendas;
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@FXML
	private ObservableList<CombustivelDTO> obsList;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
		
	}
	
	public void initializeNodes() {
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nomeCombustivel"));
		tableColumnTotalVendas.setCellValueFactory(new PropertyValueFactory<>("qtdVendas"));
	}
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	public void updateList() {
		if(service == null) {
			throw new IllegalStateException("Combustivel was null");
		}
		
		obsList = FXCollections.observableArrayList(service.combustiveisMaisVendidos());
		tableCombustivel.setItems(obsList);
	}

	
}