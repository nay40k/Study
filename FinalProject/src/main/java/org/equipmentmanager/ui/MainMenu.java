package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;
import static org.equipmentmanager.util.Constants.MainMenuConstants.*;
import static org.equipmentmanager.util.Constants.SatelliteUIConstants.*;


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
                System.out.println(ENTER_CHOICE_MESSAGE);
                input = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
                break;
            } catch (IllegalStateException | NumberFormatException e) {
                System.err.println(INVALID_CHOICE_MESSAGE);
            }
        }
        return String.valueOf(input);
    }



    @Override
    public void displayWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    @Override
    public void displayMenu() {
        System.out.println(MENU_OPTIONS);

    }


}
