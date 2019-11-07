package gui;

import java.io.IOException;
import java.util.function.Consumer;

import controller.ControllerFornecimento;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.Fornecimento;
import util.front.Alerts;
public class MenuViewController {
	
	@FXML
	private MenuItem menuItemGastosMensais;
	
	@FXML
	private MenuItem menuItemGanhosMensais;
	
	@FXML
	private MenuItem  menuItemCombustíveis;
	
	@FXML
	private MenuItem menuItemNivelCombustiveis;
	
	@FXML
	public void onMenuItemGastosMensais() {
		
		//loadView("/gui/GastosMensais.fxml", x->{});
		
		loadView("/gui/rankingCombustivel.fxml",(RankingCombustivelController controller)->{
			controller.setControllerFornecimento(new ControllerFornecimento<Fornecimento>());
			controller.updateTableView();
		});
		
	}
	
	@FXML
	public void onMenuItemRankingCombustive() {
		loadView("/gui/ganhosMensais.fxml", x->{});
	}
	
	@FXML
	public void onMenuItemCombustiveis() {
		loadView("/gui/Combustivel.fxml",x->{});
	}
	
	@FXML
	public void onMenuItemNivelCombustiveis() {
		
	}
	
	private synchronized <T> void loadView(String absoluteName, Consumer<T>initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			Scene mainScene = LoginViewController.getScene();
			VBox mainVbox =(VBox)((ScrollPane) mainScene.getRoot()).getContent();
			Node mainMenu = mainVbox.getChildren().get(0);
			
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
			
		} catch (IOException e) {
			Alerts.showAlert("IO EXCEPTION", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
}
