package pack02.product;
// DTO : 객체의 속성 (데이터 베이스에 있는 데이터 타입에 맞춰서 데이터를 "운반")
// (Value Object) : Web 표준 -> 생성자를 별도로 x , 필드에 접근을 막아놓은 형태
public class ProductDTO {
	
	int num;
	private int price;
	String name;
	
	public void setPrice(int price) {
		if(price < 0) {
			this.name = "(x)금액 입력 오류";
		}else {
			this.price=price;
		}
		
	}
	public int getPrice() {
		return price;
	}
	
	// public : 외부에서 접근이 되어야 하는 메소드
	// getter & setter
	// get <- 외부로부터 접근이 안되는 필드의 변수값을 return
	// set <- 필드의 변수값을 바꾸기 위한 (set) 메소드
	

}
