package a02_변수;

public class ValiableEx2 {
    public static void main(String[] args) {
		/*
		* 문제1.
		* 이름: 김준일
		*
	    * 문자형 변수 firstName1
		* firstName2
		* lastName1
		 */

        char firstName1 ='준';
        char firstName2 ='일';
        char lastName1 ='김';

        System.out.print("이름: ");
        System.out.print(lastName1);
        System.out.print(firstName1);
        System.out.println(firstName2);

        System.out.println("-------");

        System.out.println("이름: "+ lastName1 + firstName1 + firstName2);

        System.out.println("-------");

        //플러스 연산자 때문에 문제가 생김
        //"" -> 비어있는 문자열

        System.out.println(lastName1 + firstName1 + firstName2);
        System.out.println(lastName1);

        System.out.println(""+ lastName1 + firstName1 + firstName2);
        System.out.println(""+ lastName1 + firstName1 + firstName2);

        char alphabet_a ='a';

        System.out.print(alphabet_a +1);//아스키코드라고 착각할 수 있지만 유니코드이고, 유니코드로 바껴서 나옴

    }

}