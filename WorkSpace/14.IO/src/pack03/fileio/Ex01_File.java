package pack03.fileio;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
//		String path = Ex01_File.class.getResource("").getPath();
//		System.out.println(path);
		File file = new File("IOFolder");
//		boolean isFile = file.exists(); // 파일 경로 ( 파일 객체 초기화에 사용한 경로) 있는지 확인.
		//mkdir(); <- make directory 실제 파일의 경로를 만들어냄.
		if(file.exists()) {
			System.out.println("해당 경로 또는 파일이 있습니다.");
		}else {
			System.out.println("해당 경로 또는 파일이 없습니다.");
			file.mkdir(); // 파일을 실제로 생성해주는 코드
		}
	}
}
