module ru.garipova.marathon_garipova {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.garipova.marathon_garipova to javafx.fxml;
    exports ru.garipova.marathon_garipova;
    opens controllers to javafx.fxml;
    exports ru.garipova.marathon_garipova.controllers;
    opens ru.garipova.marathon_garipova.controllers to javafx.fxml;
    exports ru.garipova.marathon_garipova.util;
    opens ru.garipova.marathon_garipova.util to javafx.fxml;
}