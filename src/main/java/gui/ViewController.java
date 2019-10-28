package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewController {
	
	@FXML
	private TextField usuario;
	@FXML
	private TextField senha;
	
	@FXML
	public void onClickButtonLogin() {
		
		try {
			Stage menuSystem = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/menuSystemView.fxml"));
			Scene scene = new Scene(parent);
			menuSystem.setScene(scene);
			menuSystem.show();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
