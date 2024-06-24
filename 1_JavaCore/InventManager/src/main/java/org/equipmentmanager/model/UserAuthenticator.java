package org.equipmentmanager.model;

import java.util.ArrayList;
import java.util.List;

public class UserAuthenticator {

    // TODO Хранить в файле/БД
    private List<User> users = new ArrayList<>();

    public UserAuthenticator() {
        users.add(new User("user", "user123", false));
        users.add(new User("admin", "admin123", true));
    }

    public boolean authenticate(String username, String password) {
        for (User users : this.users) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

//    public boolean adminRole(String username, String password) {
//        for (User users : this.users) {
//            if (users.getUsername().equals(username) && users.getPassword().equals(password) && users.getIfAdmin()) {
//                return true;
//            }
//        }
//        return false;
//    }



}