package org.equipmentmanager.util;

public class Constants {

    private Constants() {}

    public static class GeneralConstants {
        public static final String ENTER_CHOICE_MESSAGE = "Enter your choice: ";
        public static final String INVALID_CHOICE_MESSAGE = "Invalid choice. Please try again.";
    }

    public static class MainMenuConstants {
        public static final String WELCOME_MESSAGE = "Welcome to Invent Manager App";
        public static final String MENU_OPTIONS =
            """
            1 - Authorization
            2 - Option 2
            0 - Exit
            """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";
        public static final String USERNAME_PROMPT = "Enter username: ";
        public static final String PASSWORD_PROMPT = "Enter password: ";
        public static final String AUTHENTICATION_FAILED = "Authentication failed. Access denied.";
        public static final String ADMIN_ROLE_MESSAGE = "Вы вошли с правами администратора";
        public static final String USER_ROLE_MESSAGE = "Вы вошли с правами пользователя";
    }

    public static class UserMenuConstants {
        public static final String MENU_OPTIONS =
            """
            1 - Option 1
            2 - Option 2
            3 - Option 3
            0 - Back to main menu
            """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";
        public static final String OPTION_3_MESSAGE = "You selected Option 3";
    }

    public static class AdminMenuConstants {
        public static final String MENU_OPTIONS =
            """
            1 - Adding equipment to the warehouse
            2 - Adding users
            3 - Adding rooms
            4 - Moving equipment from the warehouse to the user
            0 - Back to main menu
            """;
        public static final String OPTION_1_MESSAGE = "You selected Option 1";
        public static final String OPTION_2_MESSAGE = "You selected Option 2";
        public static final String OPTION_3_MESSAGE = "You selected Option 3";
        public static final String OPTION_4_MESSAGE = "You selected Option 4";
        public static final String RETURN_TO_MAIN_MENU_MESSAGE = "Returning to the main menu.";
    }

}
