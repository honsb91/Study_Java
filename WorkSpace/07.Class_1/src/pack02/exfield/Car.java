package pack02.exfield;

public class Car {
	// Car(자동차) : 속성
	// field(속성) : 전역변수 , 클래스의 멤버 => 클래스의 중괄호에서 만들어진 것들(멤버)
	// 전역변수 : 인스턴스화를 통해 메모리에 올라가기때문에 외부에서도 사용이 가능하다.
	// -> 클래스 내부에서는 어디서든 사용이 가능하다.
	// 이전까지 우리가 만들었던 모든 변수들은 main이라는 메소드의 중괄호 내부에 있음 -> 메인메소드 지역변수(지역화폐)
	// 지역변수는 선언만 되면 초기값을 가지지 못해 사용이 불가함.
	// 전역벽수는 기본값을 가짐 (0 , null)
	String company;//<ㅡ 필드, 인스턴스 멤버, 인스턴스 변수, 속성, 전역변수
	String type;//<-SUV,RV, 크기?
	String color;// 색상
	int maxSpeed; // 최고속력
	int speed; // 차의 현재속도
}