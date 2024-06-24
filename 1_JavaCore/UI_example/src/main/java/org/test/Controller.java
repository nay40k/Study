package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    private Menu currentMenu;
    private final MainMenu mainMenu = new MainMenu();
    private final UserMenu userMenu = new UserMenu();
    private final AdminMenu adminMenu = new AdminMenu();
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, User> users = new HashMap<>();

    public Controller() {
        // Инициализация пользователей (в реальном приложении используйте базу данных)
        users.put("admin", new User("admin", "adminpass", true));
        users.put("user", new User("user", "userpass", false));
        currentMenu = mainMenu; // Начинаем с главного меню
    }

    public void start() {
        while (true) {
            currentMenu.displayMenu();
            int choice = scanner.nextInt();
            if (currentMenu instanceof MainMenu && choice == 1) {
                authenticateUser();
            } else {
                currentMenu.handleInput(choice);
            }
        }
    }

    private void authenticateUser() {
        System.out.print("Введите логин: ");
        String username = scanner.next();
        System.out.print("Введите пароль: ");
        String password = scanner.next();

        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            if (user.isAdmin()) {
                switchToAdminMenu();
            } else {
                switchToUserMenu();
            }
        } else {
            System.out.println("Неверный логин или пароль.");
        }
    }

    public void switchToMainMenu() {
        currentMenu = mainMenu;
    }

    public void switchToUserMenu() {
        currentMenu = userMenu;
    }

    public void switchToAdminMenu() {
        currentMenu = adminMenu;
    }

    // Вспомогательный класс для представления пользователя
    private static class User {
        private final String username;
        private final String password;
        private final boolean admin;

        public User(String username, String password, boolean admin) {
            this.username = username;
            this.password = password;
            this.admin = admin;
        }

        public String getPassword() {
            return password;
        }

        public boolean isAdmin() {
            return admin;
        }
    }
}
