package a11_클래스_접근지정;

public class UserTest {
    public static void main(String[] args) {
        User_J11 u1 = new User_J11();
        u1.setUsername("junil");
        String username = u1.getUsername();
        System.out.println(username); // 위 아래 둘다 사용가능
        System.out.println(u1.getUsername());
    }
}
