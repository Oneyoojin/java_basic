package lesson05_control;

public class Exer_약수 {
	public static void main(String[] args) {
		
		boolean flag = true;
		int num = 10;
		flag = true;
		for(int i = 2; i < num; i++) {
//			if(num % i == 0)
			System.out.printf("%d : %d\n",i,num % i);
		}
	}

}
