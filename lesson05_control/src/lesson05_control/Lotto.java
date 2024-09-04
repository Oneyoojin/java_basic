package lesson05_control;

public class Lotto {
	
	// 1~ 45 6개의 숫자를 고르는 것.
	public static void main(String[] args) {
		int[] lotto = new int[6]; // [0,0,0,0,0,0]

		int idx = 0; //계속 0을 뽑는것을 언제까지 하는지.
		while (true) { // 무한으로 뽑기.
			int number = (int) (Math.random() * 45) + 1; // 10이라 가정 했을때 인서트 값을 true 초기화

			boolean insert = true;
			for (int i = 0; i <= 1; i++) {
				if (lotto[i] == number) { //lotto[i]가 넘버랑 같으면
					insert = false;
					break;
				}
			}
			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6)
				break;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
