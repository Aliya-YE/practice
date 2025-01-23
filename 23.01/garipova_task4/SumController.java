package ru.garipova.garipova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;
import static java.lang.Math.exp;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnVis;

    @FXML
    private Label reslabel;

    @FXML
    private TextField xTextField;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText());
        double b = Double.parseDouble(bTextField.getText());
        double x = Double.parseDouble(xTextField.getText());
        if (x > PI){
            double y = 1- exp(-a*x) * sin(a*x+b);
            reslabel.setText(""+y);
        } else if (PI <= x && x <= PI){
            double y = 1-exp(-a*x) * (a*x+b);
            reslabel.setText(""+y);
        }else {
            double y = 1-(exp(-a*x)+exp(-b*x));
            reslabel.setText(""+y);
        }

    }

}
