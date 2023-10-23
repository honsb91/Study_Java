package pack02.testinterface;

public class ProductMain {
	public static void main(String[] args) {
		
		ProductDAO dao = new ProductDAO();
		ProductDTO[] dtos = dao.initDtos();
		dao.display(dtos);
		
		// return 타입이 주어진 메소드는 해당하는 타입의 객체(변수)라고 보면 편함.
	}
}
