package test;

public class ForEx_java {
    public static void main(String[] args) {
        // 열 제목을 출력
        System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n", 
                          "i", "2*i", "2*i+1", "i*i", "10-i", "i%3", "i/3");

        // 반복문을 통해 값을 계산하고 출력
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5d %5d %5d %5d %5d %5d %5d\n",
                              i, 2 * i, 2 * i + 1, i * i, 10 - i, i % 4, i / 4);
        }
    }
}
