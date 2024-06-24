package org.equipmentmanager.model;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    String userName;
    String password;
    boolean isAdmin;


    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }
}
