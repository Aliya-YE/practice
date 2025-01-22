package ru.garipova.garipova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField xTextField;

    @FXML
    void btnPuskOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText());
        double x = Double.parseDouble(xTextField.getText());
        if (x!=-1){
            double p=1/cos(x)+log(abs(tan(x/2)))+(x/1+x/1+x);
            double A = pow(p,5)*sqrt(a*pow(x,3)+2)/2*cos(x);
            ATextField.setText(""+A);

        }else {
            ATextField.setText("Ошибка");
        }

    }

}
