package org.equipmentmanager.ui;

import org.equipmentmanager.model.Employee;
import org.equipmentmanager.model.Office;
import org.equipmentmanager.model.OfficeEquipment;
import org.equipmentmanager.model.User;
import org.equipmentmanager.util.ScannerSingleton;

import java.util.Arrays;
import java.util.List;

import static org.equipmentmanager.util.Constants.SatelliteUIConstants.*;

public class IOHandler {

    public String[] getCredentials() {
        System.out.print(USERNAME_PROMPT);
        String username = ScannerSingleton.getInstance().nextLine();
        System.out.print(PASSWORD_PROMPT);
        String password = ScannerSingleton.getInstance().nextLine();
        return new String[]{username, password};
    }

    public String getUserInput() {
        int input;
        while (true) {
            try {
                System.out.print(ENTER_CHOICE_MESSAGE);
                input = Integer.parseInt(ScannerSingleton.getInstance().nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_CHOICE_MESSAGE);
            }
        }
        return String.valueOf(input);
    }

    public void displayDBConnIsEstablished() {

    }

    public int setAccessLevel(Menu currentMenu) {
        int accessLevel;
        if (currentMenu == MainMenu.getInstance()) {
            accessLevel = 1;
        } else if (currentMenu == UserMenu.getInstance()) {
            accessLevel = 2;
        } else if (currentMenu == AdminMenu.getInstance()) {
            accessLevel = 3;
        } else {
            accessLevel = 0;
        }
        return accessLevel;
    }

    public void displayAuthFailMessage() {
        System.err.println(AUTHENTICATION_FAILED);
    }

    public void displayInvalidChoiceMessage() {
        System.err.println(INVALID_CHOICE_MESSAGE);
    }


    public void displayObjectAddedSuccessMessage(Object t) {
        System.out.println("Object\n" + t + "\nadded successfully");
    }

    public void displayObjectRemovedSuccessMessage(Object t) {
        System.out.println("Object\n" + t + "\nremoved successfully");
    }


    public String[] setOfficeParameters() {
        String[] sop = new String[2];
        System.out.print(ENTER_OFFICE_ADDRESS);
        sop[0] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_OFFICE_DEPARTMENT);
        sop[1] = ScannerSingleton.getInstance().nextLine();
        return sop;
    }

    public String[] setUserParameters() {
        String[] sup = new String[3];
        System.out.print(ENTER_USERNAME);
        sup[0] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_PASSWORD);
        sup[1] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_USER_IF_ADMIN);
        sup[2] = ScannerSingleton.getInstance().nextLine();
        return sup;
    }

    public void printList(List<String[]> list) {
        list.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public void printOfficeEquip(List<OfficeEquipment> officeEquipments) {
        officeEquipments.forEach(System.out::println);
    }

    public void printOffices(List<Office> offices) {
        offices.forEach(System.out::println);
    }

    public void printEmployees(List<Employee> employees) {
        employees.forEach(System.out::println);
    }

    public void printUsers(List<User> users) {
        users.forEach(System.out::println);
    }

    public String[] setMovementDetails(List<OfficeEquipment> equipments, List<Office> offices, List<Employee> employees) {
        String[] details = new String[3];
        printOfficeEquip(equipments);
        System.out.print(ENTER_EQUIP_ID);
        details[0] = getUserInput();
        printOffices(offices);
        System.out.print(ENTER_OFFICE_ID);
        details[1] = getUserInput();
        printEmployees(employees);
        System.out.print(ENTER_USER_ID);
        details[2] = getUserInput();
        return details;
    }

    public String[] setEquipParameters() {
        String[] sep = new String[3];
        System.out.print(ENTER_TYPE_ID);
//        sep[0] = ScannerSingleton.getInstance().nextLine();
        sep[0] = new IOHandler().getUserInput();
        System.out.print(ENTER_SERIAL_NUMBER);
        sep[1] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_COST);
        sep[2] = ScannerSingleton.getInstance().nextLine();
        return sep;
    }

    public void exitApplication() {
        System.out.println(EXIT_MESSAGE);
    }


}
