package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import controller.ControllerCombustivelCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import model.CombustivelCliente;
import model.dto.TotalVendaCombustivelDTO;
import util.front.Alerts;

public class VendaAcumuladaController implements Initializable {
	
	@FXML
	private TextField anoMes ;
	
	@FXML
	private Button buscar;
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@FXML
	private TableView<TotalVendaCombustivelDTO> tableVendaAcumulada;
	
	@FXML
	private TableColumn<TotalVendaCombustivelDTO, Double> columnVendaAcumulada;
	
	@FXML
	private TableColumn<TotalVendaCombustivelDTO, String> columnNomeCombustivel;
	
	@FXML
	private TableColumn<TotalVendaCombustivelDTO, String> columnData;
	

	@FXML
	private ObservableList<TotalVendaCombustivelDTO> obsList;
	
	@FXML
	public void vendaAcumulada() {
		loadView("VendaAcumuladaView.fxml",(VendaAcumuladaController controller)->{
			System.out.println(anoMes.getText());
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateTable(anoMes.getText());
		});
	}
	
	
	private void initializeNodes() {
		columnVendaAcumulada.setCellValueFactory(new PropertyValueFactory<>("valorTotal"));
		columnNomeCombustivel.setCellValueFactory(new PropertyValueFactory<>("nomeCombustivel"));
		columnData.setCellValueFactory(new PropertyValueFactory<>("data"));
	}
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	@FXML
	public void updateTable(String ano) {
		System.out.println(ano);
		obsList = FXCollections.observableArrayList(service.rankingTotalValorCombustivel(ano));
		tableVendaAcumulada.setItems(obsList);
		
	
	}
	

	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			Scene mainScene = LoginViewController.getScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			Node mainMenu = mainVbox.getChildren().get(0);

			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());

			T controller = loader.getController();
			initializingAction.accept(controller);

		} catch (IOException e) {
			Alerts.showAlert("IO EXCEPTION", "Error loading Page", e.getMessage(), AlertType.ERROR);
		}
	}




	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();
	}
	
}
