package a12_상속;

public class Human extends Animal{

    public Human(){
        super("부모 생성?"); //생략되었다. -> 그래서 AnimalTest에서 부모 객체 생성 후에 자식 객체 생성됨
        System.out.println("자식 객체 생성"); //위로 올라올 수 없다. 부모 먼저 자식 그 후
    }
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
