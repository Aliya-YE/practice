package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class MainController {

    @FXML
    private Button LogL;

    @FXML
    private Button SponBeg;

    @FXML
    private Button backL;

    @FXML
    private Button begL;

    @FXML
    void LogLOA(ActionEvent event) {

    }

    @FXML
    void SponBegOA(ActionEvent event) {

    }

    @FXML
    void backLOA(ActionEvent event) {

    }

    @FXML
    void begLOA(ActionEvent event) {
        showStage("main-view.fxml", "Marathon Skills 2016 – Register as a runner");
    }

}
