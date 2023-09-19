package pack01.exif;

public class Ex03_IfElseIfElse {
	public static void main(String[] args) {
		// if ( 조건식A ) {
		// 조건식 A가 true이 때 실행 되며 그 외에 연결 된 else if , else는 실행 X
		// }else if ( 조건식B ) {
		// 조건식 A가 false일 때 조건식 B를 실행하며 , 조건식 B가 true일 때 실행
		//}else  if ( 조건식C ) {....
		
		
		//스코어 점수가 90점 이상이면 A학점 출력
		//스코어 점수가 80점 이상이면 B
		//스코어 점수가 70점 이상이면 C
		//스코어 점수가 60점 이상이면 D
		// 그 외 E를 출력하는 프로그램을 if - else if - else 문으로 만들기
		int score = 59;
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else{
			System.out.println("E");
		}
		
	}
}
