package org.equipmentmanager.core;

import org.equipmentmanager.db.dao.DAO;
import org.equipmentmanager.db.dao.EmployeeDAO;
import org.equipmentmanager.db.dao.OfficeDAO;
import org.equipmentmanager.model.Employee;
import org.equipmentmanager.model.Office;
import org.equipmentmanager.model.User;
import org.equipmentmanager.model.UserAuthenticator;
import org.equipmentmanager.ui.*;

import java.util.List;


public class Controller {
    public void start() {
        Menu currentMenu = MainMenu.getInstance();
        UserAuthenticator authenticator = new UserAuthenticator();

        while (true) {
            int choice;
            int accessLevel = 0;

            currentMenu.displayWelcomeMessage();
            currentMenu.displayMenu();

            if (currentMenu == MainMenu.getInstance()) {
                accessLevel = 1;
            } else if (currentMenu == UserMenu.getInstance()) {
                accessLevel = 2;
            } else if (currentMenu == AdminMenu.getInstance()) {
                accessLevel = 3;
            } else {
                accessLevel = 99;
            }


            try {
                choice = Integer.parseInt(MainMenu.getInstance().getUserInput());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
                continue; // продолжаем выполнение цикла
            }

            switch (choice) {
                case 1:
                    if (accessLevel == 1) {
                        String[] creds = currentMenu.getCredentials();
                        User user = authenticator.authenticate(creds[0], creds[1]);
                        System.out.println(user); //временный вывод
                        if (user.isAdmin()) {
                            currentMenu = AdminMenu.getInstance();
                        } else {
                            currentMenu = UserMenu.getInstance();
                        }
                        continue;
                    } else {
                        System.out.println("Вы выбрали пункт 1");
                        break;
                    }
                case 2:
                    System.out.println("Вы выбрали пункт 2");
                    break;
                case 3:
                    System.out.println("Вы выбрали пункт 3");
                    break;
                case 4:
                    System.out.println("Вы выбрали пункт 4");
                    break;
                case 5:
                    System.out.println("Вы выбрали пункт 5");
                    break;
                case 6:
                    System.out.println("Вы выбрали пункт 6");
                    OfficeDAO officeDAO = new OfficeDAO();
                    List<Office> offices = officeDAO.getAll();
                    for (Office office : offices) {
                        System.out.println(office);
                    }
                    break;
                case 7:
                    if (accessLevel == 3) {
                        String[] input = EntityNameBuilder.setOfficeParameters();
                        //TODO object
                        new OfficeDAO().add(new Office(input[0], input[1] ));
                        //TODO output approvement
//                        EntityNameBuilder.pause();
//
                    } else {
                        System.err.println("Invalid choice. Please try again.");
                    }
                    break;
                case 8:
//                    System.out.println("Вы выбрали пункт 8");
                    EmployeeDAO employeeDAO = new EmployeeDAO();

                    // Получаем список всех сотрудников
                    List<Employee> employees = employeeDAO.getAll();

                    // Выводим информацию о каждом сотруднике
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 9:
                    System.out.println("Вы выбрали пункт 9");
                    break;
                case 0:
                    if (currentMenu == MainMenu.getInstance()) {
                        new MainMenu().exitApplication();
                        System.exit(0);
                    } else {
                        currentMenu = MainMenu.getInstance();
                        continue;
                    }
                default:

                    System.err.println("Invalid choice. Please try again.");

            }
        }

    }
}
