package org.equipmentmanager.ui;

import java.util.Scanner;

public class MainMenu {

    private Scanner scanner;

    public MainMenu() {
        this.scanner = new Scanner(System.in);
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

    public String[] getCredentials() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner2.nextLine();
        System.out.print("Enter password: ");
        String password = scanner2.nextLine();
        return new String[]{username, password};
    }
}
