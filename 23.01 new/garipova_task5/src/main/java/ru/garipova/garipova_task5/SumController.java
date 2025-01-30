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
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void btnVisOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText());
        double y = Double.parseDouble(yTextField.getText());
        if (y < x && y < 12 * x) {
            resLabel.setText("Да");
        } else if (y == x || y == 12 * x) {
            resLabel.setText("На границе");
        } else {
            resLabel.setText("Нет");
        }

    }

}
