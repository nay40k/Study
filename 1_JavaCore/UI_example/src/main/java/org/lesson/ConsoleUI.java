package org.lesson;

import java.lang.invoke.WrongMethodTypeException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ConsoleUI {
    Scanner scanner = new Scanner(System.in);

    public Map<String, String> welcomeMenu() { // bad name.
        System.out.println("Hello dear friend. To start game please authorize. Enter name: ");
        String useName = scanner.nextLine();
        System.out.println("Enter password:");
        String usePassword = scanner.nextLine();
        Map<String, String> creds = new HashMap<>();
        creds.put(useName, usePassword);
        return creds;
    }

    public int mainMenu() throws WronginputException { // use own Exception class
        System.out.println(" 1 - start game; 2 - exit; 3 - about the game; 4 - load game; 5 - leader bord; ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            throw new WronginputException("", e); // Own exeption //   уточняющее сообщение.
        }
    }
}