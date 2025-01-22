package ru.garipova.garipova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;


public class SumController {

    @FXML
    private Label Slabel;

    @FXML
    private Label Vlabel;

    @FXML
    private TextField aTextField;

    @FXML
    private Button dSumm;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        Vlabel.setText("V="+ pow(a,3));
        Slabel.setText("S"+6* pow(a,2));



    }

}
