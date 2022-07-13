package a11_클래스_접근지정;

public class User_J11 {
    private String username;
    private String password;
    private String name;
    private String email;

    public User_J11() { //기본 생성자
    }

    public User_J11(String username, String password, String name, String email) {
        //super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    //getter & setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
