class Users {

    private boolean isAdmin;
    private String username;
    private String password;

    public Users(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIfAdmin() {
        return isAdmin;
    }
}
