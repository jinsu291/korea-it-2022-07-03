package a07_입력;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String name = null;
        String phone = null;
        String job = null;
        String gender = null;
        int age = 0;
        String address = null;
        String email = null;

        System.out.println("이름입력 : ");
        name = in.next();
        System.out.println("연락처입력 : ");
        phone = in.next();
        System.out.println("직업입력 : ");
        job = in.next();
        System.out.println("성별입력 : ");
        gender = in.next();
        System.out.println("나이입력 : ");
        age = in.nextInt();
        in.nextLine();
        System.out.println("주소입력 : ");
        address = in.nextLine();
        System.out.println("이메일입력 : ");
        email = in.next();

        System.out.println("고객의 이름은 " + name + "이고, 직업은 " +job + "입니다.");
        System.out.println("나이는 " + age + "이고, 성별은 " + gender + "성입니다.");
        System.out.println("연락처 : " + phone );
        System.out.println("주소 : " + address );
        System.out.println("이메일 : " + email );
    }
}
