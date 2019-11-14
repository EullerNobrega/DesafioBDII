package gui;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import controller.ControllerFornecimento;
import gui.data.TabelaQtdAbastecimentoHora;
import gui.data.TabelaRankingFornecedores;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Fornecimento;

public class QtdAbastecimentoHoraController implements Initializable{

	@FXML
	private TableView<TabelaQtdAbastecimentoHora> tableViewQtdAbastecimentoHora;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, Double> tableColumnLitro;
	
	@FXML 
	private TableColumn<TabelaRankingFornecedores, LocalDateTime> tableColumnData;
	
	private ControllerFornecimento<Fornecimento> service;
	
	private ObservableList<TabelaQtdAbastecimentoHora> obsList;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		initializeNodes();
	}
	
	private void initializeNodes() {
		tableColumnLitro.setCellValueFactory(new PropertyValueFactory<>("litro"));
		tableColumnData.setCellValueFactory(new PropertyValueFactory<>("data"));
	}
	
	public void setControllerCombustivelCliente(ControllerFornecimento<Fornecimento>  service) {
		this.service = service;
	}
	
	public List<TabelaQtdAbastecimentoHora> setList() {	
		List<Fornecimento> aux = service.rankingAbstecimentoHora();
		List<TabelaQtdAbastecimentoHora> l = new ArrayList<>();
		for(Fornecimento e :aux) {
			l.add(new TabelaQtdAbastecimentoHora(e.getLitro(), e.getData()));
		}
		System.out.println(l);
		return l;
	}
	
	public void updateList() {
		if(service == null) {
			throw new IllegalStateException("Fornecimento was null");
		
		}
		obsList = FXCollections.observableArrayList(setList());
		tableViewQtdAbastecimentoHora.setItems(obsList);
	}
		
	
}
