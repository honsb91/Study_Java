package pack03.test;

import java.util.Scanner;

public class HoresGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("2~5까지의 수 입력 : 경기하는 말 개수");
			int inputNum = Integer.parseInt(sc.nextLine());
			if(inputNum >=2 && inputNum <=5) {
				HoresDAO dao = new HoresDAO(inputNum); // 3-> Scanner 이용 2~5 체크
				break;
			}
		}
		sc.close();
	}

}
