package a12_상속_User;

/*
 * User class
 * username
 * password
 * email
 *
 * Boolean login(아이디, 비밀번호)
 * 자기자신의 아이디와 매개변수의 아이디가 같은지
 * 그리고
 * 자기자신의 비밀번호와 매개변수의 비밀번호가 같은지
 * 둘다 같으면 true 리턴
 * --------------------------------
 *
 * Company class
 * companyName
 * companyAddress
 * companyTel
 *
 * PersonalUser class
 * name
 * phone
 */

public class User {

    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

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



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean login(String username, String password){
        if(username.equals(this.username) && password.equals(this.password)){
            return true;
        } else {
            return false;
        }
    }
}
