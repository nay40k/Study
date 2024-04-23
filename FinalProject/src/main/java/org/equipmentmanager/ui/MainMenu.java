package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;

import java.util.Arrays;

import static org.equipmentmanager.util.Constants.GenericMenuConstants.*;
import static org.equipmentmanager.util.Constants.MainMenuConstants.*;


public class MainMenu implements Menu {

    private static MainMenu INSTANCE;

    public MainMenu() {
    }

    public static MainMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainMenu();
        }
        return INSTANCE;
    }

    public String getUserInput() {
        int input;
        while (true) {
            try {
                System.out.print(ENTER_CHOICE_MESSAGE);
                input = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
                break;
            } catch (IllegalStateException | NumberFormatException e) {
                System.err.println(INVALID_CHOICE_MESSAGE);
            }
        }
        return String.valueOf(input);
    }

    @Override
    public String[] getCredentials() {
        System.out.print(USERNAME_PROMPT);
        String username = ScannerSingleton.getInstance().nextLine();
        System.out.print(PASSWORD_PROMPT);
        String password = ScannerSingleton.getInstance().nextLine();
        return new String[]{username, password};
    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    @Override
    public void displayMenu() {
        System.out.println(MENU_OPTIONS);

    }

    @Override
    public Menu processUserInputAndProceedToNextMenu(int input) {

        return null;
    }

    public void exitApplication() {
        System.out.println(EXIT_MESSAGE);
    }
}
