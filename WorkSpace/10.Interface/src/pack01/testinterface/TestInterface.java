package pack01.testinterface;


public interface TestInterface {
// 인터페이스에서 구현하는 모든것들은 추상메소드. 상수 
// 여러 개발자가 같은 인터페이스를 상속받고 , 각자의 DAO를 만들고 만들고 병합하면 오류없이 코드 호출이 가능함.(Spring MVC)
// final <- 상수 : 초기값 설정 후 변경 불가능
	String SERVER_IP = "192.168.0.48";
	void search();
	void insert();
}