package a14_추상;

public class AnimalAbstractTest {

    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

        human.move();
        tiger.move();
        eagle.move();

    }
}
