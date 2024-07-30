package by.koleso.terminal.console_controller;

import by.koleso.model.GameModel;
import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;

public class GameConsoleConsoleController extends AbstractConsoleController<GameModel> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private final GameBoard gameBoard;

    public GameConsoleConsoleController() {
        this.gameBoard = gameBoardService.newGame(5, 5);

//        model = GameModel.builder().withOnMoveAction(e -> {
//                    Button source = (Button) e.getSource();
//                    String text = source.getText();
//
//                    int value = text.equals("") ? 0 : Integer.valueOf(text);
//                    gameBoardService.move(gameBoard, value);
//                })
//
//                .build();

    }

}
