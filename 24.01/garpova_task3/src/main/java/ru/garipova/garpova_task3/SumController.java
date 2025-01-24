package ru.garipova.garpova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;

public class SumController {

    @FXML
    private Label aLabel;

    @FXML
    private Button btnPysk;

    @FXML
    private Label cLabel;

    @FXML
    private Label hLabel;

    @FXML
    private TextField numTextField;

    @FXML
    private Label sLabel;

    @FXML
    private TextField znaTextField;

    @FXML
    void btnPyskOnAction(ActionEvent event) {
        int num = Integer.parseInt(numTextField.getText());
        double zna = Double.parseDouble(znaTextField.getText());

        double a = 0;
        double c = 0;
        double h = 0;
        double S = 0;

        switch (num) {
            case 1:
                a = zna;
                c = a * sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 2:
                c = zna;
                a = c / sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 3:
                h = zna;
                c = 2 * h;
                a = c / sqrt(2);
                S = (c * h) / 2;
                break;
            case 4:
                S = zna;
                c = 2 * sqrt(2 * S);
                h = c / 2;
                a = h * sqrt(2);
                break;
            default:
                return;
        }

        aLabel.setText("Катет a: " + a);
        cLabel.setText("Гипотенуза c: " + c);
        hLabel.setText("Высота h: " + h);
        sLabel.setText("Площадь S: " + S);
    }
}







