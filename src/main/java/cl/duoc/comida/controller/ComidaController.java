package cl.duoc.comida.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComidaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
