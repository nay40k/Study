package org.equipmentmanager;

import org.equipmentmanager.ui.GenericMenu;
import org.equipmentmanager.ui.MainMenu;

public class Application {
    public static void main(String[] args) {
        GenericMenu currentMenu = MainMenu.getInstance();
        while (true) {
            currentMenu.displayMenu();
            int input = currentMenu.getUserInput();
            currentMenu = currentMenu.processUserInputAndProceedToNextMenu(input);
        }
    }
}