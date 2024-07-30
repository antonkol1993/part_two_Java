package by.koleso.terminal.console_view;

import by.koleso.model.MainMenuModel;

public class MainMenuConsoleView implements ConsoleView {
    MainMenuModel model;
    public MainMenuConsoleView(MainMenuModel model) {
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
