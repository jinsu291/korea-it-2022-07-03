package a11_클래스_정보은닉;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("aaaa", "1234", "김준일", "aaaa@gmail.com");

//		user.setUsername("aaa");
//		user.setPassword("1234");
//		user.setName("김준일");
//		user.setEmail("aaaa@gmail.com");

        /*
         * 아이디 : aaa
         * 비밀번호 : 1234
         * 이름 : 김준일
         * 이메일 : aaaa@gmail.com
         */

        System.out.println("아이디:" + user.getUsername());
        System.out.println("비밀번호:" + user.getPassword());
        System.out.println("이름:" + user.getName());
        System.out.println("이메일:" + user.getEmail());
    }
}
