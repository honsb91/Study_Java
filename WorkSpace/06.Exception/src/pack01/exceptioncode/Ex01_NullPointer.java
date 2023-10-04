package pack01.exceptioncode;

public class Ex01_NullPointer {
	public static void main(String[] args) {
		String[] strs = null;
		//NullPointerException 은 빈번하게 발생하는 오류코드 -> 회피방법이 간단함.
		//객체를 사용할 때 null이 아닌 상태에서만 쓰게끔 만들면 된다.
		//제어문으르 활용.
		if(strs != null) {
			System.out.println(strs[0]);
		}
		System.out.println("여기");
	}
}
