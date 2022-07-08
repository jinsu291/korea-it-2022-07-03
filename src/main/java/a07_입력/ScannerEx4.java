package a07_입력;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("첫번째 수 입력 : ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("두번째 수 입력 : ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("세번째 수 입력 : ");
        c = sc.nextInt();

        System.out.println("두 수의 합 : " + (a + b + c) );
    }
}
