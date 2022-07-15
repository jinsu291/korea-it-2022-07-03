package a11_클래스;

public class Computer {
    String model;

    //생성자의 return 값은 무조건 주소값이다.
    public Computer() {

        System.out.println("컴퓨터 객체를 생성합니다.");

    }
    public void printInfo() {
        System.out.println("컴퓨터 모델 : " + model);
    }
}