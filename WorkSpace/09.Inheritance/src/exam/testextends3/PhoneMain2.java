package exam.testextends3;

public class PhoneMain2 {
	public static void main(String[] args) {
		
		// 스마트폰 생성 후 기능 사용해보기
		
		SmartPhone smart = new SmartPhone("DMB 폰 삼성", "검정", 0 , "5G");
		smart.powerOn();
		smart.onInternet();
			
		
	}
}
