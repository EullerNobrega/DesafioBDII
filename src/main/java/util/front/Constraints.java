package util.front;

import javafx.scene.control.TextField;

public class Constraints {

	public static void validaTextFeild(TextField txt) {

		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("[A-Za-z0-9]+")) {
				txt.setText(oldValue);
			}
		});

	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	

}
