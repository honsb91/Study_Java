package pack01.exif;

public class Test02_Ifelse {
	public static void main(String[] args) {
		
		//else : 단독으로는 쓸수없음.
		int number = 9;
		if(number%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//해당 수가 3의 배수인지 , 아닌지를 if-else문 풀어보기
		if(number%3==0) {
			System.out.println("3의배수 맞음");
		}else {
			System.out.println("3의 배수가 아님");
		}
	}
}
