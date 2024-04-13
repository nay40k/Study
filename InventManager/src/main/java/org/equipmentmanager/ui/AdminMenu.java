package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;

import static org.equipmentmanager.util.Constants.AdminMenuConstants.MENU_OPTIONS;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.OPTION_1_MESSAGE;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.OPTION_2_MESSAGE;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.OPTION_3_MESSAGE;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.OPTION_4_MESSAGE;
import static org.equipmentmanager.util.Constants.AdminMenuConstants.RETURN_TO_MAIN_MENU_MESSAGE;
import static org.equipmentmanager.util.Constants.GeneralConstants.ENTER_CHOICE_MESSAGE;
import static org.equipmentmanager.util.Constants.GeneralConstants.INVALID_CHOICE_MESSAGE;

public class AdminMenu implements GenericMenu {

    private static AdminMenu INSTANCE;

    private AdminMenu() {}

    public static AdminMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdminMenu();
        }
        return INSTANCE;
    }

    @Override
    public void displayMenu() {
        System.out.println(MENU_OPTIONS);
    }

    //можно сделать дефолт метод в интерфейсе
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
                break;
            case 2:
                System.out.println(OPTION_2_MESSAGE);
                break;
            case 3:
                System.out.println(OPTION_3_MESSAGE);
                break;
            case 4:
                System.out.println(OPTION_4_MESSAGE);
                break;
            case 0:
                System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
                nextMenu = MainMenu.getInstance();
            default:
                System.out.println(INVALID_CHOICE_MESSAGE);
                break;
        }

        return nextMenu;
    }

}
