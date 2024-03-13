import java.util.ArrayList;
import java.util.List;

class Authenticator {

    // TODO Хранить в файле/БД
    private List<Users> users = new ArrayList<>();

    public Authenticator() {
        users.add(new Users("user", "user123", false));
        users.add(new Users("admin", "admin123", true));
    }

    public boolean authenticate(String username, String password) {
        for (Users users : this.users) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean adminRole(String username, String password) {
        for (Users users : this.users) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password) && users.getIfAdmin()) {
                return true;
            }
        }
        return false;
    }



}