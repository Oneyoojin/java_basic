package lesson05_control;

public class Exer2 {
	public static void main(String[] args) {
		
		int num = 1234321;
		int result = 0;
		int tmp = num;
		
		while(tmp !=0) {
//			System.out.println(tmp);
//			System.out.println(tmp % 10);
			result = result * 10 + tmp % 10;
//			result += tmp % 10;
			tmp /= 10;
		}
		System.out.println(result == num ? "회문수":"아님");
		
	}
}
