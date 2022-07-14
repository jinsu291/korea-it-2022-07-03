package a13_배열;

public class ArrayTest2 {
    public static void main(String[] args) {
        //배열을 생성 후 값을 초기화
        int[] numbers = new int[5];  //numbers를 int로 볼게 아니고 int배열로 봐야한다!

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        String[] names = {"김준일", "강성빈", "도해선", "김동환"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
