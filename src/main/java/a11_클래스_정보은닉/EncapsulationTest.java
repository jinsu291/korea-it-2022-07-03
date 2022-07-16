package a11_클래스_정보은닉;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation("junil", "1234", "kakao");
        encapsulation.showInfo();

        encapsulation.setUsername("junil1111");
        String username = encapsulation.getUsername();
        System.out.println(username);
    }
}