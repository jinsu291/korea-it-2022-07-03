package a15_인터페이스2.controller;

import a15_인터페이스2.model.User;
import a15_인터페이스2.service.UserService;
import a15_인터페이스2.view.*;

import java.util.Scanner;

public class PageController {
    private final Input input;//final은 상수이다.
    private final UserService userService;

    public PageController(Input input, UserService userService) {
        this.input = input;
        this.userService = userService;
    }

    public void index() {
        Index index = new IndexImpl();
        Scanner scanner = new Scanner(System.in);
        while(true) {  //메인 루프
            index.show(); //메뉴 화면 출력
            char select = input.typedSelect(new Scanner(System.in));
            //메뉴 조건
            if(select == '1') { //회원가입
                User user = input.typedUser(scanner); //user 객체 생성 및 객체 데이터 삽입
                userService.addUser(user); //user 추가

            } else if (select == '2') { //회원 조회
                selectGetUser();
            } else if (select == 'q') {
                System.out.println("프로그램 종료.");
                break;
            } else {
                System.out.println("해당 명령은 실행할 수 없습니다.");
            }
            System.out.println();
        }

    }
    public void selectGetUser() {
        SelectGetUser selectGetUser = new SelectGetUserImpl();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            selectGetUser.show();
            input.typedSelect(scanner);
            char select = input.typedSelect(scanner);

            if(select == '1') {
                User[] users = userService.getUsers();

                for(int i = 0; i< users.length; i++) { //user배열에 들어있는 user객체 정보를 전부 출력
                    if(users[i] == null) {
                        //user배열의 해당 인덱스에 user객체가 없으면
                        //user객체.showUser()메소드를 호출 할 수 없기 때문에 continue로 넘기는 것이다
                        continue;
                    }
                    System.out.println(users[i]);
                    //users[i].showUser(); //해당 배열에 user객체가 존재하기 때문에 user정보를 출력.
                }
            } else if(select == '2') {
                String username = input.typedUsername(scanner);
                User user = userService.getUser(username);
                if(user == null) {
                    System.out.println("해당 아이디로 회원 정보를 조회할 수 없습니다.");
                } else {
                    System.out.println(user);
                }
            } else if(select == 'b') {
                System.out.println("메인 메뉴로 이동");
            } else {
                System.out.println("해당 명령은 실행할 수 없습니다.");
            }
            System.out.println();
        }
    }
}
