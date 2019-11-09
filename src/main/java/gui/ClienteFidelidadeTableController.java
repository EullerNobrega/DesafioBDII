package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import controller.ControllerCliente;
import gui.data.TabelaClienteFidelidade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Cliente;


public class ClienteFidelidadeTableController implements Initializable {
	
	private ControllerCliente<Cliente> service;
	
	@FXML
	private TableView<TabelaClienteFidelidade> tableViewClienteFidelidade;
	
	@FXML
	private TableColumn<TabelaClienteFidelidade, String> tableColumnCliente;
	
	@FXML
	private TableColumn<TabelaClienteFidelidade, String> tableColumnCartao;
	
	@FXML
	private ObservableList<TabelaClienteFidelidade> obsList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
		
	}
	
	private void initializeNodes() {
		tableColumnCliente.setCellValueFactory(new PropertyValueFactory<>("nomeCliente"));
		tableColumnCartao.setCellValueFactory(new PropertyValueFactory<>("numeroCartao"));
	}
	
	public void setControllerCliente(ControllerCliente<Cliente> service) {
		this.service = service;
	}
	
	public void updateTable() {
		if(service == null) {
			throw new IllegalStateException("Cliente Fidelidade was null");
		}

		List<TabelaClienteFidelidade> listaTable = filtraDados();
		obsList = FXCollections.observableArrayList(listaTable);
		tableViewClienteFidelidade.setItems(obsList);
	}
	
	public List<TabelaClienteFidelidade> filtraDados() {
		List<Cliente> listaTable = service.clientesFidelidade();
		List<TabelaClienteFidelidade> listaCliente = new ArrayList<>();
		for(int i = 0; i < listaTable.size();i++) {
			listaCliente.add(new TabelaClienteFidelidade(listaTable.get(i).getNome(), listaTable.get(i).getCartao().getNumeroCartao(), listaTable.get(i).getCpf()));
		}
		return listaCliente;
	}
	
}
