package by.koleso.terminal.console_controller;

import by.koleso.terminal.console_model.MainMenuConsoleModel;
import by.koleso.services.GameBoardService;
import by.koleso.terminal.console_view.MainMenuConsoleView;

public class MainMenuConsoleController extends AbstractConsoleController<MainMenuConsoleModel, MainMenuConsoleView> {
    GameBoardService gameBoardService = GameBoardService.getInstance();


    public MainMenuConsoleController() {
        super();
        model = MainMenuConsoleModel.builder()
                .withNumberAction( e -> {
                    if (e == 1) {
                        new GameConsoleController();
                    }
                    else if (e == 0) {
                        System.exit(0);
                    }
                })
                .build();
         view = new MainMenuConsoleView(model);

    }


}
