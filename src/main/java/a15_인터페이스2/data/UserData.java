package a15_인터페이스2.data;

import a15_인터페이스2.model.User;

public class UserData {
    private User[] users;

    public UserData() {
    }

    public UserData(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void showUsers(){
        for(int i = 0; i < users.length; i++) {
            if(users[i] ==null) {
                continue;
            }
            System.out.println(users[i]);
        }
    }
}
