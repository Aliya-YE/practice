package ru.garipova.garipova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnVis;

    @FXML
    private TextField kTextField;

    @FXML
    private Label resLabel;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        int N = Integer.parseInt(kTextField.getText());
        int Second = 60;
        int Min = N % Second;
        resLabel.setText("Секунд с начала последней минуты: " + Min);

    }

}
