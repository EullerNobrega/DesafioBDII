package gui;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import controller.ControllerFornecimento;
import gui.data.TabelaRankingFornecedores;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Fornecimento;

public class RankingCombustivelController implements Initializable{
	
	
	private ControllerFornecimento<Fornecimento> service;
	
	@FXML
	private TableView<TabelaRankingFornecedores> tableViewRanking;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores,String> tableColumnFonecedor;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, String> tableColumnCombustivel;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, String> tableColumnPosto;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, Long> tableColumnTanque;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, Double> tableColumnValor;
	
	@FXML
	private TableColumn<TabelaRankingFornecedores, Double> tableColumnLitro;
	
	@FXML TableColumn<TabelaRankingFornecedores, LocalDateTime> tableColumnData;
	
	@FXML 
	private ObservableList<TabelaRankingFornecedores> obsList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		initializeNodes();
	}
	
	
	private void initializeNodes() {
		tableColumnFonecedor.setCellValueFactory(new PropertyValueFactory<>("nomeFornecedor"));
		tableColumnCombustivel.setCellValueFactory(new PropertyValueFactory<>("nomeCombustivel"));
		tableColumnPosto.setCellValueFactory(new PropertyValueFactory<>("nomePosto"));
		tableColumnTanque.setCellValueFactory(new PropertyValueFactory<>("Tanque"));
		tableColumnValor.setCellValueFactory(new PropertyValueFactory<>("Valor"));
		tableColumnLitro.setCellValueFactory(new PropertyValueFactory<>("litro"));
		tableColumnData.setCellValueFactory(new PropertyValueFactory<>("Data"));
	}
	
	public void setControllerFornecimento(ControllerFornecimento<Fornecimento> service) {
		this.service = service;
	}
	
	public void updateTableView() {
		if(service == null) {
			throw new IllegalStateException("Raking Fornecimento was null");
		}
		List<TabelaRankingFornecedores> listaTable = teste();
		obsList = FXCollections.observableArrayList(listaTable);
		tableViewRanking.setItems(obsList);
		teste();
	}
	
	public List<TabelaRankingFornecedores> teste() {
		List<Fornecimento> listaTable = service.rankingCombustivel();
		List<TabelaRankingFornecedores> listaFornecedor = new ArrayList<>();
		String nomeFornecedor,nomeCombustivel,nomePosto;
		for(Fornecimento e: listaTable) {
			nomeFornecedor = e.getFornecedor().getNomeFantasia();
			nomeCombustivel = e.getCombustivel().getNomeCombustivel();
			nomePosto = e.getPosto().getNomeFantasia();
			listaFornecedor.add(new TabelaRankingFornecedores(nomeFornecedor, nomeCombustivel, nomePosto, e.getTanque().getId(), e.getValor(), e.getLitro(), e.getData()));
		}
		System.out.println(listaFornecedor);
		return listaFornecedor;
	}
	

}

