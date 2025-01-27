module ru.garipova.garipova_task5_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.garipova.garipova_task5_1 to javafx.fxml;
    exports ru.garipova.garipova_task5_1;
}