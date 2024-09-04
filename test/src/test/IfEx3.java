package test;

public class IfEx3 {
    public static void main(String[] args) {
        // 자격증 시험, 과락
        // 세 과목
        // 60 이상이면 합격
        // 단 개별 과목이 40 미만이면 불합격

        int score1 = 50;
        int score2 = 90;
        int score3 = 30;
        int avg = (score1+score2+score3)/3;
        System.out.println(avg);
        
        if (avg >= 60 && score1 >= 40 && score2 >= 40 && score3 >=40) {
            System.out.println("합격입니다.");
        }
        else {
            System.out.println("불합격입니다.");
        }
    }
}
