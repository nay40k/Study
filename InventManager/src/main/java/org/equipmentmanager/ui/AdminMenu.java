package org.equipmentmanager.ui;

import java.util.Scanner;

public class AdminMenu {

    private Scanner scanner;

    public AdminMenu() {
        this.scanner = new Scanner(System.in);
    }


    public void displayAdminMenu() {
        System.out.println("""
                1 - Adding equipment to the warehouse
                2 - Adding users
                3 - Adding rooms
                4 - Moving equipment from the warehouse to the user
                0 - Back to main menu""");

    }

    public void getAdminInput() {
        int choice = 99;
        while (choice != 0) {
            displayAdminMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                case 4:
                    System.out.println("You selected Option 4");
                    break;
                case 0:
                    System.out.println("Moving to main menu...");
                    MainMenu ui = new MainMenu();
                    ui.getUserInput();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
