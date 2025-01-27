package ru.garipova.garipova_task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int sum = data.get(0);
        int count = data.get(0);

        while (true) {
            int num = data.get(0);

            if (num == 0) {
                break;
            }

            if (num >= 100 && num <= 300) {
                sum += num;
                count++;
            }
        }

        double average = 0;
        if (count > 0) {
            average = (double) sum / count;
        } else {
            answerLable.setText("NO");

        }
        answerLable.setText("Среднее арифметическое трёхзначных чисел: %.2f\n" + average);
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
