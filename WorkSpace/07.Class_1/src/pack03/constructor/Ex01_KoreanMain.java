package pack03.constructor;

public class Ex01_KoreanMain {
	public static void main(String[] args) {
		
		Ex01_Korean Korean1 = new Ex01_Korean("123456-7892134" , "철수");
		System.out.println(Korean1.nation);
		
		System.out.println(Korean1.name + Korean1.ssn);
		
		Ex01_Korean Korean2 = new Ex01_Korean("213213-21321321", "맹구");
		
		
	}
}
