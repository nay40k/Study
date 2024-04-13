package org.equipmentmanager.ui;

import org.equipmentmanager.model.User;
import org.equipmentmanager.service.UserAuthenticatorService;
import org.equipmentmanager.util.ScannerSingleton;

import java.util.Scanner;

import static org.equipmentmanager.util.Constants.GeneralConstants.ENTER_CHOICE_MESSAGE;
import static org.equipmentmanager.util.Constants.GeneralConstants.INVALID_CHOICE_MESSAGE;
import static org.equipmentmanager.util.Constants.MainMenuConstants.ADMIN_ROLE_MESSAGE;
import static org.equipmentmanager.util.Constants.MainMenuConstants.AUTHENTICATION_FAILED;
import static org.equipmentmanager.util.Constants.MainMenuConstants.MENU_OPTIONS;
import static org.equipmentmanager.util.Constants.MainMenuConstants.OPTION_1_MESSAGE;
import static org.equipmentmanager.util.Constants.MainMenuConstants.OPTION_2_MESSAGE;
import static org.equipmentmanager.util.Constants.MainMenuConstants.PASSWORD_PROMPT;
import static org.equipmentmanager.util.Constants.MainMenuConstants.USERNAME_PROMPT;
import static org.equipmentmanager.util.Constants.MainMenuConstants.USER_ROLE_MESSAGE;
import static org.equipmentmanager.util.Constants.MainMenuConstants.WELCOME_MESSAGE;

public class MainMenu implements GenericMenu {

    private static MainMenu INSTANCE;

    private MainMenu() {}

    public static MainMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainMenu();
        }
        return INSTANCE;
    }

    @Override
    public void displayMenu() {
        System.out.println(WELCOME_MESSAGE);
        System.out.println(MENU_OPTIONS);
    }

    @Override
    public int getUserInput() {
        int input;
        while (true) {
            try {
                System.out.print(ENTER_CHOICE_MESSAGE);
                input = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_CHOICE_MESSAGE);
            }
        }
        return input;
    }

    @Override
    public GenericMenu processUserInputAndProceedToNextMenu(int input) {
        GenericMenu nextMenu = getInstance();

        switch (input) {
            case 1:
                System.out.println(OPTION_1_MESSAGE);
                UserAuthenticatorService authenticatorService = UserAuthenticatorService.getInstance();

                Scanner scanner = ScannerSingleton.getInstance();
                System.out.print(USERNAME_PROMPT);
                String username = scanner.nextLine();
                System.out.print(PASSWORD_PROMPT);
                String password = scanner.nextLine();

                User authenticatedUser = authenticatorService.authenticate(username, password);

                if(authenticatedUser == null) {
                    System.out.println(AUTHENTICATION_FAILED);
                    break;
                }

                if(authenticatorService.getCurrentUser().getIsAdmin()) {
                    System.out.println(ADMIN_ROLE_MESSAGE);
                    nextMenu = AdminMenu.getInstance();
                } else {
                    System.out.println(USER_ROLE_MESSAGE);
                    nextMenu = UserMenu.getInstance();
                }
                break;
            case 2:
                System.out.println(OPTION_2_MESSAGE);
                break;
            case 0:
                ScannerSingleton.getInstance().close();
                System.exit(0);
                break;
            default:
                System.out.println(INVALID_CHOICE_MESSAGE);
                break;
        }

        return nextMenu;
    }

}
