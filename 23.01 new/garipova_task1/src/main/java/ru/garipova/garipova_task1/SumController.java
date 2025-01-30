package ru.garipova.garipova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button btnPro;

    @FXML
    private Label resLabel;

    @FXML
    void btnProOnAction(ActionEvent event) {
        int N = Integer.parseInt(aTextField.getText());
        if (N < 10 || N > 99) {
            resLabel.setText("Введите двузначное число!");
            return;
        }
        int A = N/ 10;
        int B = N % 10;
        if (A == B) {
            resLabel.setText("Цифры одинаковы.");
        } else {
            resLabel.setText("Цифры разные.");
        }
    }
    }






