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
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import model.CombustivelCliente;
import model.dto.FuncionarioDTO;
import util.front.Alerts;

public class TopFuncionarioController implements Initializable {

	@FXML
	private TextField anoMes;

	@FXML
	private Button buscar;

	private ControllerCombustivelCliente<CombustivelCliente> service;

	@FXML
	private TableView<FuncionarioDTO> tableTopFuncionario;

	@FXML
	private TableColumn<FuncionarioDTO, String> tableColumnNome;

	@FXML
	private TableColumn<FuncionarioDTO, String> tableColumnCPF;

	@FXML
	private TableColumn<FuncionarioDTO, String> tableColumnCNPJ;

	@FXML
	private TableColumn<FuncionarioDTO, Double> tableColumnTotalVenda;

	private ObservableList<FuncionarioDTO> obsList;
	
	
	
	
	public void topFuncionarios() {
		loadView("/gui/TopFuncionario.fxml", (TopFuncionarioController controller)->{
			controller.setControllerCombustivelCliente(new ControllerCombustivelCliente<CombustivelCliente>());
			controller.updateTable(anoMes.getText());
		});
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

	
	public void setControllerCombustivelCliente(ControllerCombustivelCliente<CombustivelCliente>service) {
		this.service = service;
	}
	
	
	public void updateTable(String ano) {
		obsList = FXCollections.observableArrayList(service.topFuncionarios(ano));
		tableTopFuncionario.setItems(obsList);
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();

	}
	
	private void initializeNodes() {
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nomeFuncionario"));
		tableColumnCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableColumnCNPJ.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
		tableColumnTotalVenda.setCellValueFactory(new PropertyValueFactory<>("valorTotal"));
	}

}
