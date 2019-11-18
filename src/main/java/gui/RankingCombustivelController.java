package gui;

import java.net.URL;
import java.util.ResourceBundle;

import controller.ControllerFornecimento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Fornecimento;
import model.dto.FornecedorDTO;

public class RankingCombustivelController implements Initializable{
	
	
	private ControllerFornecimento<Fornecimento> service;
	
	@FXML
	private TableView<FornecedorDTO> tableViewRanking;
	
	@FXML
	private TableColumn<FornecedorDTO,String> tableColumnFonecedorNome;
	
	@FXML
	private TableColumn<FornecedorDTO, Double> tableColumnCombustivelValor;
	
	
	@FXML 
	private TableColumn<FornecedorDTO, String> tableColumnData;
	
	@FXML 
	private ObservableList<FornecedorDTO> obsList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		initializeNodes();
	}
	
	
	private void initializeNodes() {
		tableColumnFonecedorNome.setCellValueFactory(new PropertyValueFactory<>("nomeFantasia"));
		tableColumnCombustivelValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
		tableColumnData.setCellValueFactory(new PropertyValueFactory<>("data"));
		
	}
	
	public void setControllerFornecimento(ControllerFornecimento<Fornecimento> service) {
		this.service = service;
	}
	
	public void updateTableView() {
		if(service == null) {
			throw new IllegalStateException("Raking Fornecimento was null");
		}
		obsList = FXCollections.observableArrayList(service.rankingFornecedorMaisBarato());
		tableViewRanking.setItems(obsList);
		
	}

}

