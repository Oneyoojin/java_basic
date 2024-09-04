package lesson05_control;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = new int[45];

        // 배열을 0부터 45까지의 값으로 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // 초기화된 배열을 출력
        System.out.println("셔플 전 배열: " + Arrays.toString(arr));

        // 배열 셔플
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * arr.length);
            // i와 rand 인덱스의 요소를 교환
            int tmp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = tmp;
        }
        
        // 6개만 가져오기
        int[]lotto = new int[6];
        for(int i =0; i <lotto.length; i++) {
        	lotto[i] = arr[i];
        }

        // 셔플된 배열을 출력
        System.out.println("셔플 후 배열: " + Arrays.toString(lotto));
    }
}
