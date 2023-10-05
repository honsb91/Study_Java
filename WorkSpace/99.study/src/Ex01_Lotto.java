import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_Lotto {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int[] userNums = new int[6];
		int[] comNums = new int[6];

		for (int i = 0; i < userNums.length; i++) {
			userNums[i] = Integer.parseInt(sc.nextLine());
			if (userNums[i] < 1 || userNums[i] > 45) { // 등호를 어떻게 바꿀까? 논리식
				System.out.println("숫자 다시 입력하세요.");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (userNums[j] == userNums[i]) {
					System.out.println("중복!!");
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < userNums.length; i++) {
			comNums[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (comNums[j] == comNums[i]) {
					i--;
					break;
				}

			}
		}
		System.out.println(Arrays.toString(userNums));
		System.out.println(Arrays.toString(comNums));

		System.out.println("프로그램 끝 부분");

	}

}