package by.koleso.terminal.controller;

import by.koleso.model.MainMenuModel;
import by.koleso.services.GameBoardService;
import javafx.application.Platform;

public class MainMenuController extends AbstractController<MainMenuModel> {
    GameBoardService gameBoardService = GameBoardService.getInstance();

    public MainMenuController() {
        super();
        model = MainMenuModel.builder().
                withNumberAction(e -> {


                        new GameController();
                    } else if (e == 2) {
                        Platform.exit();
                    }
                    ;

                }).
                build();
//        model = MainMenuModel.builder()
//                .withOnNewGameAction(event -> new GameController(stage).show())
//                .withOnExitAction(event -> Platform.exit())
//                .withOnSettingsAction(event -> new SettingsController(stage).show())
//                .build();
//        view = new MainMenuView(model);
    }


}
