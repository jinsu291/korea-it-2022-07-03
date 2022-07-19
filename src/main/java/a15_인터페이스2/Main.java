package a15_인터페이스2;

import a15_인터페이스2.controller.PageController;
import a15_인터페이스2.data.UserData;
import a15_인터페이스2.model.User;
import a15_인터페이스2.service.UserServiceImpl;
import a15_인터페이스2.view.InputImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //입력을 위해서 스캐너 객체 생성
        UserData userData = new UserData();  //회원정보(User객체)를 저장하고 공유하기 위해 생성
        System.out.println("관리할 회원의 수를 입력해주세요: ");
        userData.setUsers(new User[scanner.nextInt()]);
        //회원을 저장할 배열의 크기를 지정하고 생성된 배열을 UserData 객체의 users 배열 변수에 set하는 것
        scanner.nextLine();
        //위의 nextInt() 후에 버퍼에 저장된 엔터를 날려주기 위함.

        PageController PageController = new PageController(new InputImpl(), new UserServiceImpl(userData));
        //PageController 객체 안의 index()메소드를 실행하기 위해 생성.
        PageController.index();

    }

}



