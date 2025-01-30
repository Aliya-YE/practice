module ru.garipova.garipova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task2 to javafx.fxml;
    exports ru.garipova.garipova_task2;
}