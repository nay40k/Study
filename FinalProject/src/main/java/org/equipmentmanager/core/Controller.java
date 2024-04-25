package org.equipmentmanager.core;

import org.equipmentmanager.db.dao.*;
import org.equipmentmanager.model.*;
import org.equipmentmanager.ui.*;

import java.util.List;


public class Controller {
    public void start() {
        Menu currentMenu = MainMenu.getInstance();
        UserAuthenticator authenticator = new UserAuthenticator();
        EmployeeDAO employeeDAO = new EmployeeDAO();
        OfficeDAO officeDAO = new OfficeDAO();
        OfficeEquipmentDAO officeEquipmentDAO = new OfficeEquipmentDAO();
        UserDAO userDAO = new UserDAO();
        IOHandler ioHandler = new IOHandler();

        currentMenu.displayWelcomeMessage();

        while (true) {
            int choice;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // невероятный блок кода чтобы сообщение об ошибке не смешивалось с выводом меню ¯\_(ツ)_/¯
            currentMenu.displayMenu();
            int accessLevel = ioHandler.setAccessLevel(currentMenu);

            choice = Integer.parseInt(currentMenu.getUserInput());

            switch (choice) {
                case 1:
                    if (accessLevel == 1) {
                        String[] creds = ioHandler.getCredentials();
                        User user = authenticator.authenticate(creds[0], creds[1]);
                        System.out.println(user); //временный вывод
                        if (user != null && user.isAdmin()) {
                            currentMenu = AdminMenu.getInstance();
                            currentMenu.displayWelcomeMessage();
                        } else if (user != null && !user.isAdmin()) {
                            currentMenu = UserMenu.getInstance();
                            currentMenu.displayWelcomeMessage();
                        } else {
                            ioHandler.displayAuthFailMessage();
                            continue;
                        }
                        continue;
                    } else if (accessLevel == 2 || accessLevel == 3) {
                        ioHandler.printOfficeEquip(officeEquipmentDAO.getAll());
//                        officeEquipmentDAO.getAll().forEach(System.out::println);
                        break;
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                case 2:
                    if (accessLevel == 3) {
                        ioHandler.printList(officeEquipmentDAO.getEqTypes());
                        String[] s = ioHandler.setEquipParameters();
                        OfficeEquipment equipment = new OfficeEquipment(s[0], s[1], Double.parseDouble(s[2]));
                        officeEquipmentDAO.add(equipment);
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 3:
                    if (accessLevel == 3) {
                        List<OfficeEquipment> equips = officeEquipmentDAO.getAll();
                        List<Office> offices = officeDAO.getAll();
                        List<Employee> employees = employeeDAO.getAll();
                        String[] smd = ioHandler.setMovementDetails(equips, offices, employees);
                        OfficeEquipment equipment = officeEquipmentDAO.getById(smd[0]);
                        equipment.setLocation(smd[1]);
                        equipment.setUser(smd[2]);
                        officeEquipmentDAO.update(equipment);
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 4:
                    if (accessLevel == 2 || accessLevel == 3) {
                        ioHandler.printUsers(userDAO.getAll());
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 5:
                    if (accessLevel == 3) {
                        String[] s = ioHandler.setUserParameters();
                        boolean a = false;
                        if (s[2].equals("y")) {
                            a = true;
                        } else if (s[2].equals("n")) {
                            a = false;
                        }
                        User user = new User(s[0], s[1], a);
                        userDAO.add(user);
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 6:
                    if (accessLevel == 2 || accessLevel == 3) {
                        ioHandler.printOffices(officeDAO.getAll());
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 7:
                    if (accessLevel == 3) {
                        String[] s = ioHandler.setOfficeParameters();
                        Office office = new Office(s[0], s[1]);
                        officeDAO.add(office);
//                        satelliteUIClass.displayObjectAddedSuccessMessage(office);
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 8:
                    if (accessLevel == 2 || accessLevel == 3) {
                        employeeDAO.getAll().forEach(System.out::println); // TODO выводить через UI
                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 9:
                    if (accessLevel == 3) {

                        Employee employee = new Employee("1", "2", "3");
                        employeeDAO.add(employee);

                    } else {
                        ioHandler.displayInvalidChoiceMessage();
                    }
                    break;
                case 0:
                    if (accessLevel == 1) {
                        ioHandler.exitApplication();
                        System.exit(0);
                    } else {
                        currentMenu = MainMenu.getInstance();
                        break;
                    }
                default:
                    ioHandler.displayInvalidChoiceMessage();
            }
        }

    }
}
