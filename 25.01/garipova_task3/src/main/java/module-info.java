module ru.garipova.garipova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task3 to javafx.fxml;
    exports ru.garipova.garipova_task3;
}