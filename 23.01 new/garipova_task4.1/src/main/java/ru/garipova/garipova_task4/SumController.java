package ru.garipova.garipova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnVis;

    @FXML
    private TextField gTextField;

    @FXML
    private Label numLabel;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        int N = Integer.parseInt(gTextField.getText());
        if (N % 100 == 0)
            numLabel.setText("" +( N/100));
        else
            numLabel.setText("" + (N/100+1));
    }

}
