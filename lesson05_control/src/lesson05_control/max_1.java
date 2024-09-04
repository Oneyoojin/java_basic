package lesson05_control;

public class max_1 {
	public static void main(String[]args) {
		
		System.out.println("가위(1) 바위(2) 보(3)");
		int me = max_1.nextInt();
		int com = (int)(Math.random()*3) + 1;
		String res = "";
		switch(me-com) {
		case -2, 1:
			res = "이겼습니다";
			break;
		case -1, 2:
			res = "졌습니다.";
			break;
		default:
			res = "비겼습니다.";
		}
		System.out.println("나의 패:"+me +"\n 컴퓨터의 패:" +com +"\n 결과"+res);;
	}
}
