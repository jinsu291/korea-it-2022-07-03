package a10_메소드;

import java.util.Scanner;

/*
 * 계산기
 * 입력
 * 첫번쨰 수 입력
 *
 * 사칙연산(+,-,*,/)
 *
 * 두번째 수 입력
 *
 * 결과를 출력
 *
 * 정수와 실수 모두 계산 가능해야함
 *
 * calc()
 */

public class MethodOverloading2 {

    public static String calc(Double num1, Double num2, char operator ) {
        String result = null;

        if(operator == '+') {
            result = Double.toString(num1 + num2);
        } else if(operator == '-') {
            result = Double.toString(num1 - num2);
        } else if(operator == '*') {
            result = Double.toString(num1 * num2);
        } else if(operator == '/') {
            result = Double.toString(num1 / num2);
        } else {
            System.out.println("계산 할 수 없는 연산자 입니다.");
        }
        return result;
    }
    public static String calc(int num1, int num2, char operator ) {
        String result = null;
        if(operator == '+') {
            result = Integer.toString(num1 + num2);
        } else if(operator == '-') {
            result = Integer.toString(num1 - num2);
        } else if(operator == '*') {
            result = Integer.toString(num1 * num2);
        } else if(operator == '/') {
            result = Integer.toString(num1 / num2);
        } else {
            System.out.println("계산 할 수 없는 연산자 입니다.");
        }
        return result;
    }
    public static String calc(int num1, Double num2, char operator ) {
        String result = null;
        if(operator == '+') {
            result = Double.toString(num1 + num2);
        } else if(operator == '-') {
            result = Double.toString(num1 - num2);
        } else if(operator == '*') {
            result = Double.toString(num1 * num2);
        } else if(operator == '/') {
            result = Double.toString(num1 / num2);
        } else {
            System.out.println("계산 할 수 없는 연산자 입니다.");
        }
        return result;
    }
    public static String calc(Double num1, int num2, char operator ) {
        String result = null;
        if(operator == '+') {
            result = Double.toString(num1 + num2);
        } else if(operator == '-') {
            result = Double.toString(num1 - num2);
        } else if(operator == '*') {
            result = Double.toString(num1 * num2);
        } else if(operator == '/') {
            result = Double.toString(num1 / num2);
        } else {
            System.out.println("계산 할 수 없는 연산자 입니다.");
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1 = null;
        String num2 = null;
        char operator = ' ';


        System.out.println("첫번째 수 입력 : ");
        num1 = scanner.next();

        System.out.println("연산할 기호를 선택하세요 : ");
        operator = scanner.next().charAt(0);

        System.out.println("두번째 수 입력 : ");
        num2 = scanner.next();

        System.out.println("결과1 : " + calc(Double.parseDouble(num1), Double.parseDouble(num2), operator));
        System.out.println("결과2 : " + calc(Integer.parseInt(num1), Integer.parseInt(num2), operator));
        System.out.println("결과3 : " + calc(Double.parseDouble(num1), Integer.parseInt(num2), operator));
        System.out.println("결과4 : " + calc(Integer.parseInt(num1), Double.parseDouble(num2), operator));
    }
}
