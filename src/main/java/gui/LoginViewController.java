package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import util.front.Alerts;
import util.front.Constraints;

public class LoginViewController implements Initializable {

	@FXML
	private TextField login;
	@FXML
	private PasswordField password;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnExit;

	private static Scene mainScene;

	@FXML
	public void onBtnExit() {
		Stage stage = (Stage) btnExit.getScene().getWindow();
		stage.close();
	}

	@FXML
	public void onbtnLoginAction() throws IOException {

		if ((login.getText() == null || login.getText().trim().equals(""))
				&& (password.getText() == null || password.getText().trim().equals(""))) {
			Alerts.showAlert("LOGIN INVÁLIDO", "LOGIN E PASSWORD INVÁLIDO", null, AlertType.ERROR);
		} else if(login.getText().equals("adm") && password.getText().equals("admin")) {
			Stage atualStage = (Stage) btnLogin.getScene().getWindow();
			atualStage.close();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MenuView.fxml"));
			ScrollPane scrollPane = loader.load();
			Stage primaryStage = new Stage();
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			mainScene = new Scene(scrollPane);
			Image icon = new Image("file:\\Users\\Ingrid\\eclipse-workspace\\DesafioBDII\\Images\\gasIcon.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("PostoSmart");
			primaryStage.show();
		} else {
			Alerts.showAlert("LOGIN INVÁLIDO", "LOGIN E PASSWORD INVÁLIDO", null, AlertType.ERROR);
		}
	}

	public static Scene getScene() {
		return mainScene;
	}

	public void initialize(URL url, ResourceBundle rb) {
		Constraints.validaTextFeild(login);
		Constraints.setTextFieldMaxLength(login, 4);
		Constraints.validaTextFeild(password);
		Constraints.setTextFieldMaxLength(password, 8);

		

	}

}
