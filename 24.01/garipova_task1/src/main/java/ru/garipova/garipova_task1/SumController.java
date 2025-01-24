package ru.garipova.garipova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnPu;

    @FXML
    private TextField numTextField;

    @FXML
    private TextField oneTextField;

    @FXML
    private Label resLabel;

    @FXML
    private TextField twoTextField;

    @FXML
    void btnPuOnAction(ActionEvent event) {
        int num = Integer.parseInt(numTextField.getText());
        double A = Double.parseDouble(oneTextField.getText());
        double B = Double.parseDouble(twoTextField.getText());
        double res = 0.0;
        switch (num){
            case 1:
                res = A + B;
                break;
            case 2:
                res = A - B;
                break;
            case 3:
                res = A * B;
                break;
            case 4:
                if (B != 0){
                    res = A / B;
                }else {
                    resLabel.setText("Деление на ноль");
                    return;
                }
                break;
            default:
                resLabel.setText("Неверный номер действия");
                return;
            } resLabel.setText("Результат"+ res);
        }

    }

