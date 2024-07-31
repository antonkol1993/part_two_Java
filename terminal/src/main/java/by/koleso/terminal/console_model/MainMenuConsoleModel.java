package by.koleso.terminal.console_model;

import java.util.Objects;

public class MainMenuConsoleModel extends AbstractModel {
    private final Functionable<Integer> numberActionOne;
    private final Functionable<Integer> numberActionTwo;

    private MainMenuConsoleModel(Functionable<Integer> numberActionOne,
                                 Functionable<Integer> numberActionTwo
    ) {
        Objects.requireNonNull(numberActionOne, "numberAction can't be null");
        Objects.requireNonNull(numberActionTwo, "numberActionTwo can't be null");

        this.numberActionOne = numberActionOne;
        this.numberActionTwo = numberActionTwo;
    }

    public Functionable<Integer> getNumberActionOne() {
        return numberActionOne;
    }

    public Functionable<Integer> getNumberActionTwo() {
        return numberActionTwo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Functionable<Integer> numberActionOne;
        private Functionable<Integer> numberActionTwo;

        private Builder() {
        }

        public Builder withNumberActionOne(Functionable<Integer> numberActionOne) {
            this.numberActionOne = numberActionOne;
            return this;
        }

        public Builder withNumberActionTwo(Functionable<Integer> numberActionTwo) {
            this.numberActionTwo = numberActionTwo;
            return this;
        }

        public MainMenuConsoleModel build() {
            return new MainMenuConsoleModel(numberActionOne, numberActionTwo);
        }
    }
}
