package org.equipmentmanager.ui;

import java.util.Scanner;

public class MainMenu implements Menu{

    private Scanner scanner;

    private static MainMenu INSTANCE;


    private MainMenu() {
    }

    public static AdminMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainMenu();
        }
        return INSTANCE;
    }

    public void displayMenu() {
        System.out.println("""
                Welcome to Invent Manager App
                1 - Authorization
                2 - Option 2
                0 - Exit""");
    }

    public void displayEntranceApproval() {
        System.out.println("Вы вошли с правами администратора");

    }

    public int getUserInput() {
//        displayMenu();
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    @Override
    public Menu processUserInputAndProceedToNextMenu(int input) {
        return null;
    }

    public String[] getCredentials() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner2.nextLine();
        System.out.print("Enter password: ");
        String password = scanner2.nextLine();
        return new String[]{username, password};
    }
}
