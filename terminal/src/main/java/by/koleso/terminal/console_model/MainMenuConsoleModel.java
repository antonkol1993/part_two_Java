package by.koleso.terminal.console_model;

import by.koleso.model.Model;

import java.util.Objects;

public class MainMenuConsoleModel {
    private Integer numberAction;

    private MainMenuConsoleModel(Integer numberAction) {
        Objects.requireNonNull(numberAction, "numberAction can't be null");

        this.numberAction = numberAction;
    }

    public Integer getNumberAction() {
        return numberAction;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {

        private Integer numberAction;

        private Builder() {
        }

        public Builder withNumberAction(Integer numberAction) {
            this.numberAction = numberAction;
            return this;
        }

        public MainMenuConsoleModel build () {
           return new MainMenuConsoleModel(numberAction);
        }
    }
}
