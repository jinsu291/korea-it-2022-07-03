package a05_연산자;

public class OperationEx6 {
    public static void main(String[] args) {
        boolean flag = false;
        boolean flag2 = false;

        System.out.println(flag && flag2 ? "AND(참)" :
                flag || flag2 ? "AND(거짓) , OR(참)" :	"AND(거짓), OR(거짓)");

        int score = 85;
        System.out.println(score > 89 ? "A학점" :
                score > 79 ? "B학점" :
                        score > 69 ? "C학점" :
                                score > 59 ? "D학점" : "F학점");
        /*
         select == 1 -> 덧셈
         select == 2 -> 뺄셈
         select == 3 -> 곱셈
         select == 4 -> 나눗셈
         select == 1,2,3,4 가 아닐 때 0을 반환
         */

        char select = '1';
        int num1 = 10;
        int num2 = 5;
        int result = 0;

        //select == '1' ? num1 + num2 :
        result = select == '1' ? num1 + num2 :
                select == '2' ? num1 - num2 :
                        select == '3' ? num1 * num2 :
                                select == '4' ? num1 / num2 : 0 ;

        System.out.println("결과 : " + result);


        /*
         score가 100 ~ 0 사이여야 한다. 만약 아니라면 x를 리턴
         */

        char grade = ' ';
        score = 80;

        grade = score >100 ? 'X' :
                score > 89 ? 'A' :
                        score > 79 ? 'B' :
                                score > 69 ? 'C' :
                                        score > 59 ? 'D' :
                                                score > 0 ? 'F' : 'X' ;

//		score > 100 || score < 0 ? 'x' :
//			score > 89 뒤는 ..

        System.out.println("결과: " + grade );

    }

}

