package pack01.method;

public class CarMain {
	public static void main(String[] args) {
		// 1.Car의 인스턴스 멤버 -> Car가 인스턴스화 -> 객체 -> 객체 . 사용이 가능하다.
		Car car = new Car();
//		for (int i = 0; i < 10; i++) {
//			car.nsbMethod(); // 만들어진 메소드를 호출함 -> 메소드의 중괄호 블럭킹 시작과 끝을 전부 실행 .
//		}
		// 메소드의 파라메터
		// 정의 = 호출 : 변수 초기화 식
		car.nsbMethod1("철수");
		car.nsbMethod2("철수", "휴식");
		car.nsbMethod3("철수", 30);
		car.nsbMethod4("현대", 3000);
		car.nsbMethod5(5);
		System.out.println(car.rtnMethod1()+1);
		System.out.println(car.rtnMethod2(50));
}
	}
