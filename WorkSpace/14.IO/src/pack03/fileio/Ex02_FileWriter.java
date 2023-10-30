package pack03.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02_FileWriter {
	public static void main(String[] args) throws IOException {
		// 텍스트 파일을 쓰는 경우.
		// DB가 끊겨서 오류가 날 경우. 업로드 해야하는 데이터를 텍스트나 로그로 남겨둠. 
		// Java 변수 => 텍스트 파일로 만들어냄.( Out , flush )
		File directory = new File("Ex02_FileWriter"); 
		if(!directory.isFile()) {
			directory.createNewFile();
		}
		Writer writer = new FileWriter("Ex02_FileWriter\\file.txt");
		for(int i = 2; i<10; i++) {
			for(int j=1; j<10; j++) {
				writer.write(i + " * " + j + " = " + (i*j));
			}
		}
		writer.flush();
	}
}
