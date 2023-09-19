package pack01.exif;

public class Ex04_IfAndOr {
	public static void main(String[] args) {
		// 조건식 : 반드시 true , false를 반환 받는 식.
		// boolean에 담을 수 있는 값.(==조건식)
//		int score = 85;
//		boolean isCheckUp90 = score >= 90;
//		boolean isCheckUp80 = score >= 80;
//		if (isCheckUp90) {
//			System.out.println("A");
//		} else if (isCheckUp80) {
//			System.out.println("B");
//		} else {
//			System.out.println("A X");
//		}

		int number = 9;
		// 홀수 인지 , 짝수 인지 판단 + 조건식의 연결을 통해 , 3의 배수인지 여부도 같이 출력
		// number 9 : 홀수 이며 , 3의 배수임.
		// number 10 : 짝수 이며 , 3의 배수 아님.

		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("짝수 3배수");
		} else if (number % 2 == 0 && number % 3 != 0) {
			System.out.println("짝수 3배수X");
		} else if (number % 2 == 1 && number % 3 == 0) {
			System.out.println("홀수 3배수");
		} else {
			System.out.println("홀수 3배수X");
		}

	}
}
