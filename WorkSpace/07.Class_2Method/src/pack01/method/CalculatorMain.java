package pack01.method;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.plus(5, 4);
		cal.minus(5, 4);
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.div(5, 2));
	}
}
