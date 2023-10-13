package product_test;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		
		ProductDTO dto = new ProductDTO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================================");
			System.out.println("1 . 상품조회");
			System.out.println("=================================");
			System.out.println(" 번호 입력 : ");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1){
				System.out.println("1. 상품조회");
			}else {
				System.out.println("상품이 없습니다.");
			}
		}
	}
}
