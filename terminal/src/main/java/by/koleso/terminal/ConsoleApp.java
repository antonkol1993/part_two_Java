package by.koleso.terminal;

import by.koleso.model.MainMenuModel;
import by.koleso.terminal.console.MainMenuConsoleView;

public class ConsoleApp {
    public static void main(String[] args) {
        MainMenuModel mainMenuModel = new MainMenuModel();
    new MainMenuConsoleView(mainMenuModel).getView();

    }
}
