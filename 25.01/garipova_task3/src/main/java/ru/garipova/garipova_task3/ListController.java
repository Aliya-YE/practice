package ru.garipova.garipova_task3;

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
    private ListView<Double> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Double> data = dataListView.getItems();
        if (data.isEmpty()) {
            answerLable.setText("Список цен пуст.");
            return;
        }

        double pricePerKg = data.get(0);
        StringBuilder result = new StringBuilder();

        for (double kg = 1.2; kg <= 2.0; kg += 0.2) {
            double totalCost = pricePerKg * kg;
            result.append(String.format("Стоимость %.1f кг конфет: %.2f\n", kg, totalCost));
        }

        answerLable.setText(result.toString());
    }


    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {

            double x = Double.parseDouble(numberTextField.getText().toString());
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
