package a13_배열;

public class ArraySome {

    public static void main(String[] args) {
        /*
         * numbers 정수 배열 1001개의 공간 생성
         * 1~1000
         *
         * 1~1000까지 출력
         *
         * 1~1000까지 더한 수를 출력
         *
         * index 1000번에 1~1000까지 더한 수를 대입 후 출력
         */

        int[] numbers = new int[1001];

        for(int i = 0; i < numbers.length-1 ; i++) {
            numbers[i] = i+1;
        }
        for(int i = 0; i < numbers.length - 1 ; i++ ) {
            numbers[1000] += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[1000]);
    }
}

