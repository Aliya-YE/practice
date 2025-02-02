package ru.garipova.marathon_garipova.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import static ru.garipova.marathon_garipova.util.Manager.showStage;

public class SumController {

    @FXML
    private Button RegL;

    @FXML
    private RadioButton V1;

    @FXML
    private RadioButton V2;

    @FXML
    private RadioButton V3;

    @FXML
    private Button backL;

    @FXML
    private Button homeL;

    @FXML
    private ComboBox<String> sumL;

    @FXML
    void RegLOA(ActionEvent event) {showStage("cnc-view.fxml" , "Marathon Skills 2016 – Registration confirmation");

    }

    @FXML
    void backLOA(ActionEvent event) {showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }


    @FXML
    void homeLOA(ActionEvent event) {showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    @FXML
    public void initialize() {
        sumL.getItems().addAll("Фонд Кошек", "Фонд Собак");
        ToggleGroup tg = new ToggleGroup();
        V1.setToggleGroup(tg);
        V2.setToggleGroup(tg);
        V3.setToggleGroup(tg);
    }
}
