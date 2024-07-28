package by.koleso.terminal.controller;

import by.koleso.model.MainMenuModel;
import by.koleso.services.SettingsService;
import javafx.application.Platform;
import javafx.stage.Stage;

public class MainMenuController extends AbstractController<MainMenuModel> {
    private  SettingsService instance = SettingsService.getInstance();
    public MainMenuController() {
        super();
//        model = MainMenuModel.builder()
//                .withOnNewGameAction(event -> new GameController(stage).show())
//                .withOnExitAction(event -> Platform.exit())
//                .withOnSettingsAction(event -> new SettingsController(stage).show())
//                .build();
//        view = new MainMenuView(model);
    }


}
