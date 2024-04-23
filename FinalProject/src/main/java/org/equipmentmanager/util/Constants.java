package org.equipmentmanager.util;

public class Constants {

    private Constants() {
    }

    public static class EntityNameBuilderConstants {
        public static final String ENTER_OFFICE_ADDRESS = "Enter address: ";
        public static final String ENTER_OFFICE_DEPARTMENT = "Enter department: ";

    }

    public static class GenericMenuConstants {
        public static final String ENTER_CHOICE_MESSAGE = "Enter your choice: ";
        public static final String INVALID_CHOICE_MESSAGE = "Invalid choice. Please try again.";
        public static final String USERNAME_PROMPT = "Enter username: ";
        public static final String PASSWORD_PROMPT = "Enter password: ";
    }

    public static class MainMenuConstants {
        public static final String WELCOME_MESSAGE = """
                -----------------------------
                Welcome to Invent Manager App
                -----------------------------
                Make your choice:
                """;
        public static final String MENU_OPTIONS =
                """
                        1 - Authorization
                        0 - Exit
                        """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";

        public static final String AUTHENTICATION_FAILED = "Authentication failed. Access denied.";
        public static final String ADMIN_ROLE_MESSAGE = "You are logged in with the administrator role";
        public static final String USER_ROLE_MESSAGE = "You are logged in with the user role";
        public static final String EXIT_MESSAGE = "Exiting Application...";
        public static final String DEFAULT_MESSAGE = "Make correct choice";
    }

    public static class UserMenuConstants {
        public static final String WELCOME_MESSAGE = "You are logged in as user\nMake your choice:";

        public static final String MENU_OPTIONS =
                """
                        1 - View equipment
                        4 - View users
                        6 - View offices
                        8 - View employees
                        0 - Back to main menu
                        """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";
        public static final String OPTION_3_MESSAGE = "You selected Option 3";
        public static final String RETURN_TO_MAIN_MENU_MESSAGE = "Returning to the main menu.";

    }

    public static class AdminMenuConstants {

        public static final String WELCOME_MESSAGE = "You are logged in as admin\nMake your choice:";

        public static final String MENU_OPTIONS =
                """
                        1 - View all equipment
                        2 - Add equipment to the warehouse
                        3 - Move equipment from the warehouse to the user
                        4 - View users
                        5 - Add users
                        6 - View offices
                        7 - Add offices
                        8 - View employees
                        9 - Add employees
                        0 - Back to main menu
                        """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";
        public static final String OPTION_3_MESSAGE = "You selected Option 3";
        public static final String OPTION_4_MESSAGE = "You selected Option 4";
        public static final String OPTION_5_MESSAGE = "You selected Option 5";
        public static final String OPTION_6_MESSAGE = "You selected Option 6";
        public static final String OPTION_7_MESSAGE = "You selected Option 7";
        public static final String RETURN_TO_MAIN_MENU_MESSAGE = "Returning to the main menu.";
    }

}
