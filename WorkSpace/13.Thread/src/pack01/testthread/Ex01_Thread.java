package pack01.testthread;

import java.awt.Toolkit;

public class Ex01_Thread {
	// 자바 애플리케이션이 실행되는 동안 Thread라는 객체가 동작을 하고있다고 생각하면됨.
	// window로 부터 소리를 제공받아 사용 (Toolkit) : 별로 중요 x 공부 x
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		// for문은 컴퓨터 속도에 따라 차이가 있지만 0.0001초 내 5번 동작
		// Thread.sleep : 동작중인 프로세스를 휴지 시킴(잠깐 딜레이) : 1000
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("ㄴ");
			try {
				// 진행중인 쓰레드(작업)이 슬립을 만났을때 오류가 생길 가능성이 있음 => 강제로 try{}catch{}
				// File (IO)
				Thread.sleep(1000 * 2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
