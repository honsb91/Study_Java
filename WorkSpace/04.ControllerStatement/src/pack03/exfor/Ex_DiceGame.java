package pack03.exfor;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key를 누르면 PC가 주사위를 굴립니다.");
		sc.nextLine();
		
		
		int pcNum = random.nextInt(6)+1;
		int userNum = random.nextInt(6)+1;
		if(pcNum > userNum) {
			System.out.println(pcNum + " > " + userNum + " PC승!");
		}else if(pcNum < userNum) {
			System.out.println(pcNum + " < " + userNum + " 유저승!");
		}else {
			System.out.println(pcNum + " = " + userNum + " 무승부");
		}
	}
}
