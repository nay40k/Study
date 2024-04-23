package org.equipmentmanager.ui;


import org.equipmentmanager.util.ScannerSingleton;

import static org.equipmentmanager.util.Constants.GenericMenuConstants.*;
import static org.equipmentmanager.util.Constants.UserMenuConstants.*;

public class UserMenu implements Menu{

    private static UserMenu INSTANCE;

    private UserMenu() {}

    public static UserMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserMenu();
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
            } catch (NumberFormatException e) {
                System.out.println(INVALID_CHOICE_MESSAGE);
            }
        }
        return String.valueOf(input);
    }

    @Override
    public String[] getCredentials() {
        return new String[0];
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



    //TODO реализовать меню через общий интерфейс, переписать названия методов на одинаковые
}
