package org.equipmentmanager.core;

import org.equipmentmanager.ui.MainMenu;

public class Program {
    public void start() {
        //TODO запрашивать действие у UI-модуля
        // show main menu
        //основная логика приложения

        MainMenu ui = new MainMenu();
        ui.getUserInput();


    }
}
