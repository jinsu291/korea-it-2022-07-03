package a10_메소드;

import java.util.Scanner;

public class MethodEx3 {
    /*
     * 최대 최소 구하기
     * 값 3개를 입력받는다.
     * num1, num2, num3
     *
     * max(num1, num2, num3);
     * min(num1, num2, num3);
     *
     * 최대값은 000입니다.
     * 최소값은 000입니다.
     */
    //메소드 오버로딩(매개변수에 따라서 바뀐다.)
    /*
     * 1. 같은 메소드 명을 쓸 수 있다.
     * 2. 매개변수가 다르면 정의할 수 있다.
     * 3. return 자료형이 다르다고 해서 메소드 옵로딩을 할 수 있는 것은 아니다.
     *
     */

    static int max(int num1, int num2, int num3) {
        int result = 0;
        if(num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        if(result < num3) {
            result = num3;
        }
        return result;
    }
    static int min (int num1, int num2, int num3) {
        int result = 0;
        if(num1 < num2) {
            result = num1;
        } else {
            result = num2;
        }
        if(result > num3) {
            result = num3;
        }
        return  result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;

        System.out.println("세 수를 입력하세요.");
        System.out.println("첫번째 수를 입력하세요");
        num1 = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요");
        num2 = scanner.nextInt();
        System.out.println("세번째 수를 입력하세요");
        num3 = scanner.nextInt();

        System.out.println("최대값은" + max(num1, num2, num3) + "입니다.");
        System.out.println("최소값은" + min(num1, num2, num3) + "입니다.");
    }
}