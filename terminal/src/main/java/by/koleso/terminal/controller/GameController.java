package by.koleso.terminal.controller;

import by.koleso.model.GameModel;
import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GameController extends AbstractController<GameModel> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private final GameBoard gameBoard;

    public GameController(Stage stage) {
        this.gameBoard = gameBoardService.newGame(5, 5);

        model = GameModel.builder().withOnMoveAction(e -> {
                    Button source = (Button) e.getSource();
                    String text = source.getText();

                    int value = text.equals("") ? 0 : Integer.valueOf(text);
                    gameBoardService.move(gameBoard, value);
                })

                .build();

    }

}
