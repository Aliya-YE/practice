module ru.garipova.garipova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task6 to javafx.fxml;
    exports ru.garipova.garipova_task6;
}