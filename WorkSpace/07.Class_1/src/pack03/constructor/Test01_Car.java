package pack03.constructor;

public class Test01_Car {
	// 1. 내가 사용할 필드 만들기 ( 제조사 , 모델, 색상 , 자동차 이름 )
	// 2. Test01_CarMain에서 각각의 필드에 값을 담고 출력해보기.
	// 3. Test01_Car가 제조사와 자동차 이름이 외부로부터 입력 되었을때만 생성되게 수정해보기
	
	String company;
	String model;
	String color;
	String name;
	
	
	

	public Test01_Car(String company, String name) {
		this.company = company;
		this.name = name;
	}
}
