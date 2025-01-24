package ru.garipova.garipova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.log;

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
        if (N > 0 && (N & (N - 1)) == 0) {
            int K = (int)  (log(N) / log(2));
            resLabel.setText("K = " + K);
        } else {
            resLabel.setText("Введите степень 2.");
        }
    }

    {

    }}





