package lesson05_control;

public class Exe {
    public static void main(String[] args) {
        // 1. 모두의 마블
        // 주사위 두개를 굴려서 이동한 거리를 계산.
        // 더블일 경우 한번 더 굴린다. 총 이동 거리를 출력.
        int totalSum = 0;
        int dice1, dice2;

        do {
            dice1 = (int)(Math.random() * 6 + 1);
            dice2 = (int)(Math.random() * 6 + 1);
            System.out.println("주사위 1: " + dice1);
            System.out.println("주사위 2: " + dice2);

            totalSum += dice1 + dice2;

            // 만약 더블이 아닌 경우 루프를 종료합니다.
            if (dice1 != dice2) {
                break;
            }
        } while (true);

        System.out.println("총 이동 거리: " + totalSum);
    }
}


		
	
			
		// 2. 두 수를 입력받아(정수) 두 숫자 사이의 정수의 합 3, 10
		// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3
		
		// 3. 자연수 두개 입력, 두 수의 최대공약수 구하기.
		// 12 18  >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
		
		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재 
		// ex) 10 소수가 아닙니다.
		
		//5. 회문수 여부 구하기
		// 123321 :  회문수 (역순으로 뒤집어도 같은 숫자), 12345 : 회문수 아님.



