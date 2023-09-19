package pack02.exswitch;

public class Test_Switch {
	public static void main(String[] args) {
		// 스위치문은 값을 가지고만 어떤 조건 분기가 가능하다. break를 넣어줘야지만. 끊김.
		
		//100~90 : A학점
		//89~80 : B학점
		//79~70 : C학점
		//69~60 : D학점
		
		int score = 9;
		
		switch(score){
		case 100 : case 90:
			System.out.println("A");
			break;
		case 89 : case 80:
			System.out.println("B");
			break;
		case 79 : case 70:
			System.out.println("C");
			break;
		case 69 : case 60:
			System.out.println("D");
			break;
		default : // if의 else의 역활을 한
			System.out.println("E학점");
			break;
		}
	}
}
