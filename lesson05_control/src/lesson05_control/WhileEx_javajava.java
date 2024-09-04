package lesson05_control;

public class WhileEx_javajava {

	public static void main(String[] args) {
	int num = 123123;
	int sum = 0;
//	
//	while(num !=0) {
//		sum +=num % 10;
//		num /= 10;
	
	for(;num !=0;) {
		sum += num % 10;
		num /= 10;
	
	}
	System.out.println(sum);

	}
}
	
