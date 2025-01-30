module ru.garipova.garipova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task1 to javafx.fxml;
    exports ru.garipova.garipova_task1;
}