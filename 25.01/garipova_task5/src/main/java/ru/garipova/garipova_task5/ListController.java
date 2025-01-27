package ru.garipova.garipova_task5;

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
        if (isAnyInputEmpty()) {
            answerLabel.setText("Все поля должны быть заполнены.");
            return;
        }

        try {
            int n = Integer.parseInt(nInput.getText());
            if (n < 2) {
                answerLabel.setText("n должно быть натуральным числом и >= 2.");
                return;
            }

            double c = Double.parseDouble(cInput.getText());
            double d = Double.parseDouble(dInput.getText());
            double q = Double.parseDouble(qInput.getText());
            double r = Double.parseDouble(rInput.getText());
            double b = Double.parseDouble(bInput.getText());

            double[] x = new double[n + 1];
            x[0] = c;
            x[1] = d;

            for (int k = 2; k <= n; k++) {
                x[k] = q * x[k - 1] + r * x[k - 2] + b;
            }

            answerLabel.setText(String.format("x_%d = %.6f", n, x[n]));
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите корректные числа для всех полей.");
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        String inputText = numberTextField.getText().trim();

        if (inputText.isEmpty()) {
            return;
        }

        try {
            double x = Double.parseDouble(inputText);
            if (!dataListView.getItems().contains(x)) { // Проверка на дубликаты
                dataListView.getItems().add(x);
            } else {
                showAlert("Введенное значение уже существует в списке.");
            }
        } catch (NumberFormatException ex) {
            showAlert("Введены некорректные данные.");
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        // Безопасный выход из приложения
        Platform.exit();
    }

    // Вспомогательный метод для проверки пустоты полей ввода
    private boolean isAnyInputEmpty() {
        return cInput.getText().isEmpty() || dInput.getText().isEmpty() ||
                qInput.getText().isEmpty() || rInput.getText().isEmpty() ||
                bInput.getText().isEmpty() || nInput.getText().isEmpty();
    }

    // Вспомогательный метод для показа алерта
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.showAndWait();
    }}
