package org.equipmentmanager.ui;

public interface Menu {

    void displayMenu();
    int getUserInput();
    Menu processUserInputAndProceedToNextMenu(int input);
}
