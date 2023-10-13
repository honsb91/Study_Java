package product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ProductDTO[] sport = new ProductDTO[3];
		
		
		sport[0] = new ProductDTO("공종류","축구공", 50000);
		sport[1] = new ProductDTO("","배구공", 30000);
		sport[2] = new ProductDTO("","농구공", 40000);
		
		
		for(int i = 0; i<sport.length; i++) {
			System.out.println(sport[i].getCategory() + "\t");
			System.out.print(sport[i].getName() + "\t");
			System.out.printf("%,d원\t", sport[i].getPrice());
		}
		
		
	}
}
