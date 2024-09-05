package lesson06_control;

public class Member {
    // 클래스 필드 정의
    int kor;
    int eng;
    int mat;
    int a = 10; // 인스턴스 변수
    
    int total() {
    	return kor+eng+mat;
    }

    public static void main(String[] args) {
        // 'Member' 클래스의 인스턴스 생성
        Member m = new Member();
        // 필드 값 설정
        m.kor = 90;
        m.eng = 60;
        m.mat = 80;
        // 필드 값 합계 출력
        System.out.println(m.kor + m.eng + m.mat);
        System.out.println(m.total());

        // 또 다른 'Member' 클래스의 인스턴스 생성
        Member m2 = new Member();
        // 필드 값 설정
        m2.kor = 80;
        m2.eng = 100;
        m2.mat = 90;
        // 필드 값 합계 출력
        System.out.println(m2.kor + m2.eng + m2.mat);
        System.out.println(m2.total());

        // 'm' 객체를 'm3'에 참조
        Member m3 = m;
        // 'm3'는 'm'과 동일한 객체를 참조
        System.out.println(m3.kor + m3.eng + m3.mat); // 'm'과 동일한 값 출력
        
    }
}
