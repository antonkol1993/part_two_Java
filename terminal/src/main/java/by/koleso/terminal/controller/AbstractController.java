package by.koleso.terminal.controller;

import by.koleso.model.Model;
import javafx.stage.Stage;

public abstract class AbstractController<M extends Model> {

    public static final int V = 600;
    protected M model;

    public AbstractController() {

    }

    public void refresh() {
        System.out.println(model);
    }

}
