module ru.garipova.garipova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task4 to javafx.fxml;
    exports ru.garipova.garipova_task4;
}