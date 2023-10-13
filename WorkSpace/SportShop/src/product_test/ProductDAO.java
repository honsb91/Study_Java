package product_test;

public class ProductDAO {
	
	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[3];
		dtos[0] = new ProductDTO(1, 30000, "축구공");
		dtos[1] = new ProductDTO(2, 10000, "농구공");
		dtos[2] = new ProductDTO(3, 50000, "배구공");
		
		return dtos;		
	}
}
