package a08_조건;

import java.util.Scanner;

public class IfEx3 {

    /*
     * score = 정수형 숫자
     * grade = A ~ F(String)
     * result = "해상 학생의 성적은 00점이며 평점으로 변환 시 A 학점입니다."
     * 입력을 받는다.
     *
     * 성적을 입력해 주세요:
     * 성적은 0~100 사이만 입력 가능해야하고 만약 아니라면 해당 점수는 계산할 수 없습니다.
     * 평점
     * 90 ~ 100 A
     * 80 ~ 89  B
     * 70 ~ 79  C
     * 60 ~ 69  D
     * 0 ~ 59   F
     */

    public static void main(String[] args) {

        int score = 0;
        String grade = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("성적을 입력하세요.");
        score = scanner.nextInt();

        if (score < 101 && score > -1) {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            System.out.println("성적은 0~100 사이만 입력 가능해야하고 만약 아니라면 해당 점수는 계산할 수 없습니다.");
        }
        if(score < 101 && score > -1) {
            System.out.println("해당 학생의 성적은" + score + "점이며 평점으로 변환 시" + grade + "학점입니다.");
        }
    }
}
