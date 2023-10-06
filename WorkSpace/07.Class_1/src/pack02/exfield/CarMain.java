package pack02.exfield;

public class CarMain {
	public static void main(String[] args) {
		// 자바시간에만 main 메소드 씀 . -> html , jsp , android 화면
		// Car(Class) 설계도 -> 객체(car) 인스턴스화 ->
		// 객체화(인스턴스화) -> 설계도 클래스를 가지고 객체 (제품)를 사용할 수 있는 상태로 바꾸는 식(과정)
		// 클래스이름 객체화 (변수이름) = "new" 클래스이름();
		//인스턴스화 된 객체 ↓ (car)뒤에 . 을 찍으면 모든 멤버가 보인다.
		Car carh = new Car();
		
		carh.company = "현대";
		carh.type = "SUV";
		carh.color = "검정";
		
		
		System.out.println("자동차 회사 : " + carh.company);
		System.out.println("차 종류 :" + carh.type);
		System.out.println("차 색깔 :" + carh.color);
	}
}
