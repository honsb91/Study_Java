package pack02.threadattr;

import java.util.Scanner;

public class NasbThreadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		NsbThread thread = new NsbThread(5);
		thread.start();
		
	}
}
