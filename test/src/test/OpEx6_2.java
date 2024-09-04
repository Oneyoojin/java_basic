package test;

public class OpEx6_2{
	private static byte b2;

	public static void main(String[]args) {
		// 숫자를 문자열로
		int num = 10;
		String s = num+"";
		System.out.println(s);
		
		//문자열을 숫자로
		int num2 =Integer.parseInt("1234");
		System.out.println(num2 %10);
		
		String bin = "11010";
		int num3 = Integer.parseInt(bin,3);
		System.out.println(num3);
		
		char ch ='A';
		char ch2 = (char) (ch+1);
		
		// 산술 형 상승 : int 보다 작은 숫자 타입을 이항 연산 시 int 
		System.out.println(ch2);
		
		// int double char boolean
		
		// byte. short, char
		byte b =Byte.MAX_VALUE;
		byte b1 = 1;
		byte b2 = (byte)(b - b1);
		System.out.println(b2);
		
		int i = 300;
		byte b3 =(byte)i;
		
		System.out.println(i);
		System.out.println(b3);
		
		
		System.out.println('9'-'0'+1);
		System.out.println('힣'-'가'+1);
		
		System.out.println("==============================");
		
		int cnt = 0;
		for(ch2 ='가'; ch2 <'까'; ch2++) {
			System.out.println();
			System.out.print(ch2);
		    cnt++;
		}
		System.out.println();
		System.out.println(cnt * 19);
		
		System.out.println("==============================");
		int apple = 123;
		int box = 10;
		
//		int result = apple / box == 0 ? apple/box : apple/box +1;
		int result = (apple + 9)/box;
		System.out.println(result); 
		
		System.out.println("==============================");
		
		double pi = 3.141592;
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000 + 0.5)/ 1000d);
		
					
	}
	
}

