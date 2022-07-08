package a07_입력;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = null;
        String b = null;

        System.out.println("두 문자를 입력하세요 : ");
        a = sc.next();
        b = sc.next();

        System.out.println("결과 : " + a + b);
    }
}
