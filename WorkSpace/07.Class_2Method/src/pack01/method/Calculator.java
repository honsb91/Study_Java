package pack01.method;

public class Calculator {
	// Calculator 클래스는 계산기 기능을 가진 클래스 입니다.
	// 기능 4가지를 구현해보기
	// 모든 메소드의 호출은 CalculatorMain에서 진행.
	// 기능 1 ) plus <- 두 수를 입력 받아 두 수의 합을 바로 출력하는 메소드 (반환X)
	// 기능 2 ) minus <- 두 수를 입력 받아 두 수의 빼기를 바로 출력하는 메소드 (반환X)
	// 기능 3 ) mul <- 두 수를 입력 받아 곱하기를 메소드 호출부로 반환해주는 메소드 -> 출력은 계산기 메인에서 함.
	// 기능 4 ) div <- 두 수를 입력 받아 나누기를 메소드 호출부로 반환해주는 메소드 -> 출력은 계산기 메인에서 함.
	
	public void plus(int a , int b) {
		System.out.println(a + b);
	}
	
	public void minus(int a , int b) {
		System.out.println(a - b);
	}
	
	public int mul(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public int div(int a, int b) {
		int result = a/b;;
		return result;
	}
	
	
	
}
