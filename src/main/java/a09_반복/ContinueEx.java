package a09_반복;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue; // continue는 밑에가 실행x
            }
            System.out.println(i);
        }
    }
}
