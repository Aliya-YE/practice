package ru.garipova.garipova_task6;

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
        if (N <= 0) {
            resLabel.setText("Введите число больше 0.");
            return;
        }

        boolean A = false;

        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                A = true;
                break;
            }
            N /= 10;
        }

        resLabel.setText(A ? "true" : "false");

    }

}
