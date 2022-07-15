package a10_메소드2;

import java.util.Scanner;

public class Calc {
    /*
     * 매개변수는 모두 2개
     * sum 덧셈
     * sub 뺄셈
     * mul 곱셈
     * div 나눗셈
     * 매개변수 둘중 하나라도 0이면 0을 리턴
     *
     * 두 수를 입력
     *
     * 더한결과 :
     * 뺀결과:
     * 곱한결과:
     * 나눈결과:
     */
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        if(a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0; int b = 0;

        System.out.println("두 수를 입력");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("더한결과 : " + sum(a, b));
        System.out.println("뺀결과 : " + sub(a, b));
        System.out.println("곱한결과 : " + mul(a, b));
        System.out.println("나눈결과 : " + div(a, b));
    }

}
