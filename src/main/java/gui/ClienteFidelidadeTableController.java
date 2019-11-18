package gui;

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
import model.dto.ClienteFidelidadeDTO;


public class ClienteFidelidadeTableController implements Initializable {
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@FXML
	private TableView<ClienteFidelidadeDTO> tableViewClienteFidelidade;
	
	@FXML
	private TableColumn<ClienteFidelidadeDTO, String> tableColumnCliente;
	
	@FXML
	private TableColumn<ClienteFidelidadeDTO, String> tableColumnCartao;
	
	@FXML
	private TableColumn<ClienteFidelidadeDTO,String> tableColumnCPF;
	
	@FXML
	private TableColumn<ClienteFidelidadeDTO,Double> tableColumnConsumo;
	
	@FXML
	private ObservableList<ClienteFidelidadeDTO> obsList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
		
	}
	
	private void initializeNodes() {
		tableColumnCliente.setCellValueFactory(new PropertyValueFactory<>("nomeCliente"));
		tableColumnCartao.setCellValueFactory(new PropertyValueFactory<>("numeroCartao"));
		tableColumnCPF.setCellValueFactory(new PropertyValueFactory<>("cpfCliente"));
		tableColumnConsumo.setCellValueFactory(new PropertyValueFactory<>("consumo"));
	}
	
	public void setControllerCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	public void updateTable() {
		if(service == null) {
			throw new IllegalStateException("Cliente Fidelidade was null");
		}

		obsList = FXCollections.observableArrayList(service.consumoClienteFidelidade());
		tableViewClienteFidelidade.setItems(obsList);
	}
	
	
	
}
