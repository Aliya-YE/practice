package ru.garipova.garipova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnVis;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resLabel;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText());
        if (N <= 1) {
            resLabel.setText("Введите число больше 1!");
            return;
        }
        int K = 0;
        int sum = 0;
        while (sum + (K + 1) <= N) {
            K++;
            sum += K;
        }
        resLabel.setText("K: " + K + ", Сумма: " + sum);

    }

}
