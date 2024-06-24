package org.equipmentmanager.model;

import org.equipmentmanager.db.dao.UserDAO;
import org.equipmentmanager.ui.Menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserAuthenticator {

//    private List<User> users = new UserDAO().getAll();

    public User authenticate(String username, String password) {
        List<User> users = new UserDAO().getAll();
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}