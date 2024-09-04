package test;

public class SwitchEx4_java {
    public static void main(String[] args) {
        // 주민번호
        String peopleNumber = "810101-1234567";
        
        // 생년월일 출력
        String birth = peopleNumber.substring(0, 6);
        System.out.println("생년월일: " + birth);
        
        // 성별 출력
        char gender = peopleNumber.charAt(7);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("성별 정보 없음");
                break;
        }
        
        // 주민번호 각 자리 추출 및 출력
        int num1 = Integer.parseInt(peopleNumber.substring(0, 1));
        int num2 = Integer.parseInt(peopleNumber.substring(1, 2));
        int num3 = Integer.parseInt(peopleNumber.substring(2, 3));
        int num4 = Integer.parseInt(peopleNumber.substring(3, 4));
        int num5 = Integer.parseInt(peopleNumber.substring(4, 5));
        int num6 = Integer.parseInt(peopleNumber.substring(5, 6));
        
        int num7 = peopleNumber.charAt(7) - '0';
        int num8 = peopleNumber.charAt(8) - '0';
        int num9 = peopleNumber.charAt(9) - '0';
        int num10 = peopleNumber.charAt(10) - '0';
        int num11 = peopleNumber.charAt(11) - '0';
        int num12 = peopleNumber.charAt(12) - '0';
        int num13 = peopleNumber.charAt(13) - '0';
        
        // 주민번호 재포맷 출력
        System.out.printf("재포맷 주민번호: %d%d%d%d%d%d-%d%d%d%d%d%d%n",
                num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12);
        
        // 각 자리의 가중치 합계 계산 (예: 주민번호 검증 숫자 계산)
        int sum =
                num1 * 2 +
                num2 * 3 +
                num3 * 4 +
                num4 * 5 +
                num5 * 6 +
                num6 * 7 +
                num7 * 8 +
                num8 * 9 +
                num9 * 2 +
                num10 * 3 +
                num11 * 4 +
                num12 * 5;

        System.out.println("가중치 합계: " + sum);
    }
}
