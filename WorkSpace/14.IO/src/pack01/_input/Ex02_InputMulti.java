package pack01._input;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputMulti {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		// ABC를 콘솔에 입력함 . ABC 전체가 출력
//		int a = is.read();
//		int b = is.read();
//		int c = is.read();
		
//		System.out.println((char)is.read());
//		System.out.println((char)is.read());
//		System.out.println((char)is.read());
		
		int data; // is.read(); <- 데이터를 담기 위한 변수 0~255
		while((data = is.read()) != -1) {
			System.out.println("입력하신 문자int : " + data );
			System.out.println("char " + (char) data);
		}
		System.out.println("종료");
	}
}
