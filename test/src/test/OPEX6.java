package test;

public class OPEX6 {
	public static void nain(String[]args) {
		// += : 우측향의 값을 좌항값에 더하여 좌항에 대입
		// a+= b; // a = a+b
		
		System.out.println(7-1 * 20 / 5);
		int colorPen = 5 * 12 ;
		int studentCount = 27;
		int divColorPen = colorPen / studentCount;
		System.out.println("학생당 색연필 수"+ divColorPen);
		
		int reaminColorPen =colorPen - divColorPen * studentCount;
		System.out.println("남은 색연필 수"+ reaminColorPen);
		
		
	}

}
