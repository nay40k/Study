package org.test;

public class UserMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Меню пользователя:");
        System.out.println("1 - Просмотр техники");
        System.out.println("2 - Просмотр сотрудников");
        System.out.println("3 - Просмотр офисов");
        System.out.println("0 - Возврат в главное меню");
    }

    @Override
    public void handleInput(int choice) {
        switch (choice) {
            case 1:
                // Логика для просмотра техники
                break;
            case 2:
                // Логика для просмотра сотрудников
                break;
            case 3:
                // Логика для просмотра офисов
                break;
            case 0:
                // Возврат в главное меню
                break;
            default:
                System.out.println("Некорректный ввод. Пожалуйста, введите еще раз.");
        }
    }
}