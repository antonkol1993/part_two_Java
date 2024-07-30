package by.koleso.terminal.console_controller;

import by.koleso.terminal.console_model.MainMenuConsoleModel;
import by.koleso.services.GameBoardService;

public class MainMenuConsoleConsoleController extends AbstractConsoleController<MainMenuConsoleModel> {
    GameBoardService gameBoardService = GameBoardService.getInstance();

    public MainMenuConsoleConsoleController() {
        super();
        model = MainMenuConsoleModel.builder()
                .withNumberAction((Integer) e -> {
                    Integer sadas = e;
                    if (e == 1) {
                        new GameConsoleConsoleController();
                    }
                    else if (e == 0) {
                        System.exit(0);
                    }
                })
                .build();
    }


}
