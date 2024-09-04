package test;
public class CountAlphabetsAndDigits {
    public static void main(String[] args) {
        String input = "Hello World! 123";

        int letterCount = 0;
        int digitCount = 0;

        // 문자열의 각 문자를 검사합니다.
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // 결과 출력
        System.out.println("알파벳 개수: " + letterCount);
        System.out.println("숫자 개수: " + digitCount);
    }
}
