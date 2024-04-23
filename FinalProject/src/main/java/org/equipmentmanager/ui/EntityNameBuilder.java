package org.equipmentmanager.ui;

import org.equipmentmanager.util.ScannerSingleton;

import java.util.Scanner;

import static org.equipmentmanager.util.Constants.EntityNameBuilderConstants.*;

public class EntityNameBuilder {

//    public static void pause() {
//        Scanner s = ScannerSingleton.getInstance();
//        s.next();
//    }

    public static String[] setOfficeParameters() {
        String address[] = new String[2];
        System.out.print(ENTER_OFFICE_ADDRESS);
        address[0] = ScannerSingleton.getInstance().nextLine();
        System.out.print(ENTER_OFFICE_DEPARTMENT);
        address[1] = ScannerSingleton.getInstance().nextLine();
        return address;
    }

    public static String getEntityName() {
        String input;

        while (true) {

                System.out.print("Enter entity test: ");
                input = ScannerSingleton.getInstance().nextLine();
                break;

        }
        return input;
    }
}
