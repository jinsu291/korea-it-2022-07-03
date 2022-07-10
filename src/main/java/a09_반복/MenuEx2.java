package a09_반복;

import java.util.Scanner;

public class MenuEx2 {
    public static void main(String[] args) {
        int 운동장 = 0;
        int 코끼리코 = 0;

        while(운동장 < 5){
            운동장++;
            코끼리코 = 0;
            System.out.println("운동장" + 운동장 + "바퀴째");
            while(코끼리코 < 10) {
                코끼리코++;
                System.out.println("코끼리코" + 코끼리코 + "바퀴째");
            }
       }

    }
}


