package org.equipmentmanager.model;

import org.equipmentmanager.db.dbmanager.DBConnector;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import lombok.*;


@Data
@AllArgsConstructor
public class UserAuthenticator {
    private Connection conn = DBConnector.connect();

    // TODO Хранить в файле/БД
    private List<User> users = new ArrayList<>();

    public UserAuthenticator() {
        users.add(new User("user", "user123", false));
        users.add(new User("admin", "admin123", true));
    }

    public User authenticate(String username, String password) {
        for (User user : this.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; //бросать эксепшн
    }

    //удалить и работать с полем экземпляра класса User
    public boolean adminRole(String username, String password) {
        for (User users : this.users) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password) && users.getIfAdmin()) {
                return true;
            }
        }
        return false;
    }
}