package a04_형변환;

public class TypeConversionEx2 {
    public static void main(String[] args) {
        /*
        최저시급 9160원
        4주 근무
        1,3주 3일 근무
        2,4주 5일 근무
        3,4주는 시급의 5%를 더 추가한다.
         */

        final int HOUR_WAGE = 9160;
        int week = 4;
        int week1Day = 3;
        int week2Day = 5;
        int dayWork = 8;

        int pay = (int)((2.05 * HOUR_WAGE * (week1Day + week2Day) * dayWork)/10)*10;

        System.out.println("김준일의 월급은" + pay + "입니다."); //일의 자리수 버리기

        System.out.println("");


        double week1 = HOUR_WAGE * 3 * 8;
        double week2 = HOUR_WAGE* 5 * 8;
        double week3 = HOUR_WAGE* 3 * 1.05 * 8;
        double week4 = HOUR_WAGE* 5* 1.05 * 8;

        //시급 * 시간 * 일수

        int monthlyPay = 0;

        monthlyPay = (int)((week1 + week2 + week3+ week4)/10)*10;

        System.out.println("김준일의 월급은" + monthlyPay + "입니다."); //일의 자리수 버리기

    }

}

