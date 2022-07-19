package a15_인터페이스2.view;

import a15_인터페이스2.model.User;

import java.util.Scanner;

public interface Input {
    public char typedSelect(Scanner scanner);
    public User typedUser(Scanner scanner);
    public String typedUsername(Scanner scanner);
}
