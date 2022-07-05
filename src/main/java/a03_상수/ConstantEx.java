package a03_상수;

public class ConstantEx {

    public static void main(String[] args) {
        final double PI = 3.141592; //변할 일이 없을 때 사용

        final int MAX_NUM =100;
        //MAX_NUM = 200; -> 불가능하다 -> 이미 초기화 되었기 때문에 값 대입 불가능

        final int MIN_NUM;
        MIN_NUM =0;

        System.out.println(PI);
        System.out.println("최대값: "+ MAX_NUM);
        System.out.println("최소값: "+ MIN_NUM);
    }

}
