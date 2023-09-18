package pack01.exif;

public class Ex01_If {
	public static void main(String[] args) {

		// main 메소드(함수 , 기능)
		// javaProject에서 프로그램의 시작점을 구분하기위한 메소드 = > main
		// 블럭킹 : { }
		// 어떤 문장이나 메소드 , 클래스 등등의 구역 ( 지역 ) 을 의미함.
		// 지역 블럭킹이 열리면 ' { ' 메모리에 올라가고
		// 지역 블렁킹 끝 ' } ' 메모리에서 내림을 반복한다. == > 자바 프로그램
		// 클래스 지역을 제외하고 선언되거나 초기화 되는 모든 변수는 우리가
		// ' 지역 변수 ' 라고 하며 해당 지역에서만 사용이 가능하다.
		// if ( 조건식 ) {
		// if문 지역 : 조건식이 true 일때만 해당 지역은 코드 실행이 된다.

		int score = 89;
		if (score <= 90) { // score가 90점 이상이라면
			System.out.println("90점 이상이여서 장학금 받음");

			if (score == 100) {
				System.out.println("전교 1등입니다.");
			}
		}

	}// main end
}// class end
