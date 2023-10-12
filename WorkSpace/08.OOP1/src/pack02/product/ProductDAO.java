package pack02.product;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getNum() + ". " + dto.getName() + " " + dto.getPrice() + "원");
	}

	public void displays(ProductDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}

	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[5];

		dtos[0] = new ProductDTO(1, 15000, "스카프");
		dtos[1] = new ProductDTO(2, 1000, "마늘");
		dtos[2] = new ProductDTO(3, 66000, "커피");
		dtos[3] = new ProductDTO(4, 6000, "피");
		dtos[4] = new ProductDTO(5, 6600, "커");
		return dtos;
	}

	public ProductDTO[] delete(ProductDTO[] dtos) {
		int choice = userInputNum();
		dtos[choice - 1] = null;
		ProductDTO[] tempDtos = new ProductDTO[dtos.length - 1];
		int idx = 0;
		for (ProductDTO dto : dtos) {
			if (dto != null) {
				tempDtos[idx] = dto;
				idx++;
			}
		}
		return tempDtos;
	}

	public int userInputNum() {
		while (true) {
			System.out.println("삭제 상품 번호 입력");
			Scanner scan = new Scanner(System.in);
			try {
				int inputNum = Integer.parseInt(scan.nextLine());
				return inputNum;
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
	}
	
	public void find() {
		String str = new String( "s: T :r객체" );
		// 문자열의 길이 : 몇 글자 이상 입력을 받아야할때.
		System.out.println(str.length());
		// 문자열의 시작값 startWith , 
		System.out.println(str.startsWith("s"));
		System.out.println(str.startsWith("a"));
		// 내가 찾는 글자가 몇번째에 있는지 (index) 체크
		System.out.println(str.indexOf('r'));
		
		// 원하는 문자를 바꾸기. s:t:r -> s t r (치환) replace
		System.out.println(str.replace(':', ' '));
		// 문자열을 특정 구분자로 잘라서 배열형태로 나누어 담음
		String[] strs = str.split(":");
		System.out.println(Arrays.toString(strs));
		// 대문자 변환 , 소문자 변환 
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// Trim() 공백을 제거 . 가운데 공백은 제거 안됨
		System.out.println(str.trim());
		// subString ( 문자열 자르기 ) : indexOf 
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,str.indexOf('r')));
		// 문자열에 특정값 포함여부를 boolean 리턴해줌.
		System.out.println(str.contains("객체"));
		System.out.println(str.contains("aa"));
		
		
	}
}