package by.koleso.terminal.console_controller;

import by.koleso.terminal.console_model.MainMenuConsoleModel;
import by.koleso.services.GameBoardService;
import by.koleso.terminal.console_view.MainMenuConsoleView;

public class MainMenuConsoleController extends AbstractConsoleController<MainMenuConsoleModel, MainMenuConsoleView> {
    GameBoardService gameBoardService = GameBoardService.getInstance();


    public MainMenuConsoleController() {
        super();
        model = MainMenuConsoleModel.builder()
                .withNumberActionOne(e -> {
                        new GameConsoleController().show();
                })
                .withNumberActionTwo(e -> {
                    System.exit(999999);
                })
                .build();
        view = new MainMenuConsoleView(model);

    }


}
