package by.koleso.terminal.console.view;

import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;

import java.util.Scanner;

public class GameConsoleView {
    GameBoardService gameBoardService = GameBoardService.getInstance();
    GameBoard gameBoard;
    Scanner scanner = new Scanner(System.in);


    public void view() {
        gameBoard = gameBoardService.newGame(5, 5);
        do {

            System.out.println(gameBoard);
            System.out.println("\nEnter the number");
            System.out.println("\n\nExit (0)");
            int moveNumber = scanner.nextInt();
            gameBoardService.move(gameBoard, moveNumber);
            if (moveNumber == 0) {
                new MainMenuConsoleView().view();
            }
        } while (!gameBoardService.reviewToWin(gameBoard));
    }

}
