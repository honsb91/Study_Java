package pack02.trycatch;

public class Ex03_TryCatchOrder {

	public static void main(String[] args) {
		// 0으로 나눈 경우 예외
		// 문자열을 숫자로 바꿀 때
		// null
		try {
			Double.parseDouble("dasf");
			System.out.println(0/0);
			String str = null;
			System.out.println(str.length());
			
		}catch(NumberFormatException e) {
			System.out.println("문자열이 아닌것을 숫자로 바꿈");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눠서 오류");			
		}catch(NullPointerException e){
			System.out.println("NULL 오류 입니다.");
		} catch (Exception e) { //Exception 모든 오류의 기본 처리가 전부 있는 클래스
			System.out.println("그 외에 오류입니다");
		}finally {
			System.out.println("프로그램의 종료(통신종료)");
		}

	}

}
