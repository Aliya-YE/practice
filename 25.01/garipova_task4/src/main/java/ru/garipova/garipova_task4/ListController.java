package ru.garipova.garipova_task4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

import static java.lang.Math.pow;

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
        try {
            List<Double> data = dataListView.getItems();

            if (data.size() < 2) {
                answerLable.setText("Должно быть как минимум 2 числа в списке.");
                return;
            }

            double x = data.get(0);
            int n = (int) (double) data.get(1);
            if (n <= 0) {
                answerLable.setText("N должно быть больше 0.");
                return;
            }

            double sinX = 0.0;

            for (int i = 0; i < n; i++) {
                double term = pow(-1, i) * pow(x, 2 * i + 1) / factorial(2 * i + 1);
                sinX += term;
            }

            answerLable.setText(String.format("Приближенное значение sin(%.2f) при N=%d: %.6f", x, n, sinX));
        } catch (NumberFormatException e) {
            answerLable.setText("Введите корректные числа для X и N.");
        } catch (IndexOutOfBoundsException e) {
            answerLable.setText("Недостаточно данныx для вычисления.");
        }
    }

    private double factorial(int i) {
        return 0;
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

    }}


