package exam.testextends;

// extends 라는 키워드가 없는 상태에서는 각각의 이름을 가진 별개의 클래스이다.
// Child_Class 가 extends 라는 키워드를 통해서 부모클래스를 선택하게 되면 그때부터는 부모와 자식 관계가 형성이 된다.
// extends 클래스명 <= 
public class Child_Class extends Prent_Class {
	String child_field = "자식클래스 인스턴스 멤버";
	public void childMethod() {
		System.out.println("자식클래스 메소드");
	}
}