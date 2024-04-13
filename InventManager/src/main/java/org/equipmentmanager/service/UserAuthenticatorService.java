package org.equipmentmanager.service;

import org.equipmentmanager.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserAuthenticatorService {

    private static UserAuthenticatorService INSTANCE;

    private final List<User> users = new ArrayList<>();
    private User currentUser;

    private UserAuthenticatorService() {
        users.add(new User("user", "user123", false));
        users.add(new User("admin", "admin123", true));
    }

    public static UserAuthenticatorService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserAuthenticatorService();
        }
        return INSTANCE;
    }

    public User authenticate(String username, String password) {
        for (User user : this.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return currentUser;
            }
        }
        return null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

}