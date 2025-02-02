package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class RegController {

    @FXML
    private Button backL;

    @FXML
    private TextField emailL;

    @FXML
    private Button goReg;

    @FXML
    private Button homeL;

    @FXML
    private TextField passwordL;

    @FXML
    private ChoiceBox<String> polL;

    @FXML
    private ChoiceBox<String> stranaL;
    static String email, password;

    @FXML
    void backLOA(ActionEvent event) {showStage("inew-view.fxml", "Marathon Skills 2016 – Register as a runner");
    }


    @FXML
    void emailLOA(ActionEvent event) {

    }

    @FXML
    void goRegOA(ActionEvent event) {
        email = emailL.getText();
        password = passwordL.getText();
        showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }



    @FXML
    void homeLOA(ActionEvent event) {showStage("main-view.fxml", "Marathon Skills 2016");
    }



    @FXML
    void passwordLOA(ActionEvent event) {

    }
    @FXML
    public void initialize() {
        polL.getItems().addAll("Мужской", "Женский");
        stranaL.getItems().addAll("Россия");
    }
}


