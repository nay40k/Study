package org.inventorymanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticator.authenticate(username, password)) {
            System.out.println("Authentication successful.");

            OfficeEquipmentManager manager = new OfficeEquipmentManager();

            if (authenticator.adminRole(username, password)) {

                Computer computer1 = new Computer(
                        "Desktop",
                        800.0,
                        "Intel Core i5");
                Computer computer2 = new Computer("Laptop", 1200.0, "Intel Core i7");



                // TODO Вынести в отдельный метод добавление техники
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter processor: ");
                String processor = scanner.nextLine();
                manager.addRecord(new Computer(name, price, processor));

                manager.addRecord(computer1);
                manager.addRecord(computer2);
            }


            manager.viewRecords();
            System.out.println("мы здесь");

        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }
}