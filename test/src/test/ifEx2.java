package test;

public class ifEx2 {
	public static void main(String[]args) {
		double rand = Math.random();
		
		int score = (int)(rand * 101);
		System.out.println("점수 :"+score);
		String grade = "";
		
		System.out.println("학점부여 시작");
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade ="F";
			
		}
		// +붙이기 
		if (score >= 80 && score % 10 >= 5 || score == 100) {
			grade +="+";
		}
		System.out.println("당신의 학점은"+grade+"점수는 "+score+"입니다.");
		System.out.println("학점부여 끝");

	}

}
