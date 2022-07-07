package a05_연산자;

public class OperationEx2 {
    public static void main(String[] args) {
        int num = 100;
        int num2 = num++;

        System.out.println("선증가 : " + num2);

        num2 = num;
        System.out.println("후증가 : " + num2);

        System.out.println("===============증가=============================");
        int a = 10;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);  //단순하게 a
        System.out.println(a);   //++a라고 생각하면 됨. (실제로는 아니고 모르겠으면 이렇게 생각)

        System.out.println("===============감소=============================");

        System.out.println(--a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

    }

}

