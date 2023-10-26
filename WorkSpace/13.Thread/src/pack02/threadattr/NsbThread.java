package pack02.threadattr;

import java.util.Scanner;

// 일반 클래스 : start 기능 x
// 일반 클래스 : run이 override(재정의) x
// Runnable 인터페이스 상속 or Runnable을 상속받은 Thread 객체를 상속
public class NsbThread extends Thread{
	private int number;
	
			
		public NsbThread(int number) {
		this.number = number;
	}


			@Override
			public void run() {
				
				for(int i=2; i<=9; i++) {
					for(int j=1; j<=9; j++) {
						System.out.println(i + "*" + j);
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
}
