package pack02.testinterface;

public class ProductDAO implements ProductInterface{

	public String[] rtnArr() {
		String[] str = new String[4];
		return str;
	}
	
	
	public String rtnStr() {
		String str = "문자";
		return str;
	}
	
	public int rtnInt() {
		return 0;
	}
	
	// 상품정보 5건을 담아 return 하는 메소드 initDtos를 완성하기
	@Override
	public ProductDTO[] initDtos() {
		ProductDTO[] dtos = new ProductDTO[5];
		dtos[0] = new ProductDTO(1,2000,"사과");
		dtos[1] = new ProductDTO(2,1500,"귤");
		dtos[2] = new ProductDTO(3,1000,"배");
		dtos[3] = new ProductDTO(4,3000,"멜론");
		dtos[4] = new ProductDTO(5,2500,"망고");
		return dtos;
	}

	// 상품정보를 담고있는 배열 dtos를 입력받아 내부 내용 ( 상품번호 , 명 , 가격 ) 을 출력하는 메소드
	@Override
	public void display(ProductDTO[] dtos) {
		System.out.println(COMPONY_NAME);
		for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getNum() + "." + dtos[i].getName() + "." + dtos[i].getPrice());
		}
	}
	
	// 각각의 메소드 출력은 ProductMain에서 한다.

}
