package org.equipmentmanager.util;

public class Constants {

    private Constants() {
    }

    public static class SatelliteUIConstants {
        public static final String ENTER_OFFICE_ADDRESS = "Enter address: ";
        public static final String ENTER_OFFICE_DEPARTMENT = "Enter department: ";
        public static final String ENTER_USERNAME = "Enter username: ";
        public static final String ENTER_PASSWORD = "Enter password: ";
        public static final String ENTER_USER_IF_ADMIN = "Enter if user is admin (y/n): ";

        public static final String ENTER_TYPE_ID = "Enter type id: ";
        public static final String ENTER_SERIAL_NUMBER = "Enter serial number: ";
        public static final String ENTER_COST = "Enter cost: ";

        public static final String ENTER_EQUIP_ID = "Enter EQUIPMENT ID you want to move: ";
        public static final String ENTER_USER_ID = "Enter USER ID to whom you want to issue the equipment: ";
        public static final String ENTER_OFFICE_ID = "Enter OFFICE ID you want to move this equipment: ";
//        public static final String ENTER_COST = "Enter cost: ";

        public static final String AUTHENTICATION_FAILED = "Authentication failed. Access denied.";
        public static final String INVALID_CHOICE_MESSAGE = "Invalid choice. Please try again.";
        public static final String ENTER_CHOICE_MESSAGE = "Enter your choice: ";
        public static final String USERNAME_PROMPT = "Enter username: ";
        public static final String PASSWORD_PROMPT = "Enter password: ";
        public static final String EXIT_MESSAGE = "Exiting Application...";
        public static final String DEFAULT_MESSAGE = "Make correct choice";

    }


    public static class MainMenuConstants {
        public static final String WELCOME_MESSAGE =
                """
                        -----------------------------
                        Welcome to Invent Manager App
                        -----------------------------""";
        public static final String MENU_OPTIONS =
                """
                         1 - Authorization
                         0 - Exit""";
    }

    public static class UserMenuConstants {
        public static final String WELCOME_MESSAGE = "You are logged in as user";

        public static final String MENU_OPTIONS =
                """
                         1 - View equipment
                         4 - View users
                         6 - View offices
                         8 - View employees
                         0 - Back to main menu
                        """;

    }

    public static class AdminMenuConstants {

        public static final String WELCOME_MESSAGE = "You are logged in as admin";

        public static final String MENU_OPTIONS =
                """                        
                          1 - View all equipment
                          2 - Add equipment to the warehouse
                          3 - Move equipment
                          4 - View users
                          5 - Add users
                          6 - View offices
                          7 - Add offices
                          8 - View employees
                          9 - Add employees
                          0 - Back to main menu
                         """;
    }

}
