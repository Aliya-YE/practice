package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class CncController {

    @FXML
    private Button backL;

    @FXML
    private Button homeL;

    @FXML
    void backLOA(ActionEvent event) {showStage("sum-view.fxml" , "Marathon Skills 2016 – Register for an sum");
    }



    @FXML
    void homeLOA(ActionEvent event) {showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    }


