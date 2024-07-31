package by.koleso.terminal.console_model;

import by.koleso.model.Model;

import java.util.Objects;

public class MainMenuConsoleModel extends AbstractModel{
    private Functionable<Integer> numberAction;

    private MainMenuConsoleModel(Functionable<Integer> numberAction) {
        Objects.requireNonNull(numberAction, "numberAction can't be null");

        this.numberAction = numberAction;
    }

    public Functionable<Integer> getNumberAction() {
        return numberAction;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {

        private Functionable<Integer> numberAction;

        private Builder() {
        }

        public Builder withNumberAction(Functionable<Integer> numberAction) {
            this.numberAction = numberAction;
            return this;
        }

        public MainMenuConsoleModel build () {
           return new MainMenuConsoleModel(numberAction);
        }
    }
}
