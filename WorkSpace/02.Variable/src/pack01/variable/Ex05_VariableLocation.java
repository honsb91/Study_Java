package pack01.variable;

public class Ex05_VariableLocation {
	public static void main(String[] args) {
		// 블럭킹은 자바프로그램의 시작과 끝을 의미도 하지만 지역도 의미를 함.
		// 자바에서의 지역은 매우 중요한 개념.
		// 클래스의 지역을 제외하고, 만들어진 모든 변수들은 지역 변수라고 한다.
		// local variable ==> lv
		
		int num = 10; // <= 지역변수
		
		{ // 메모리에서 올림.
			
		} // 메모리에서 내림.
		
		// 자바에서의 지역이란 코드의 시작과 끝을 의미합니다
		// 클래스 영역 이외의 영역에 위치되는 변수
		// 지역이 나뉘어진 이유 //초기화를 해주지 않으면 변수가 중복되어 오류가 발생할수 있기 때문에.
	}
}
