package by.koleso.enums_properties;

public enum GameButtonSize {

    SMALL_SIZE_GAMEBUTTON(40),
    MEDIUM_SIZE_GAMEBUTTON(60),
    LARGE_SIZE_GAMEBUTTON(90);

    private final double font;


    GameButtonSize(double font) {
        this.font = font;
    }

    public double getFont() {
        return font;
    }

}
