package lesson05_control;

public class Enhanced {
	public static void main(String[]args) {
		int [] arr = {10, 15, 5, 20, 30 };
		for (int i = 0; i< arr.length; i++) {
			arr[i] = i * 10;
			System.out.println(arr[i] + "");
			
		}
		System.out.println();
		
		//향상된 for문
		// 인덱스 x
		// 읽기 전용
		
		//for (타입 변수 : 배열)
		
		for (int num : arr) {
			num = 100;
			System.out.println(num+"");
		}
		System.out.println(arr);

		String[] strs = {"더조은","아카데미","자바","데이터베이스"};
		int cnt = 0;
		for (String s : strs ) {
			cnt++;
			System.out.println(s);
		}
	} 
	

}
