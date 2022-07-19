package a14_추상;

/*
 * 익명 클래스, 무명 클래스
 */

public class AnonymousClass {

    public static void main(String[] args) {
        Animal animal1 = new Animal() {
            @Override
            public void move() {
                System.out.println("토끼가 뜁니다.");
            }
        };

        Animal animal2 = new Animal() {
            @Override
            public void move() {
                System.out.println("강아지가 뜁니다.");
            }
        };
        animal1.move();
        animal2.move();

    }
}
