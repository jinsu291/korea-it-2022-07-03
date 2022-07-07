package a05_연산자;

public class OperationEx4 {
    /*
        논리연산자

        0이 아니면 무조건 true
        0이면 false

        AND (&&) -> 곱
		true && true = true : 1 * 1
		true && false = false : 1 * 0
		false & false = false : 0 * 0
		특징
		모든 값이 true 여야지만 결과가 true 이다.
		하나라도 false 이면 결과가 false 이다.

		OR (||) -> 합
		true || false = true : 1 + 0
		false || false = false : 0 + 0
		특징
		하나라도 true 이면 결과는 true 이다.
		모든 결과가 false 여야 결과는 false 이다.

		NOT (!) -> 부정
		!(true || true) => false
		true && !false => true
        */

    public static void main(String[] args) {

    System.out.println(true || false);
    System.out.println(true && false);
    System.out.println(true && !false);
    }

}

