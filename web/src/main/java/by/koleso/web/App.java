package by.koleso.web;

import by.koleso.web.controller.MainMenuController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        new MainMenuController(stage).show();
    }

    @Override
    public void stop() {
        System.out.println("game piatnashki is over");
    }
}
