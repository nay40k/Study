package org.equipmentmanager.ui;

public interface Menu {

    String getUserInput();

    String[] getCredentials();

    void displayWelcomeMessage();

    void displayMenu();

    Menu processUserInputAndProceedToNextMenu(int input); //aghrr wtf?!

}

