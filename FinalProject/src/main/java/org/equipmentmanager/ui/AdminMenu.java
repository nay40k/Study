package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.*;
import static org.equipmentmanager.util.Constants.SatelliteUIConstants.*;


public class AdminMenu implements Menu{

    private static AdminMenu INSTANCE;

    public AdminMenu() {}

    public static AdminMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdminMenu();
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
    public void displayMenu() {
        System.out.println(MENU_OPTIONS);

    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }


}
