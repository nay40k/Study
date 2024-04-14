package org.equipmentmanager.core;

import org.equipmentmanager.model.User;
import org.equipmentmanager.model.UserAuthenticator;
import org.equipmentmanager.ui.AdminMenu;
import org.equipmentmanager.ui.MainMenu;

public class Controller {
    public void start() {
        MainMenu mainMenu = new MainMenu();
        UserAuthenticator authenticator = new UserAuthenticator();
        int choice;

        do {
            mainMenu.displayMenu();
            choice = mainMenu.getUserInput();
            switch (choice) {
                case 1:
                    String[] credentials = mainMenu.getCredentials();

                    try {
                        User user = authenticator.authenticate(credentials[0], credentials[1]);

                        if(user.isAdmin()) {
                            //go to admin menu
                            AdminMenu adminMenu = new AdminMenu();
                            adminMenu.displayAdminMenu();
    
                        } else {
                            //go to user menu
                        }

                    } catch(UserAuthException e | UserPidorException e) {
                        mainMenu.displayError(e);
                        break;
                    }


                    //этот код можно удалить
//                    if (authenticator.adminRole(credentials[0], credentials[1])) {
//                        mainMenu.displayEntranceApproval();
//                        // Здесь можно вызвать метод для отображения меню администратора
//                    } else if (authenticator.authenticate(credentials[0], credentials[1])) {
//                        System.out.println("Вы вошли с правами пользователя");
//                        // Здесь можно вызвать метод для отображения пользовательского меню
//                    } else {
//                        System.out.println("Authentication failed. Access denied.");
//                    }
//                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    // Здесь можно добавить дополнительную логику
                    break;
                case 0:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}
