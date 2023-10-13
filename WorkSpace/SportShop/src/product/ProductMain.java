package product;

public class ProductMain {
	public static void main(String[] args) {
		
		ProductDTO[] sport = new ProductDTO[3];
		
		
		sport[0] = new ProductDTO("it","축구공", 50000);
		sport[1] = new ProductDTO("미술","배구공", 30000);
		sport[2] = new ProductDTO("음","농구공", 40000);
		
		System.out.println(sport[0]);
		System.out.println(sport[1]);
		System.out.println(sport[2]);
		System.out.println("=========================================================================");
		
		for(int i = 0; i<sport.length; i++) {
			System.out.println(sport[i].getCategory() + "\t");
			System.out.print(sport[i].getName() + "\t");
			System.out.printf("%,d원\t", sport[i].getPrice());
		}
		
		for(ProductDTO dto : sport) {
			System.out.printf("%s\t",dto.getCategory());
			System.out.printf("%s\t",dto.getName());
			System.out.printf("%d\t",dto.getPrice());
		}
	}
}
