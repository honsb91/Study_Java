
public class Ex07_Oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 4장에서 배우는 조건문을 많이 이용한다. 많이 사용하지는 않는다.
		// 조건식을 연산하여 true 가 나올 때 , falser 가 나올 때의 결과를 어떤 값으로 받고싶음.
		// ex) 1과 2를 비교 후 참이 나오면 "참입니다", 거짓(false) "참이 아닙니다!"
		// 조건식 (비교연산자) ? "참" : "거짓"
		
		int age = 11;
		String result = age == 10 ? "참" : "거짓";
		System.out.println(result);
	}
}
