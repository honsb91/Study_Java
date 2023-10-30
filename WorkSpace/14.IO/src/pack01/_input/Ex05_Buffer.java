package pack01._input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException{
		// 여러 글자 출력 BufferReader (권장)
		// BufferReader vs InputStreamReader
		// 실제 처리를 Ins (Scanner)는 한글자씩 (byte,int)
		// 입력한 글자수만큼 접근이 이루어짐 ▶ 메모리 소모 ↑ , 속도저하 , 버그 등등
		// 이러한 비효율성을 개선해서 여러글자를 입력하더라도 , Buffer 라는 공간에 입력을 해놓고
		// 한번에 출력할 수 있는 처리를 지원 -> BufferReader
		// BufferReader 1024Byte를 한번에 처리가 가능하다.
		// BufferReader > InputStreamReadr > InputStream(노드 스트림)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		System.out.println(data);
		br.close();
	}
}
