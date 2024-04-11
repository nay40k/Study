package org.equipmentmanager.ui;

import org.equipmentmanager.model.Authenticator1;

import java.util.Scanner;

public class MainMenu {

    private Scanner scanner;

    public MainMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to Invent Manager App\n" +
                "1 - Authorization\n" +
                "2 - Option 2\n" +
                "0 - Exit");
    }



    public void getUserInput() {
        int choice = 99;
        while (choice != 0) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    System.out.println("<<вызывается аутентификатор>>");
                    Authenticator1 authenticator = new Authenticator1();

                    System.out.print("Enter username: ");
                    String username = scanner2.nextLine();

                    System.out.print("Enter password: ");
                    String password = scanner2.nextLine();

                    if (authenticator.authenticate(username, password)) {
                        System.out.println("Authentication successful.");

                        System.out.println("Выполняется какое-то действие");

                        if (authenticator.adminRole(username, password)) {
                            System.out.println("Вы вошли с правами администратора");
                            AdminMenu adminMenu = new AdminMenu();
                            adminMenu.getAdminInput();
                            choice = 0;
                        }

                    } else {
                        System.out.println("Authentication failed. Access denied.");
                    }
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 0:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

//    public static void main(String[] args) {
//        Menu ui = new Menu();
//        ui.getUserInput();
//    }
}
