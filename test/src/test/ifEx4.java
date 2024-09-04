package test;

public class ifEx4 {
	public static void main(String[]args) {
	
	// 계절 계산
	int month = 1;
	switch (month/3){
	case 1:
		System.out.println("봄");
		break;
	case 2:
		System.out.println("여름");
		break;
	case 3:
		System.out.println("가을");
		break;
	default :
		System.out.println("겨울");
	}
	}
}
	//3,4,5 봄
	//6,7,8 여름
	//9,10,11 가을
	//12,1,2 겨울

