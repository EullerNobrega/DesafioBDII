package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import util.Alerts;
public class MenuViewController {
	
	@FXML
	private MenuItem menuVoltarInicio;
	
	@FXML
	private MenuItem menuItemGastosMensais;
	
	@FXML
	private MenuItem menuItemGanhosMensais;
	
	@FXML
	private MenuItem  menuItemCombustíveis;
	
	@FXML
	private MenuItem menuItemNivelCombustiveis;
	
	@FXML
	public void onMenuVoltarInicio() {
		loadView("/gui/VoltarInicio.fxml");
	}
	
	@FXML
	public void onMenuItemGastosMensais() {
		loadView("/gui/GastosMensais.fxml");
	}
	
	@FXML
	public void onMenuItemGanhosMensais() {
		loadView("/gui/ganhosMensais.fxml");
	}
	
	@FXML
	public void onMenuItemCombustiveis() {
		loadView("/gui/Combustivel.fxml");
	}
	
	@FXML
	public void onMenuItemNivelCombustiveis() {
		
	}
	
	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			Scene mainScene = LoginViewController.getScene();
			VBox mainVbox =(VBox)((ScrollPane) mainScene.getRoot()).getContent();
			Node mainMenu = mainVbox.getChildren().get(0);
			
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IO EXCEPTION", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
}
