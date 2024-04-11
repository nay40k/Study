package org.equipmentmanager.core;

import org.equipmentmanager.ui.MainMenu;

public class Program {
    public void start() {
        //TODO запрашивать действие у UI-модуля
        // show main menu
        //основная логика приложения

//        boolean isWorking = true;

        String currentMenu = "main";


        MainMenu ui = new MainMenu();
        ui.getUserInput();
//            if (number == 1) {
//                Scanner scanner2 = new Scanner(System.in);
//                System.out.println("вызывается аутентификатор");
//                Authenticator1 authenticator = new Authenticator1();
//
//                System.out.print("Enter username: ");
//                String username = scanner2.nextLine();
//
//                System.out.print("Enter password: ");
//                String password = scanner2.nextLine();
//
//                if (authenticator.authenticate(username, password)) {
//                    System.out.println("Authentication successful.");
//
//                    System.out.println("Выполняется какое-то действие");
//
//                    if (authenticator.adminRole(username, password)) {
//                        System.out.println("Вы вошли с правами администратора");
//                    }
//
//                    System.out.println("Что-то происходит ещё");
//
//                } else {
//                    System.out.println("Authentication failed. Access denied.");
//                }
//
//
//            } else if (number == 2) {
//                System.out.println("Программа завершает свою работу...");
//                isWorking = false;
//            }


    }
}
