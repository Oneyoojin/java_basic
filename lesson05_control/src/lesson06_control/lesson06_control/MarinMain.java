package lesson06_control;

public class MarinMain {
	private int a;
	public static void main(String[] args) {
		Marine marine = new Marine();
		
		System.out.println(marine.hp);
		marine.hp -= 5*6;
		
		System.out.println(marine.hp);
		
		System.out.println(marine.hp);
		Marine.att++; // 공격력 업.
		
		
	}
//	int add(int a, int b) {
//		return a+ b;
//	}
//	int c; //(타입 선언 int)
//	int b() {
//		return 0;//메서드의 본질. return 0 의 값과 똑같음.
	
	int add(int a, int b) {
		return a+b;
		
		
	}
	
	double c = 0;
	void d() {}

	void regist(Member member) {


	}
}
