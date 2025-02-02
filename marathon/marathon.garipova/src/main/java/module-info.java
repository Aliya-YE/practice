module ru.garipova.marathongaripova {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.marathongaripova to javafx.fxml;
    exports ru.garipova.marathongaripova;
    exports ru.garipova.marathongaripova.controllers;
    opens ru.garipova.marathongaripova.controllers to javafx.fxml;
}