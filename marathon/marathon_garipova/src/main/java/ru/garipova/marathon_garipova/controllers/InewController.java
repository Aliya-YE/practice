package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class InewController {

    @FXML
    private Button BackL;

    @FXML
    private Button homeL;

    @FXML
    private Button inewL;

    @FXML
    private Button iranL;

    @FXML
    private Button logL;


    @FXML
    void homeLOA(ActionEvent event) {showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    @FXML
    void inewLOA(ActionEvent event) {showStage("reg-view.fxml" , "Marathon Skills 2016 – Register as a runner");
    }
        public void BackLOA (ActionEvent actionEvent){ showStage("main-view.fxml", "Marathon Skills 2016");
        }


    @FXML
    void iranLOA(ActionEvent event) {showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }

    }

