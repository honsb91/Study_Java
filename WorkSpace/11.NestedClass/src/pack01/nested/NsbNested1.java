package pack01.nested;

public class NsbNested1 {
	
	private static class TestA{
		int field = 10;
		public void method1() {
			System.out.println("정답 포인트");
		}
	}
	
	public static class TestC{
		public class TestZ{
			public class TestB{
				public TestA rtnMethod() {
					return new TestA();
				}
			}
		}
	}

}
