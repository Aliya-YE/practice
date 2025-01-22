package ru.garipova.garipova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField sTextField;

    @FXML
    private TextField t1TextField;

    @FXML
    private TextField t2TextField;

    @FXML
    private TextField uTextField;

    @FXML
    private TextField vTextField;

    @FXML
    void btnPuskOnAction(ActionEvent event) {
        //double S = Double.parseDouble(sTextField.getText());
        double T1 = Double.parseDouble(t1TextField.getText());
        double T2 = Double.parseDouble(t2TextField.getText());
        double U = Double.parseDouble(uTextField.getText());
        double V = Double.parseDouble(vTextField.getText());
        if (U < V) {
            double S = T1 * V + T2 * (V - U);
            sTextField.setText("" + S);
        } else {
            sTextField.setText("Ошибка");
        }
    }
}
