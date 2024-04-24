package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;

import static org.equipmentmanager.util.Constants.SatelliteUIConstants.*;

public class IOHandler {

//    public static void pause() {
//        Scanner s = ScannerSingleton.getInstance();
//        s.next();
//    }

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
            accessLevel = 99;
        }
        return accessLevel;
    }

    public void displayAuthFailMessage() {
        System.err.println(AUTHENTICATION_FAILED);
    }

    public void displayObjectAddedSuccessMessage(Object t) {
        System.out.println("Object\n" + t + "\nadded successfully");
    }

    public void displayInvalidChoiceMessage() {
        System.err.println(INVALID_CHOICE_MESSAGE);
    }

    public void displayObjectRemovedSuccessMessage(Object t) {
        System.out.println("Object\n" + t + "\nremoved successfully");
    }


    public String[] setOfficeParameters() {
        String sop[] = new String[2];
        System.out.print(ENTER_OFFICE_ADDRESS);
        sop[0] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_OFFICE_DEPARTMENT);
        sop[1] = ScannerSingleton.getInstance().nextLine();
        return sop;
    }

    public String[] setUserParameters() {
        String sup[] = new String[3];
        System.out.print(ENTER_USERNAME);
        sup[0] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_PASSWORD);
        sup[1] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_USER_IF_ADMIN);
        sup[2] = ScannerSingleton.getInstance().nextLine();
        return sup;
    }

    public String getEntityName() {
        String input;

        while (true) {

                System.out.print("Enter entity test: ");
                input = ScannerSingleton.getInstance().nextLine();
                break;

        }
        return input;
    }
}
