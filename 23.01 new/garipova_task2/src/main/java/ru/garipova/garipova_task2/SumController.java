package ru.garipova.garipova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnVis;

    @FXML
    private TextField cTextField;

    @FXML
    private Label resLabel;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        int num1 = Integer.parseInt(aTextField.getText());
        int num2 = Integer.parseInt(bTextField.getText());
        int num3 = Integer.parseInt(cTextField.getText());
        int positiveCount = 0;
        int negativeCount = 0;
        int[] numbers = {num1, num2, num3};
        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        resLabel.setText("Положительные: " + positiveCount + ", Отрицательные: " + negativeCount);
    }
    }






