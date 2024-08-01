package by.koleso.terminal;

import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;
import by.koleso.terminal.console_view.GameConsoleView;
import by.koleso.terminal.console_view.MainMenuConsoleView;

public class ConsoleApp {
    public static void main(String[] args) {

        new MainMenuConsoleView().view();

    }
}
