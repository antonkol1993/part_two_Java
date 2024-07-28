package by.koleso.terminal.controller;

import by.koleso.model.Model;
import javafx.stage.Stage;

public abstract class AbstractController<M extends Model> {

    public static final int V = 600;
    private final Stage stage;
    protected M model;

    public AbstractController(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        System.out.println(model);
    }

}
