package pack03.exfor;

public class Test01_For {
	public static void main(String[] args) {
		// 지역에 대한 이해도
		// 1 ~ 9 까지의 수중 홀수인 수의 합 구하기
		// 1 ~ 9 까지의 수중 짝수인 수의 합 구하기
		// 1 ~ 9 까지의 수의 총합

		int sum = 0; // 왜 밖에다가 변수를 만들었는가?? 
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1) {
				sum += i;
			} else {
				sum2 += i;
			}
			sum3 = sum3 + i;

		}
		System.out.println("홀수의 합(1~9) : " + sum);
		System.out.println("짝수의 합(2~8) : " + sum2);
		System.out.println(sum3);
	}

}
