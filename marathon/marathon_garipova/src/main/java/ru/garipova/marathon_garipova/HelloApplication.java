package ru.garipova.marathon_garipova;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.garipova.marathon_garipova.util.Manager;

import java.io.IOException;

public class HelloApplication extends Application {
    public HelloApplication(){
    }

    public void start(Stage stage) throws IOException {
        Manager.showMainStage(stage, "main-view.fxml", "Marathon Skills 2016");

    }

    public static void main(String[] args) {
        launch();
    }
}