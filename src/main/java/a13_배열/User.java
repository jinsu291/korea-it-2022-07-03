package a13_배열;

public class User {

    private String username;
    private String userpassword;

    public User() {

    }

    public User(String username, String userpassword) {
        super();
        this.username = username;
        this.userpassword = userpassword;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public void showInfo() {
        System.out.println(username + ", " + userpassword);
    }
}
