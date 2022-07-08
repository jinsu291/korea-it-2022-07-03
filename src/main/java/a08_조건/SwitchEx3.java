package a08_조건;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char grade = ' ';

        System.out.println("성적을 입력하세요.");
        score = scanner.nextInt();

        if(score > 100 || score < 0){
            System.out.println("성적은 0~100 사이만 입력 가능해야하고 만약 아니라면 해당 점수는 계산할 수 없습니다.");
        } else {
            switch (score / 10) {
                case 10 :
                case 9 : grade = 'A';
                break;
                case 8 : grade = 'B';
                break;
                case 7 : grade = 'C';
                break;
                case 6 : grade = 'D';
                break;
                default: grade = 'F';
            }
            System.out.println("해당 학생의 성적은" + score + "점이며 평점으로 변환 시" + grade + "학점입니다.");
        }
    }
}
