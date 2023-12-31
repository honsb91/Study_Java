package pack01.exstring;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		// String <- 일반변수와 다름 . 대문자로 시작함 (Class , => 우리가 계속해서 만들고 있는것)
		// 참조형 데이터 타입 ( '열거' , 클래스 , 'String' , 인터페이스 , '배열' )
		// stack메모리에 값을 바로 담는 경우 ( 기본형 데이터 타입 ) 
		// heap메모리에 데이터를 담고 stack메모리에 heap메모리의 주소부를 저장하는 경우 ( 참조형 데이터  타입 )
		// == <= 비교연산자는 stack 메모리의 값을 비교
		// stack : int num1=10 , num2 = 10 : num1[10], num2[20] : 값 비교를 하기때문에 정확한 비교 결과를 얻을수 있음. 10==10.
		// stack : String str1="A", str2="B" : str1[100],str2[200] : 번지수 비교를 하기때문에 정확한 비교 결과 X.
		int numStack = 10;
		Scanner sc = new Scanner(System.in);
		String str1 = "nsb";
		String str2 = "nsb"; //stack과 heap에 새로운 메모리 번지수를 만들고 값을 저장함.
		String str3 = sc.nextLine();
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		if(str1 == str2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		System.out.println("==는 stack메모리 참조번지수를 비교한다.");
	}
}
