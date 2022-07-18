package a13_배열;

/*
 * 배열(Array)
 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법
 *
 * 자료형[] 배열변수명 = new 자료형[배열공간의 개수];
 * int[] numbers = new int[5];
 * User[] users = new User[3];
 *
 *
 */

public class ArrayTest3 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[1] = 100;

        for(int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        /*
         * string 배열 10개의 공간을 생성
         * 가나다라마바사아자차
         *
         */

        System.out.println("------------");

        String[] hanguls = new String[15];

        hanguls[0] = "가";
        hanguls[1] = "나";
        hanguls[2] = "다";
        hanguls[3] = "라";
        hanguls[4] = "마";
        hanguls[5] = "바";
        hanguls[6] = "사";
        hanguls[7] = "아";
        hanguls[8] = "자";
        hanguls[9] = "차";

        for(int i = 0; i < hanguls.length ; i++) {
            System.out.println(hanguls[i]);
        }

        int[] numArray = {1, 5, 4, 3, 2, 6, 9, 0, 0, 0};
        int[] numArray2 = new int[100];

        for(int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}
