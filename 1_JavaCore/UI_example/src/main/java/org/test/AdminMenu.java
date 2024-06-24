package org.test;

public class AdminMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Меню администратора:");
        System.out.println("1 - Просмотр техники");
        System.out.println("2 - Добавление техники на склад");
        System.out.println("3 - Выдача техники сотруднику");
        System.out.println("4 - Просмотр сотрудников");
        System.out.println("5 - Добавление сотрудников");
        System.out.println("6 - Просмотр офисов");
        System.out.println("7 - Добавление офисов");
        System.out.println("8 - Просмотр пользователей приложения");
        System.out.println("9 - Добавление пользователей приложения");
        System.out.println("0 - Возврат в главное меню");
    }

    @Override
    public void handleInput(int choice) {
        switch (choice) {
            case 1:
                // Логика для просмотра техники
                break;
            case 2:
                // Логика для добавления техники на склад
                break;
            case 3:
                // Логика для выдачи техники сотруднику
                break;
            case 4:
                // Логика для просмотра сотрудников
                break;
            case 5:
                // Логика для добавления сотрудников
                break;
            case 6:
                // Логика для просмотра офисов
                break;
            case 7:
                // Логика для добавления офисов
                break;
            case 8:
                // Логика для просмотра пользователей приложения
                break;
            case 9:
                // Логика для добавления пользователей приложения
                break;
            case 0:
                // Возврат в главное меню
                break;
            default:
                System.out.println("Некорректный ввод. Пожалуйста, введите еще раз.");
        }
    }
}