package pack03.test;

import java.util.Random;

// 스캐너를 통해서 입력받은 파일을 다운로드
// 1.이름 2.진행도
public class FileDownTask extends Thread{
	private String FileName;
	private int percent; // <= 선언해주면 기본값이 0
	
	public FileDownTask(String fileName) {
		if(fileName==null || fileName.trim().length() ==0) {
			fileName = "이름 모름";
		}
		this.FileName = fileName;
	}
	
	
	// 외부에서 Thread가 start가 되면 해야할 작업
	@Override
	public void run() {
		while(percent <= 100) {
			percent = percent + new Random().nextInt(10)+5;
			if(percent >100) {
				percent = 100;
				System.out.println(FileName + "다운완료");
				break;
			}
			
			System.out.println(FileName + "파일 다운로드중.."+ percent  + "%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
}
