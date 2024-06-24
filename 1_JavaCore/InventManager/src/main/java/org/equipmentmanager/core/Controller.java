package org.equipmentmanager.core;

import org.equipmentmanager.exceptions.UserAuthException;
import org.equipmentmanager.model.User;
import org.equipmentmanager.model.UserAuthenticator;
import org.equipmentmanager.ui.AdminMenu;
import org.equipmentmanager.ui.MainMenu;
import org.equipmentmanager.ui.Menu;

import java.util.InputMismatchException;

public class Controller {
    public void start() {
        MainMenu mainMenu = new MainMenu();
        UserAuthenticator authenticator = new UserAuthenticator();
        int choice;

        do {
            mainMenu.displayWelcomeMessage();
            mainMenu.displayMenu();
            choice = mainMenu.getUserInput();
            switch (choice) {
                case 1:
                    mainMenu.displayOption1Message();
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
                    } catch(InputMismatchException ime) {
                        //TODO реализовать обработку ошибку аутентификации
                    }
                case 2:
                    mainMenu.displayOption2Message();
                    // Здесь можно добавить дополнительную логику
                    break;
                case 0:
                    mainMenu.displayExitMessage();
                    break;
                default:
                    mainMenu.displayDefaultMessage();
                    break;
            }
        } while (choice != 0);
    }
}
