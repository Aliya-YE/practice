package ru.garipova.garipova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnOpr;

    @FXML
    private TextField kTextField;

    @FXML
    private Label resLabel;

    @FXML
    void btnOprOnAction(ActionEvent event) {
        int K = Integer.parseInt(kTextField.getText());
        if (K < 1 || K > 365) {
            resLabel.setText("Введите число K в диапазоне 1-365.");
            return;
        }
        int d = (3 + (K - 1)) % 7;
        if (d == 0) {
            d= 7;
        }
        resLabel.setText("День недели K: " + d);

    }

}
