package ru.garipova.garipova_task5_1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLable;

    @FXML
    private Button canselButton;

    @FXML
    private ListView <Integer>  dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int N = data.get(0);
        int max = 0;
        boolean hazZero = false;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m > max) {
                max = m;


            }
            if (m == 0)
                hazZero = true;

        }
        answerLable.setText("" + max + "" + hazZero );

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {

            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);

        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены неккоректные данные");
            alert.showAndWait();


        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void canselButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

}
