package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import com.mysql.cj.util.TestUtils;

import controller.ControllerCombustivelCliente;
import gui.data.VendaAcumuladaTabela;
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
import util.front.Alerts;

public class VendaAcumuladaController implements Initializable {
	
	@FXML
	private TextField anoMes = new TextField();
	
	@FXML
	private Button buscar;
	
	private ControllerCombustivelCliente<CombustivelCliente> service;
	
	@FXML
	private TableView<VendaAcumuladaTabela> tableVendaAcumulada;
	
	@FXML
	private TableColumn<VendaAcumuladaTabela, Double> columnVendaAcumulada;
	
	@FXML
	private ObservableList<VendaAcumuladaTabela> obsList;
	
	@FXML
	public void vendaAcumulada() {
		loadView("VendaAcumuladaView.fxml",(VendaAcumuladaController controller)->{
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateTable();
		});
	}
	
	
	private void initializeNodes() {
		columnVendaAcumulada.setCellValueFactory(new PropertyValueFactory<>("somaMes"));
	}
	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente> service) {
		this.service = service;
	}
	
	
	public void updateTable() {
		
		
		List<VendaAcumuladaTabela> l = new ArrayList<>();
		String aux;
		aux = anoMes.getText();
		VendaAcumuladaTabela aux2;
		
		
		aux2 = new VendaAcumuladaTabela(service.VendaAcumulada(aux));
		
		l.add(aux2);
		obsList = FXCollections.observableArrayList(l);
		tableVendaAcumulada.setItems(obsList);
		//System.out.println(l);
	
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
