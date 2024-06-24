package org.equipmentmanager.util;

import java.util.Scanner;

public class ScannerSingleton {

    private static Scanner INSTANCE;

    private ScannerSingleton() {}

    public static synchronized Scanner getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Scanner(System.in);
        }
        return INSTANCE;
    }

}