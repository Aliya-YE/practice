module ru.garipova.garipova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garipova_task5 to javafx.fxml;
    exports ru.garipova.garipova_task5;
}