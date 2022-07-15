package a10_메소드2;

import java.util.Scanner;

public class OddAndEven {

    /*
     * 수를 3개를 입력 받는다.
     *
     * oddAndEven(정수)
     * 받은 정수가 홀수인지 짝수인지 구분해서
     * 홀수면 true
     * 짝수면 false
     * return
     *
     * 10 = "짝"
     * 11 = "홀"
     */

    public static void printResult (int num) {
        System.out.println(num + " = " + (oddAndEven(num) == true ? "홀" : "짝"));
    }
    public static boolean oddAndEven(int num) {
        boolean result = false;
        if(num % 2 != 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("3개의 수를 입력하세요.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        printResult(a);
        printResult(b);
        printResult(c);

    }
}
