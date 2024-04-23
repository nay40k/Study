package org.equipmentmanager.model;

import org.equipmentmanager.db.dao.UserDAO;
import org.equipmentmanager.ui.Menu;

import java.util.ArrayList;
import java.util.List;


public class UserAuthenticator {

    // TODO Хранить в файле/БД

    private final List<User> users = new UserDAO().getAll(); // доставать лист из БД

//    public UserAuthenticator() {
//        users.add(new User("user", "user123", false));
//        users.add(new User("u", "u", false));
//        users.add(new User("admin", "admin123", true));
//        users.add(new User("a", "a", true));
//    }

    public User authenticate(String username, String password) {
        for (User user : this.users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; //throw UserNotFoundException
    }
}