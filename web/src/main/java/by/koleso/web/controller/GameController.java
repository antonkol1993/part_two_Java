package by.koleso.web.controller;

import by.koleso.model.GameModel;
import by.koleso.model.gameBoard.GameBoard;
import by.koleso.services.GameBoardService;
import by.koleso.services.SettingsService;
import by.koleso.web.view.GameView;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GameController extends AbstractController<GameModel, GameView> {
    private final GameBoardService gameBoardService = GameBoardService.getInstance();
    private final GameBoard gameBoard;
    private SettingsService settingsService = SettingsService.getInstance();

    public GameController(Stage stage) {
        super(stage);
        this.gameBoard = gameBoardService.newGame(5, 5);

        model = GameModel.builder().withOnMoveAction(e -> {
                    Button source = (Button) e.getSource();
                    String text = source.getText();

                    int value = text.equals("") ? 0 : Integer.valueOf(text);
                    gameBoardService.move(gameBoard, value);
                    view.refresh();
                })
                .withGameboard(gameBoard)
                .withSettings(settingsService.getSettings())
                .withOnBackAction(e -> {
                    new MainMenuController(stage).show();
                })
                .build();


        view = new GameView(model);
    }

}
