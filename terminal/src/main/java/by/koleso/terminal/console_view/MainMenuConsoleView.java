package by.koleso.terminal.console_view;

import by.koleso.terminal.console_model.MainMenuConsoleModel;

public class MainMenuConsoleView implements AbstractConsoleView {
    MainMenuConsoleModel model;
    public MainMenuConsoleView(MainMenuConsoleModel model) {
        this.model = model;
    }


    @Override
    public void getView() {
        System.out.println("1 = New game ");
        System.out.println("\n\n ");
        System.out.println("2 = Exit Platform");

    }

    @Override
    public void refresh() {

    }
}
