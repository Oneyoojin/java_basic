package lesson05_control;

// 2. 두 수를 입력받아(정수) 두 숫자 사이의 정수의 합 3, 10
// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3

public class Exe_1 {
public static void main(String[] args) {
//	
//	int num1 = 3;
//	int num2 = 10;
//	int sum = 0;
//	for(int i =1; i<=num2 ; i++) {
//		sum+= i;
//	}
//	System.out.println(sum);
	
	int num1 =10;
	int num2 = 3;
	int sum = 0;
	if ( num1 > num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		
	}
	for(int i = num1; i<= num2; i++) {
		sum += i;
	}
	System.out.println(sum);
		}
	}