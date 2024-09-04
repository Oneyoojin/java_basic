package test;

public class if01 {
	public static void main(String[] args) {
		double rand = Math.random(); // 0~ 0.99999999999999999
		
		
		int score = (int)(rand * 101);
		System.out.println("점수 : "+score);
		
		System.out.println("시험 시작");
		if (score >= 60) {
			System.out.println("합격입니다.");}
		else {
			System.out.println("불합격입니다.");
		}
	 
	System.out.println("시험 끝"); 
	}
}