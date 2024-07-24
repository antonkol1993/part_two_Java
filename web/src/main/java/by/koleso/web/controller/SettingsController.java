package by.koleso.web.controller;

import by.koleso.enums_properties.ButtonBackgroundColour;
import by.koleso.enums_properties.ButtonFont;
import by.koleso.enums_properties.ButtonSize;
import by.koleso.enums_properties.ButtonTextColour;
import by.koleso.model.SettingsModel;
import by.koleso.model.SettingsTab;
import by.koleso.services.SettingsService;
import by.koleso.web.view.SettingsView;
import javafx.stage.Stage;

public class SettingsController extends AbstractController<SettingsModel, SettingsView> {

    private SettingsService settingsService = SettingsService.getInstance();

    public SettingsController(Stage stage) {
        super(stage);

        model = SettingsModel.builder()
                .withSettings(settingsService.getSettings())
                .withSettingsTab(SettingsTab.SIZE)
                .withOnSmallSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.SMALL);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnMediumSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.MEDIUM);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnLargeSizeAction(e -> {
                    settingsService.updateButtonType(ButtonSize.LARGE);
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                })
                .withOnBackAction(e -> {
                    new MainMenuController(stage).show();
                })
                .withOnSizeAction(e -> {
                    model.setSettingsTab(SettingsTab.SIZE);
                    view.refresh();

                }).
                withOnTextColourAction(e -> {
                    model.setSettingsTab(SettingsTab.TEXT_COLOUR);
                    view.refresh();
                }).
                withOnBackgroundColourAction(e -> {
                    model.setSettingsTab(SettingsTab.BACKGROUND_COLOUR);
                    view.refresh();

                }).
                withOnFontAction(e -> {
                    model.setSettingsTab(SettingsTab.FONT);
                    view.refresh();
                }).
                withOnBlackAction(e -> {
                    //TODO: update global settings
                    settingsService.updateTextColour(ButtonTextColour.BLACK.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                }).
                withOnRedAction(e -> {
                    settingsService.updateTextColour(ButtonTextColour.RED.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnGreenAction(e -> {
                    settingsService.updateTextColour(ButtonTextColour.GREEN.getTextColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnThinFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.THIN_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnMediumFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.MEDIUM_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnBoldFontAction(e -> {
                    settingsService.updateFontWeight(ButtonFont.BOLD_FONT.getFont());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnGrayButtonAction(e -> {
                    settingsService.updateBackgroundColour(ButtonBackgroundColour.LIGHT_GREY.getBackgroundColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnPinkButtonAction(e -> {
                    settingsService.updateBackgroundColour(ButtonBackgroundColour.PINK.getBackgroundColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();

                }).
                withOnVioletButtonAction(e -> {
                    settingsService.updateBackgroundColour(ButtonBackgroundColour.VIOLET.getBackgroundColour());
                    model.setSettings(settingsService.getSettings());
                    view.refresh();
                }).
                withOnSizeInGameAction(e -> {
                    settingsService.updateBackgroundColour(ButtonBackgroundColour.VIOLET.getBackgroundColour());
                    model.setSettings(settingsService.getSettings());
                })
                .build();

        view = new SettingsView(model);
    }


}
