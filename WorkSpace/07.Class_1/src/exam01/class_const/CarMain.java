package exam01.class_const;

public class CarMain {
	public static void main(String[] args) {
		
		Car car= new Car("12가1234"); // 클래스의 인스턴스화
		
		car.color = "검정";
		car.compony = "기아";
		
		
		System.out.println("자동차 색깔 : " + car.color + "자동차 회사 : " + car.compony );
	}
}
