
public class Ex02_Buho {
	public static void main(String[] args) {
		// 부호 : 양수인지 음수인지를 판단할 수 있는 기호 + , -
		int number = -100;
		
		int result1 = +number;
		int result2 = -number;
		
		System.out.println("(+number) result1 : " +result1);
		System.out.println("(+number) number * 1 = number(-100)");
		System.out.println("(-number) result2 : " +result2);
		
		//많이 쓰는 부호는 '-'
		//-부호는 부호를 반전 시키는 규칙이 있음. ( + 는 아무 규칙 없다 )
		int result3 = number * -1;
		System.out.println(result3);
		
	}
}
