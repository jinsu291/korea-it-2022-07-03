package a09_반복;

public class MenuEx3 {
    public static void main(String[] args) {
       int dan = 2;
       int num = 0;
       int result = 0;

        System.out.println(dan + "단");
        while(num<9){
            ++num;
            result = dan * num;
            System.out.println("2 x " + num + " = " + result);
        }

    }
}


