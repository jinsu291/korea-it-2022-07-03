package a15_인터페이스2.view;

import a15_인터페이스2.model.User;

import java.util.Scanner;

public class InputImpl implements Input{

    @Override
    public char typedSelect(Scanner scanner) {   //명령을 선택 입력 후 해당 입력값 리턴
        System.out.println("명령을 입력하세요 : ");
        char select = scanner.next().charAt(0);
        scanner.nextLine();
        return select;
    }

    @Override
    public User typedUser(Scanner scanner) {
        User user = new User();
        System.out.println("[회원가입]");
        System.out.print("회원아이디: ");
        user.setUsername(scanner.nextLine());
        System.out.print("회원비밀번호: ");
        user.setPassword(scanner.nextLine());
        System.out.print("회원이름: ");
        user.setName(scanner.nextLine());
        System.out.print("회원이메일: ");
        user.setEmail(scanner.nextLine());
        return user;
    }

    @Override
    public String typedUsername(Scanner scanner) {
        System.out.println("[아이디로 회원 조회]");
        System.out.println("회원아이디: ");
        return scanner.nextLine();
    }
}
