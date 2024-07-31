package by.koleso.terminal.console_view;

import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;
import by.koleso.services.SettingsService;
import by.koleso.terminal.console_model.GameConsoleModel;

import java.util.Scanner;

public class GameConsoleView implements AbstractConsoleView {
    private GameConsoleModel model;
    GameBoardService gameBoardService = GameBoardService.getInstance();
    GameBoard gameBoard;
    Scanner scanner = new Scanner(System.in);

    public GameConsoleView(GameConsoleModel model) {
        this.model = model;
        this.gameBoard = gameBoardService.newGame(5, 5);
    }

    @Override
    public void getView() {
        System.out.println(gameBoard);
        int move = scanner.nextInt();
        

        //todo the code is doing

//        do {
//            int choice = scanner.nextInt();
//
//            gameBoardService.move(gameBoard, choice);
//            System.out.println(gameBoard);
//        } while (!gameBoardService.reviewToWin(gameBoard));
    }

    @Override
    public void refresh() {

    }
}
