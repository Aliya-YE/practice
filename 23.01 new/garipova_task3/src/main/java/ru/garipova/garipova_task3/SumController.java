package ru.garipova.garipova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.max;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnSum;

    @FXML
    private TextField cTextField;

    @FXML
    private Label resLabel;

    @FXML
    void btnSumOnAction(ActionEvent event) {
        double num1 = Double.parseDouble(aTextField.getText());
        double num2 = Double.parseDouble(bTextField.getText());
        double num3 = Double.parseDouble(cTextField.getText());
        double m1 = max(num1, max(num2, num3));
        double m2;

        if (m1 == num1) {
            m2 = max(num2, num3);
        } else if (m1 == num2) {
            m2 = max(num1, num3);
        } else {
            m2 = max(num1, num2);
        }
        double sum = m1 + m2;
        resLabel.setText("Сумма двух наибольших: " + sum);
    }
    }

