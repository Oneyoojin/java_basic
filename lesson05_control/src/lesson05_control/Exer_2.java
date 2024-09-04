package lesson05_control;
import java.util.Scanner;

public class Exer_2 {
	public static void main(String[] args) {
		// 지폐, 동전 세기
		int money = 260000;
		int [] units = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int [] counts = new int[10];
	
		for(int i = 0; i <units.length; i++) {
			counts[i] = money / units[i];
			money %= units[i]; // money = money % units[i]
			System.out.println(units[i]);
		}
		
		System.out.println("===============================");
		System.out.println("이름을 입력하세요.");
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		int q = 0; 
		int str1 = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하세요.");
			String name = in.nextLine();
		}
		
		
		if(name q == false);{
			System.out.println(q+"가 입력되어 종료됩니다.");
			break;
		}
	   System.out.println("입력한 이름: " + name);
	}	
//		System.out.println(str);
		
		
		
		//{ 2, 2, 0, 3, 0, 4,1, 0, 1, 1}
		
		//2. Scanner 사용하여 사람 이름을 입력 받기.
		// 입력 글자중 q를 입력하면 입력 종료.
		// 사람 이름들을 문자열 배열 만들어서 
		// 프로그램 종료직전 확인.
		
	

}

