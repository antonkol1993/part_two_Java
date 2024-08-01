package by.koleso.web.view;

import by.koleso.model.SettingsModel;
import by.koleso.model.SettingsTab;
import by.koleso.services.ButtonBuilder;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsView implements View {
    private SettingsModel model;

    public VBox box = new VBox();
    private Label settingsLabel;

    // size button
    private Button smallSizeButton;
    private Button mediumSizeButton;
    private Button largeSizeButton;
    private Button backInSizeButton;

    // text colour button
    private Button blackTextButton;
    private Button redTextButton;
    private Button whiteTextButton;
    private Button backInTextButton;

    // font button
    private Button thinFontButton;
    private Button mediumFontButton;
    private Button boldFontButton;
    private Button backInFontButton;

    // head menu button
    private Button sizeButton;
    private Button textColourButton;
    private Button backgroundColorButton;
    private Button fontButton;
    private Button sizeInGameButton;


    // background colours button
    private Button grayBackGroundButton;
    private Button violetBackGroundButton;
    private Button pinkBackGroundButton;
    private Button backInBackgroundColorButton;

    // size in Game buttons
    private Button smallSquareButton;
    private Button mediumSquareButton;
    private Button largeSquareButton;
    private Button backInGameButtonInSquare;

    // view sources
    private Parent sizeView;
    private Parent textColorView;
    private Parent fontView;
    private Parent backgroundColorView;
    private Parent sizeSquaresInGameView;

    public SettingsView(SettingsModel model) {
        this.model = model;
    }

    @Override
    public Parent getView() {

        settingsLabel = new Label();
        settingsLabel.setText("Settings");


        box.setAlignment(Pos.TOP_CENTER);
        box.getChildren().add(settingsLabel);


        GridPane headButtons = new GridPane();
        headButtons.setAlignment(Pos.CENTER);
        headButtons.setPadding(new Insets(5.0, 5.0, 5.0, 5.0));

        sizeButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Size").
                withOnAction(model.getOnSizeButtonAction()).
                withTextColour(Color.RED).
                withButtonColour(Color.LIGHTBLUE).
                build();
        headButtons.add(sizeButton, 0, 0);

        textColourButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Colour").
                withOnAction(model.getOnTextColourAction()).
                withTextColour(Color.DARKBLUE).
                withButtonColour(Color.LIGHTBLUE).
                build();
        headButtons.add(textColourButton, 1, 0);

        fontButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Font").
                withOnAction(model.getOnFontButtonAction()).
                withTextColour(Color.ORANGE).
                withButtonColour(Color.LIGHTBLUE).
                build();
        headButtons.add(fontButton, 2, 0);

        backgroundColorButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Background color").
                withOnAction(model.getOnBackgroundColourAction()).
                withTextColour(Color.GREEN).
                withButtonColour(Color.LIGHTBLUE).
                build();

        headButtons.add(backgroundColorButton, 0, 1);

        sizeInGameButton = ButtonBuilder.get().
                withFontSize(model.getSettings().getButtonType().getSize()).
                withFontWeight(model.getSettings().getFontWeight()).
                withText("Size in board").
                withOnAction(model.getOnSizeInGameAction()).
                withTextColour(Color.BLACK).
                withButtonColour(Color.LIGHTBLUE).
                build();
        headButtons.add(sizeInGameButton, 1, 1);

        box.getChildren().add(headButtons);

        sizeView = sizeButtons();
        textColorView = textColoursButtons();
        fontView = fontView();
        backgroundColorView = buttonColorView();
        sizeSquaresInGameView = sizeSquaresInGameView();

        Parent view = switch (model.getSettingsTab()) {
            case SIZE -> sizeView;
            case TEXT_COLOUR -> textColorView;
            case BACKGROUND_COLOUR -> backgroundColorView;
            case FONT -> fontView;
            case SIZE_SQUARES_IN_GAME -> sizeSquaresInGameView;
        };
        box.getChildren().add(view);
        return box;
    }

    private Parent sizeSquaresInGameView() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);

        smallSquareButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("small square")
//                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();

        vBox.getChildren().add(smallSquareButton);

        mediumSquareButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium square")
//                .withOnAction(model.getOnVioletButtonAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(mediumSquareButton);

        largeSquareButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Large square")
//                .withOnAction(model.getOnPinkButtonAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(largeSquareButton);

        backInGameButtonInSquare = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(backInGameButtonInSquare);
        return vBox;
    }

    private Parent buttonColorView() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);

        grayBackGroundButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Gray")
                .withOnAction(model.getOnGrayButtonAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();

        vBox.getChildren().add(grayBackGroundButton);

        pinkBackGroundButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Violet")
                .withOnAction(model.getOnVioletButtonAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(pinkBackGroundButton);

        violetBackGroundButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Pink")
                .withOnAction(model.getOnPinkButtonAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(violetBackGroundButton);

        backInBackgroundColorButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(backInBackgroundColorButton);
        return vBox;
    }

    private Parent sizeButtons() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);

        smallSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Small size")
                .withOnAction(model.getOnSmallSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(smallSizeButton);

        mediumSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium size")
                .withOnAction(model.getOnMediumSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(mediumSizeButton);

        largeSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Large size")
                .withOnAction(model.getOnLargeSizeAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
//        largeSizeButton.setBackground(Background.fill(Color.WHITESMOKE));
//         largeSizeButton.setStyle(mediumSizeButton.getStyle());
        vBox.getChildren().add(largeSizeButton);

        backInSizeButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(backInSizeButton);
        return vBox;
    }

    private Parent textColoursButtons() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);

        blackTextButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Black")
                .withOnAction(model.getOnBlackTextAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(blackTextButton);


        redTextButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Red")
                .withOnAction(model.getOnRedTextAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(redTextButton);


        whiteTextButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Green")
                .withOnAction(model.getOnGreenTextAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(whiteTextButton);


        backInTextButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .withButtonColour(model.getSettings().getBackgroundColour())
                .build();
        vBox.getChildren().add(backInTextButton);
        return vBox;
    }

    private Parent fontView() {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setAlignment(Pos.CENTER);
//        vBox.setBackground(Background.fill(Color.LIGHTBLUE));

        thinFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Thin font")
                .withOnAction(model.getOnThinFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(thinFontButton);


        mediumFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Medium font")
                .withOnAction(model.getOnMediumFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(mediumFontButton);


        boldFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Bold font")
                .withOnAction(model.getOnBoldFontAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();
        vBox.getChildren().add(boldFontButton);


        backInFontButton = ButtonBuilder.get()
                .withFontSize(model.getSettings().getButtonType().getSize())
                .withFontWeight(model.getSettings().getFontWeight())
                .withText("Back")
                .withOnAction(model.getOnBackAction())
                .withTextColour(model.getSettings().getTextColour())
                .build();

        vBox.getChildren().add(backInFontButton);
        return vBox;
    }

    @Override
    public void refresh() {
        int newSize = model.getSettings().getButtonType().getSize();
        FontWeight fontWeight = model.getSettings().getFontWeight();
        SettingsTab settingsTab = model.getSettingsTab();
        Paint textColour = model.getSettings().getTextColour();
        Paint buttonColour = model.getSettings().getBackgroundColour();


        settingsLabel.setFont(Font.font(null, fontWeight, newSize));
        settingsLabel.setTextFill(textColour);

        // submenu area
        sizeButton.setFont(Font.font(null, fontWeight, newSize));
        sizeButton.setTextFill(Color.RED);
//        sizeButton.setBackground(Background.fill(buttonColour));

        textColourButton.setFont(Font.font(null, fontWeight, newSize));
        textColourButton.setTextFill(Color.BLUE);
//        textColourButton.setBackground(Background.fill(buttonColour));
        fontButton.setFont(Font.font(null, fontWeight, newSize));
        fontButton.setTextFill(Color.ORANGE);
//        fontButton.setBackground(Background.fill(buttonColour));
        backgroundColorButton.setFont(Font.font(null, fontWeight, newSize));
        backgroundColorButton.setTextFill(Color.GREEN);
//        backgroundColorButton.setBackground(Background.fill(buttonColour));
        sizeInGameButton.setFont(Font.font(null, fontWeight, newSize));
//        sizeInGameButton.setTextFill(Color.GREEN);
//        backgroundColorButton.setBackground(Background.fill(buttonColour));

        // size menu area
        smallSizeButton.setFont(Font.font(null, fontWeight, newSize));
        smallSizeButton.setTextFill(textColour);
        smallSizeButton.setBackground(Background.fill(buttonColour));
        mediumSizeButton.setFont(Font.font(null, fontWeight, newSize));
        mediumSizeButton.setTextFill(textColour);
        mediumSizeButton.setBackground(Background.fill(buttonColour));
        largeSizeButton.setFont(Font.font(null, fontWeight, newSize));
        largeSizeButton.setTextFill(textColour);
        largeSizeButton.setBackground(Background.fill(buttonColour));
        backInSizeButton.setFont(Font.font(null, fontWeight, newSize));
        backInSizeButton.setTextFill(textColour);
        backInSizeButton.setBackground(Background.fill(buttonColour));

        // color menu area
        blackTextButton.setFont(Font.font(null, fontWeight, newSize));
        blackTextButton.setTextFill(textColour);
        blackTextButton.setBackground(Background.fill(buttonColour));
        redTextButton.setFont(Font.font(null, fontWeight, newSize));
        redTextButton.setTextFill(textColour);
        redTextButton.setBackground(Background.fill(buttonColour));
        whiteTextButton.setFont(Font.font(null, fontWeight, newSize));
        whiteTextButton.setTextFill(textColour);
        whiteTextButton.setBackground(Background.fill(buttonColour));
        backInTextButton.setFont(Font.font(null, fontWeight, newSize));
        backInTextButton.setTextFill(textColour);
        backInTextButton.setBackground(Background.fill(buttonColour));

        // font menu area
        thinFontButton.setFont(Font.font(null, fontWeight, newSize));
        thinFontButton.setTextFill(textColour);
        thinFontButton.setBackground(Background.fill(buttonColour));
        mediumFontButton.setFont(Font.font(null, fontWeight, newSize));
        mediumFontButton.setTextFill(textColour);
        mediumFontButton.setBackground(Background.fill(buttonColour));
        boldFontButton.setFont(Font.font(null, fontWeight, newSize));
        boldFontButton.setTextFill(textColour);
        boldFontButton.setBackground(Background.fill(buttonColour));
        backInFontButton.setFont(Font.font(null, fontWeight, newSize));
        backInFontButton.setTextFill(textColour);
        backInFontButton.setBackground(Background.fill(buttonColour));

        // button's background color  menu area
        grayBackGroundButton.setFont(Font.font(null, fontWeight, newSize));
        grayBackGroundButton.setTextFill(textColour);
        grayBackGroundButton.setBackground(Background.fill(buttonColour));
        violetBackGroundButton.setFont(Font.font(null, fontWeight, newSize));
        violetBackGroundButton.setTextFill(textColour);
        violetBackGroundButton.setBackground(Background.fill(buttonColour));
        pinkBackGroundButton.setFont(Font.font(null, fontWeight, newSize));
        pinkBackGroundButton.setTextFill(textColour);
        pinkBackGroundButton.setBackground(Background.fill(buttonColour));
        backInBackgroundColorButton.setFont(Font.font(null, fontWeight, newSize));
        backInBackgroundColorButton.setTextFill(textColour);
        backInBackgroundColorButton.setBackground(Background.fill(buttonColour));



        Parent view = switch (settingsTab) {
            case SIZE -> sizeView;
            case TEXT_COLOUR -> textColorView;
            case BACKGROUND_COLOUR -> backgroundColorView;
            case FONT -> fontView;
            case SIZE_SQUARES_IN_GAME -> sizeSquaresInGameView;
        };
        box.getChildren().remove(2);
        box.getChildren().add(view);
//        view.refresh(); // при выносе в отдельный класс


    }
}
