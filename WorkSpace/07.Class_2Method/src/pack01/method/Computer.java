package pack01.method;

public class Computer {
	
	boolean isPower; // 기본 : false
	
	public void plus(int num1 , int num2) {
		if(isPower) {
			System.out.println(num1 + num2);
		}else {
			System.out.println("컴퓨터 전원을 켜주세요");
		}
	}

}
