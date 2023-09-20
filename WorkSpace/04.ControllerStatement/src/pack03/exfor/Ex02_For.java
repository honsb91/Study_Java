package pack03.exfor;

public class Ex02_For {
	public static void main(String[] args) {
		// for문을 안보고 1~20 까지 반복하는 for문 만들기

		for (int i = 1; i <= 20; i++) {
			// for문 내부에 조건문을 이용하여 홀수인지 짝수인지를 숫자 뒤에 붙여서 출력해보기.
			if (i % 2 == 1) {
				System.out.println(i + "홀수");
			}else {
				System.out.println(i + " 짝수");
			}

			switch (i % 2) {
			case 1:
				System.out.println(i + "홀수");
				break;
			}
			switch (1 % 2) { //default로 처리 가능 // else문
			case 0:
				System.out.println(i + "짝수");
				break;

			}
		}
	}
}
