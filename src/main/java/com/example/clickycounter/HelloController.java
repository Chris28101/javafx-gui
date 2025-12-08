package com.example.clickycounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


    int counter = 0;
    @FXML
    protected void onHelloButtonClick() {
        counter++;
        welcomeText.setText("Welcome to the jungle!");
        welcomeText.setText(String.valueOf(counter));
    }
}