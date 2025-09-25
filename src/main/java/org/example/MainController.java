package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label seasonsLabel;

    @FXML
    void handleClick() {
        System.out.println("hello world!!!");
    }

    @FXML
    private void initialize() {

    }
}
