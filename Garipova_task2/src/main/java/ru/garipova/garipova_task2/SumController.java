package ru.garipova.garipova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static java.lang.Math.abs;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private TextField proTextField;

    @FXML
    void btnPuskOnAction(ActionEvent event) {
        double A = Double.parseDouble(aTextField.getText());
        double B = Double.parseDouble(bTextField.getText());
        double C = Double.parseDouble(cTextField.getText());
        double k = abs(A-C);
        double l = abs(B-C);
        double m = k*l;
        proTextField.setText(""+m);



    }

}
