package a15_인터페이스2.service;

import a15_인터페이스2.model.User;

public interface UserService {
    public void addUser(User user);
    public User[] getUsers();
    public User getUser(String username);
}
