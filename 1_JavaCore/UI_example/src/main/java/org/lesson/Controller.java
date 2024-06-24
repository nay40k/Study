package org.lesson;



import java.util.Map;

public class Controller {

    ConsoleUI ui = new ConsoleUI();

    public void start() {
        Map<String, String> creds = ui.welcomeMenu();
        // try{
        // db,getUserByName(name from creds)
        // check password
        // } catch(UserNotFoundException e) { TODO
        // } catch(wException e1) { TODO something went wrong - универсальный - для всех не известных исключений.
        // }
        int choice = 0;
        try {
            choice = ui.mainMenu();
        } catch (WronginputException e) {
            throw new RuntimeException(e);
        }
        do {
            switch (choice) {
                case 1:
                    // TODO  start menu
                    break;
                case 2:
                    // TODO ...
                    break;
                case 3:
                    // TODO ...
                    break;
                case 4:
                    // TODO ...
                    break;
                case 5:
                    // TODO ...
                    break;

            }
        } while (choice != 0);
    }

}