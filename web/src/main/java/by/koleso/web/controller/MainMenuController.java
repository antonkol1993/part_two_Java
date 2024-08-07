package by.koleso.web.controller;

import by.koleso.model.MainMenuModel;
import by.koleso.services.SettingsService;
import by.koleso.web.view.MainMenuView;
import javafx.application.Platform;
import javafx.stage.Stage;

public class MainMenuController extends AbstractController<MainMenuModel, MainMenuView> {
    private  SettingsService instance = SettingsService.getInstance();
    public MainMenuController(Stage stage) {
        super(stage);
        model = MainMenuModel.builder()
                .withSettings(instance.getSettings())
                .withOnNewGameAction(event -> new GameController(stage).show())
                .withOnExitAction(event -> Platform.exit())
                .withOnSettingsAction(event -> new SettingsController(stage).show())
                .build();
        view = new MainMenuView(model);
    }


}
