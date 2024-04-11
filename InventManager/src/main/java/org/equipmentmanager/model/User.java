package org.equipmentmanager.model;

public class User {

    String userName;
    String password;
    boolean isAdmin;

    public User(String userName, String password, boolean isAdmin) {
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIfAdmin() {
        return isAdmin;
    }
}
