package by.koleso.terminal.console_model;

import java.util.Objects;

public class GameConsoleModel extends AbstractModel {

    private Functionable<Integer> moveAction;

    private GameConsoleModel(Functionable<Integer> moveAction) {

        Objects.requireNonNull(moveAction, "moveAction can't be null");

        this.moveAction = moveAction;
    }

    public Functionable<Integer> getMoveAction() {
        return moveAction;
    }

    public static Builder builder() {
        return new GameConsoleModel.Builder();
    }


    // new class Builder
    public static class Builder {
        private Functionable<Integer> moveAction;

        public Builder withMoveAction(Functionable<Integer> moveAction) {
            this.moveAction = moveAction;
            return this;
        }

        public GameConsoleModel build() {
            return new GameConsoleModel(moveAction);
        }
    }
}
