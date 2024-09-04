package lesson05_control;

public class Info_java {
    // 배열 : 하나의 변수로 여러 데이터를 저장
    // 타입[] 변수명; // 또는 타입 변수명[];

    int num;
    int[] arr = new int[5]; // 배열 초기화 (크기 5의 int 배열 생성)
    double[] arr2 = new double[5]; // 크기 5의 double 배열 생성

    public static void main(String[] args) {
        Info_java info = new Info_java();

        // 기본값 0으로 초기화된 arr 배열의 각 요소에 값 할당
        info.arr[0] = 10;
        info.arr[1] = 20;
        info.arr[2] = 30;
        info.arr[3] = 40;
        info.arr[4] = 50;

        // arr 배열의 모든 요소를 출력
        for (int i = 0; i < info.arr.length; i++) {
            System.out.println(info.arr[i]);
        }

        // 문자열 배열 선언 및 초기화
        String[] strs = {"홍길동", "이순신", "김유신"};
        
        // strs 배열의 두 번째 요소 출력
        System.out.println(strs[1]);

        // strs 배열의 모든 요소를 출력
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
    
    // 배열의 선언,
    // 길이를 통한 초기화,
    // 값을 통한 초기화
}
