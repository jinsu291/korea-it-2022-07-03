package a08_조건;

import java.util.Scanner;

public class IfEx5 {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("x축 입력 : ");
        x= scanner.nextInt();
        System.out.println("y축 입력 : ");
        y= scanner.nextInt();

        if(x == 0 && y == 0 ) {
            System.out.println("원점");
        } else if (x>0 && y>0) {
            System.out.println("1사분면");
        } else if (x<0 && y>0) {
            System.out.println("2사분면");
        } else if (x<0 && y<0) {
            System.out.println("3사분면");
        } else {
            System.out.println("4사분면");
        }

        //x와 y축은 귀찮으니 생략
    }
}
