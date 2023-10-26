package pack01.testthread;

public class Ex03_BeepMain {

	public static void main(String[] args) throws InterruptedException {
		EX03_BeepTask e3 = new EX03_BeepTask();
		Thread thread = new Thread(e3);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("tt");
			Thread.sleep(500);
		}
		System.out.println("ㅇㅇㅇㅇㅇㅇ");
	}

}
