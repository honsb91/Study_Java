package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int lotto[] = new int[6];
		Random random = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
				String randomLotto = sc.nextLine();
			}
			System.out.println("로또번호 : " + Arrays.toString(lotto));
		}

	}

}
