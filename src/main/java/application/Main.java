package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/LoginView.fxml"));
			mainScene = new Scene(parent);
			Image icon = new Image("file:\\Users\\Ingrid\\Desktop\\DesafioBDII\\Images\\gasIcon.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
