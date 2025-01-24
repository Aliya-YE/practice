module ru.garipova.garpova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.garpova_task3 to javafx.fxml;
    exports ru.garipova.garpova_task3;
}