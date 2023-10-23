package pack02.testinterface;

public interface ProductInterface {
	// 클래스의 규칙만 있음
	// 실제 기능구현은 클래스 ( implements)
	public String COMPONY_NAME = "인터페이스 회사";
	// 초기데이터 5건을 리턴받는 메소드
	public ProductDTO[] initDtos();
	
	public void display(ProductDTO[] dtos); // 배열을 입력받아 내부의 내용을 출력하는 메소드.
	
	
}
