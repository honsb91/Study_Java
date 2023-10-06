package pack03.constructor;

public class Test01_CarMain {

	public static void main(String[] args) {
		
		Test01_Car carv = new Test01_Car("기아", "쏘렌토");
		
		carv.company = "기아";
		carv.model = "SUV";
		carv.color = "검정";
		carv.name = "쏘렌토";
		
		System.out.println("제조사 : " + carv.company);
		System.out.println("모델 : " + carv.model);
		System.out.println("색상 : " + carv.color);
		System.out.println("자동차 이름 : " + carv.name);
	}
	

}
