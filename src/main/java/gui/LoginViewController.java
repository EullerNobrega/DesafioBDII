package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class LoginViewController implements Initializable {
	@FXML
	private TextField login;
	@FXML
	private PasswordField password;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnExit;
    @FXML
    private ImageView Icone2;
    @FXML
    private ImageView Icone3;
	
	private static Scene mainScene;
	@FXML
	public void onBtnExit() {
		Stage stage = (Stage) btnExit.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
	}
	
	@FXML
	public void onbtnLoginAction() throws IOException {
		Stage atualStage = (Stage)btnLogin.getScene().getWindow();
		atualStage.close();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MenuView.fxml"));
		ScrollPane scrollPane = loader.load();
		Stage primaryStage = new Stage();
		scrollPane.setFitToHeight(true);
		scrollPane.setFitToWidth(true);
		mainScene = new Scene(scrollPane);
		
		Image icon = new Image("file:\\Users\\camil\\Desktop\\DesafioBDII\\Images\\gasIcon.png");
		primaryStage.getIcons().add(icon);
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("PostoSmart");
		primaryStage.show();
	}
	
	public static Scene getScene() {
		return mainScene;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

}
