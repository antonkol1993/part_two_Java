package by.koleso.terminal.console_view;

import by.koleso.terminal.console_model.MainMenuConsoleModel;

import java.util.Scanner;

public class MainMenuConsoleView implements AbstractConsoleView {
    private MainMenuConsoleModel model;
    Scanner scanner = new Scanner(System.in);

    public MainMenuConsoleView(MainMenuConsoleModel model) {
        this.model = model;
    }


    @Override
    public void getView() {
        System.out.println("1 = New game ");
        System.out.println("2 = Exit Platform");
        System.out.println("\n");
        System.out.println("Please, enter the number: ");


        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> model.getNumberActionOne();
            case 2 -> model.getNumberActionTwo();
            default -> {
                System.out.println("The choice is wrong. Try again:");
                refresh();
            }
        }


    }

    @Override
    public void refresh() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> model.getNumberActionOne();
            case 2 -> model.getNumberActionTwo();
            default -> {
                System.out.println("The choice is wrong. Try again:");
                refresh();
            }

        }
    }
}
