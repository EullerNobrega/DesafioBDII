package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("PostoSmart");
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/LoginView.fxml"));
			mainScene = new Scene(parent);
			AnchorPane root = new AnchorPane();
			Image icon = new Image("file:\\Users\\camil\\Desktop\\DesafioBDII\\Images\\gasIcon.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setScene(mainScene);
			
			Image logo = new Image("file:\\Users\\camil\\Desktop\\DesafioBDII\\src\\iconLogo1.png");
	        ImageView iv1 = new ImageView(logo);
			     
	        iv1.setFitWidth(126);
	        iv1.setFitHeight(126);
	        iv1.setX(226);
	        iv1.setY(14);
	        root.getChildren().add(iv1);
	        
	        Image gas = new Image("file:\\Users\\camil\\Desktop\\DesafioBDII\\src\\gasIcon.png");
	        ImageView iv2 = new ImageView(gas);
	        
	        iv2.setFitWidth(57);
	        iv2.setFitHeight(56);
	        iv2.setX(265);
	        iv2.setY(49);
	        root.getChildren().add(iv2);
	        
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
