package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class LoginController {

    @FXML
    private Button backL;

    @FXML
    private TextField emailL;

    @FXML
    private Button homeL;

    @FXML
    private Button login;

    @FXML
    private TextField passwordL;

    @FXML
    void backLOA(ActionEvent event) {
        showStage("inew-view.fxml", "Marathon Skills 2016 – Register as a runner");

    }


    @FXML
    void homeLOA(ActionEvent event) {
        showStage("main-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void loginOA(ActionEvent event) {
        String email1 = emailL.getText();
        String password1 = passwordL.getText();
        if (Objects.equals(email1, emailL) && Objects.equals(password1, passwordL)) {
            showStage("sum-view.fxml", "Marathon Skills 2016 – Register for an sum");

        }


    }

}
