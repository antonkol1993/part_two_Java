package by.koleso.terminal.console_controller;

import by.koleso.model.GameModel;
import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;
import by.koleso.terminal.console_model.GameConsoleModel;
import by.koleso.terminal.console_view.GameConsoleView;

public class GameConsoleController extends AbstractConsoleController<GameConsoleModel, GameConsoleView> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private final GameBoard gameBoard;

    @Override
    public void show() {
        view.getView();
    }

    public GameConsoleController() {
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

        model = GameConsoleModel.builder()
                .withMoveAction(e -> {
                    int number = e;
                    gameBoardService.move(gameBoard,number);
                })
                .build();

        view = new GameConsoleView(model);
    }

}
