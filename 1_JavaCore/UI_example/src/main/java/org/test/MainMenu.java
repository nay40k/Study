package org.test;

public class MainMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Главное меню:");
        System.out.println("1 - Авторизация");
        System.out.println("2 - Зарезервировано");
        System.out.println("0 - Выход");
    }

    @Override
    public void handleInput(int choice) {
        switch (choice) {
            case 1:
                // Логика для авторизации и перехода к соответствующему меню (пользователя или администратора)
                break;
            case 2:
                // Логика для зарезервированного пункта
                break;
            case 0:
                System.out.println("Выход из программы...");
                System.exit(0);
                break;
            default:
                System.out.println("Некорректный ввод. Пожалуйста, введите еще раз.");
        }
    }
}