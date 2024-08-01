package by.koleso.terminal.console_view;

import java.util.Scanner;

public class MainMenuConsoleView {
    Scanner scanner = new Scanner(System.in);


    public void view() {
        System.out.println("1 = New game ");
        System.out.println("2 = Exit Platform");
        System.out.println("\n");
        System.out.println("Please, enter the number: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> new GameConsoleView().view();
            case 2 -> System.exit(999);
            default -> {
                System.out.println("The choice is wrong. Try again:");
                refresh();
            }
        }


    }


    public void refresh() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> new GameConsoleView().view();
            case 2 -> System.exit(999);
            default -> {
                System.out.println("The choice is wrong. Try again:");
                refresh();
            }

        }
    }
}
