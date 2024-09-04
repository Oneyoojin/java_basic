package lesson06_control;

public class carMain {
	public static void main(String[] args) {
		
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		pride.color ="블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go();
		pride.go(); // 매서드를 호출한다. 필요한 만큼 가능.
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
		
		
		
	}

}
