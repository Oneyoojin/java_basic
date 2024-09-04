package lesson05_control;

//3. 자연수 두개 입력, 두 수의 최대공약수 구하기.
		// 12 18  >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
public class EX_최대공약수 {
	public static void main(String[] args) {
//	
	int num1 = 12;
	int num2 = 18;
	int result = 0;
//	
//	for(int i = 1; i <=num1; i++) {
//		for(int j = 1; i <=num2; j++) {
//			if(num1 % i == 0 && num2 % j == 0 && i ==j) {
//				result = i;
	boolean flag = true;
//	while(flag) {
//		int tmp = num1 % num2;
//		System.out.printf("%d %d %d\n",num1, num2, tmp);
//			num1 = num2;
//			num2 = tmp;
//			if(tmp == 0) {
//			flag = false;
//			System.out.println(num1);
//			System.out.println(result);
			
			System.out.println("===================================");
			
			
			int num = 11;
			flag = true;
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
				break;
				}
				
	}
			System.out.println(num +"은" + (flag? "소수":"소수 아님"));
			}

	// gcd * a * b
	
	// 12 24 36 48 60 
	// 18 36 54 72 90

		}





	// 12	18	12
	// 		18 	12	6
	//			12	6 	0
	
