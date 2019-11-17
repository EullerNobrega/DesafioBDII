package gui;

import java.net.URL;
import java.sql.Timestamp;
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
import model.dto.HorarioPicoDTO;

public class HorarioPicoController implements Initializable {
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@FXML
	private TableView<HorarioPicoDTO> tableHorario;
	
	@FXML
	private TableColumn<HorarioPicoDTO, String> tableColumnNome;
	
	@FXML
	private TableColumn<HorarioPicoDTO,Double> tableColumnValor;
	
	@FXML
	private TableColumn<HorarioPicoDTO,Timestamp> tableColumnData;
	
	
	private ObservableList<HorarioPicoDTO> obsList;
	
	
	
	
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}





	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNode();
		
	}
	
	public void initializeNode() {
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nomeCombustivel"));
		tableColumnValor.setCellValueFactory(new PropertyValueFactory<>("qtdGasolina"));
		tableColumnData.setCellValueFactory(new PropertyValueFactory<>("dataPico"));
	}
	
	
	public void updateList() {
		if(service == null) {
			throw new IllegalStateException("Horario was null");
		}
		
		obsList = FXCollections.observableArrayList(service.horarioPicoQtdAbastecimento());
		tableHorario.setItems(obsList);
	}
}
