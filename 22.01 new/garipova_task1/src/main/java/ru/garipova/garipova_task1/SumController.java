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
    private TextField bTextField;

    @FXML
    private Button btnVis;

    @FXML
    private Label resLabel;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText());
        int B = Integer.parseInt(bTextField.getText());
        if (A <= B) {
           resLabel.setText("Значение A должно быть больше B!");
            return;
        }
        int unusedLength = A % B;
        resLabel.setText("Длина незанятой части отрезка A: " + unusedLength);

    }
}





