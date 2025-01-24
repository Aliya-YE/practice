package ru.garipova.garipova_task2;

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
    private Button btnOpr;

    @FXML
    private Label resLabel;

    @FXML
    void btnOprOnAction(ActionEvent event) {
        int N = Integer.parseInt(aTextField.getText());
        int M = Integer.parseInt(bTextField.getText());
        if (N < 6 || N > 14 || M < 1 || M >4)
        {
            resLabel.setText("Некорректные входные данные");
            return;
        }
        String[] suits = {"пики", "трефы", "бубны", "черви"};
        String[] values = {"шестерка", "семерка", "восьмерка", "девятка", "десятка", "валет", "дама", "король", "туз"};
        String card = values [ N - 6 ] + " " + suits [ M - 1 ];
        resLabel.setText(card);


    }

}
