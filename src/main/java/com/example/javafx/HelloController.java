package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
	public Button getCard;
	@FXML
	private Label welcomeText;


	@FXML
	protected void onHelloButtonClick() {

		welcomeText.setText("Welcome to JavaFX Application!");
	}
}