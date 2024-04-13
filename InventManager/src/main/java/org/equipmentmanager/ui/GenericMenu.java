package org.equipmentmanager.ui;

public interface GenericMenu {

    void displayMenu();
    int getUserInput();
    GenericMenu processUserInputAndProceedToNextMenu(int input);

}
