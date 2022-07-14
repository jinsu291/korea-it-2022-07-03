package A12_상속_다형성;

import a12_상속.Animal;
import a12_상속.Human;
import a12_상속.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Human human = new Human();
        Animal animal = human;

        animal.move();
        Human human2 = (Human) animal; //다운캐스팅
        human2.readBooks();

        /////////////////////
        System.out.println("-------");

        Animal[] animals = new Animal[4]; //공간만 만든거지 안에는 텅비어있는 상태

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Tiger();
        animals[3] = new Animal();

        System.out.println("-------");

        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);

            animals[i].move();

            if(animals[i] instanceof Human) {
                Human h = (Human) animals[i];
                h.readBooks();
                //((Human)animals[i]).readBooks();
            } else if (animals[i] instanceof Tiger ) {
                ((Tiger)animals[i]).hunting();
            } else {
                System.out.println("다운 캐스팅 할 수 없습니다.");
            }
        }
    }
}
