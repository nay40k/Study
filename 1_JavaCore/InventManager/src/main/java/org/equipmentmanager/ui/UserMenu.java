package org.equipmentmanager.ui;

public class UserMenu implements Menu {

    private static UserMenu INSTANCE;

    private UserMenu() {}

    public static UserMenu getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserMenu();
        }
        return INSTANCE;
    }

    @Override
    public void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getUserInput() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Menu processUserInputAndProceedToNextMenu(int input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO реализовать меню через общий интерфейс, переписать названия методов на одинаковые
}
