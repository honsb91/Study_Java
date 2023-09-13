package pack02.variabletype;

public class Ex05_Escape {
	public static void main(String[] args) {
		//Escape 문자 왜 쓸까?
		// 문자열 내부에 더블 코테이션을 콘솔에 출력하고 싶음. "
		// 출력을 할 수 없는 문자나 명령어를 통해서 문자열 정리 등의 기능이 가능한것.
		
		String str_v="\"자바\"를 좋아합니다.";
		System.out.println(str_v);
		
		// tab
		System.out.println("번호\t이름\t직업 혈액형");
		
		// ln : line new ( 줄바꿈)
		System.out.println("d:\\folder\\..");
		System.out.print("프린트?\n");
		System.out.print("프린트가 뭘까? ln은 뭐고");
	}
}
