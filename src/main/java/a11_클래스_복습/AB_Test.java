package a11_클래스_복습;

public class AB_Test {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        B b = new B();

        System.out.println("---------");

        Integer n = new Integer(100);
        int n2 = 100;   //위 아래 같은 의미

        System.out.println(n+n2);

        System.out.println("---------");

        a.num = 100;
        a.num2 =200;
        a.printNumberAndNum2();

        System.out.println("---------");

        a2.num = 300;
        a2.num2 = 400;
        a2.printNumberAndNum2();

        System.out.println("---------");

        b.str = "200";
        b.str2 = "400";
        b.printStrAndStr2();

        System.out.println("---------");

        A a3 = new A(10, 20);
    }
}
