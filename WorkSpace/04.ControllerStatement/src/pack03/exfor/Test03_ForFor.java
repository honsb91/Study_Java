package pack03.exfor;

public class Test03_ForFor {
	public static void main(String[] args) {
		// 2단부터 9단까지의 결과를 출력하는 프로그램을 for문의 중첩을 이용하여 해결하기
		// for문 중첩을 이용하여 다음과 같은 모양이 나오게한다.
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★

		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
