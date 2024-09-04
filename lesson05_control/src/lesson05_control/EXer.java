package lesson05_control;

public class EXer {
    public static void main(String[] args) {
        int sum = 0;
        
        // 0부터 100까지의 5의 배수 합계 계산
        for (int i = 0; i <= 100; i += 5) {
            if(i % 5 == 0)
                sum += i;
        }
        System.out.println("5의 배수 합계는 " + sum);

        int evenSum = 0;
        int oddSum = 0;
        
        // 1부터 100까지 짝수와 홀수 합계 계산
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {  // 짝수일 경우
                evenSum += i;
            } else {  // 홀수일 경우
                oddSum += i;
            }
        }
        System.out.println("짝수의 합계: " + evenSum);
        System.out.println("홀수의 합계: " + oddSum);
        
        // 두 주사위의 곱이 -1에서 1 사이일 때 출력
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i * j >= -1 && i * j <= 1) {  // 곱이 -1에서 1 사이일 경우
                    System.out.printf("(%d,%d)", i, j);
                    System.out.println("*");
                } else {
                    System.out.printf("%7c", ' ');  // 공백 출력
                }
            }
            System.out.println();  // 한 줄 끝나면 줄바꿈
        }
    }
}
