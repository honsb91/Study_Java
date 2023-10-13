package product;

public class ProductDTO {
	
	private String category; // 카테고리.
    private String name; // 이름.
    private int price; // 가격.
    
    public ProductDTO() {} // 인자가 없는 기본 생성자.
    
    public ProductDTO(String category, String name, int price) {
    	
    	this.category = category;
    	this.name = name;
    	this.price = price;
    }
    

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
    
    
    
    
    
    
    
    
    
    
}
