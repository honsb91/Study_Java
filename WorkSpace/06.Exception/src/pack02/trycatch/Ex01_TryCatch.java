package pack02.trycatch;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		String str = "10aa";
		
		// 예외가 발생할 것 같은 코드
		// try블럭 , catch블럭을 이용해서 개발자가 정한 방향으로 프로그램이 정상 작동
		// try{
			// 예외 코드 ?
		//} catch(Exception e) {
			//오류 발생시 실행}
		//}
		try {
			Double.parseDouble(str);
		}catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e.getMessage());
			e.printStackTrace();// <= 원래 나오던 오류코드를 출력함.
		}
		
		System.out.println(str);
	}

}
