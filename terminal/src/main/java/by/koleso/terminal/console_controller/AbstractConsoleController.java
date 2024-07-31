package by.koleso.terminal.console_controller;

import by.koleso.terminal.console_model.AbstractModel;
import by.koleso.terminal.console_view.AbstractConsoleView;

public abstract class AbstractConsoleController<M extends AbstractModel, V extends AbstractConsoleView> {

    protected M model;
    protected V view;


    public AbstractConsoleController() {

    }

    public void show() {
        view.getView();
    }

}
