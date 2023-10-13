package product_test;

public class ProductDTO {

	private int num;
	private int price;
	private String name;
	
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ProductDTO(int num, int price, String name) {
		this.num = num;
		this.price = price;
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
