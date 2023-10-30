package pack01._input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_InputKORMulti {
	public static void main(String[] args) throws IOException {
		Ex04_InputKORMulti ii = new Ex04_InputKORMulti();
		String data=ii.nsbScanner();
		System.out.println(data);
		
		}

		public String nsbScanner() throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			int iData;
			String data= "";
			while((iData = isr.read()) != -1) {
				if(iData== 13 || iData == 10) {
					break;
				}
				data += (char)iData+"";
			}
			
			return data;
//		InputStreamReader isr = new InputStreamReader(null) 
//		while((name = is.read()) != -1) {
//			System.out.println();
//		}
		
		
		
	
	
	// 나의 이니셜 Scanner 메소드 구현
	// 해당 메소드는 String을 return 하는 메소드입니다.
	// InputStreamRader를 이용하여 EnterKey 입력을 제외한 문자열을 return 
	// CR&LF return x
	
	// 테스트
	// 스캐너 <- 콘솔에 치고 엔터
	// 해당하는 값을 문자열에 저장.("스캐너")
	// 출력! - 끝
	
}
}
