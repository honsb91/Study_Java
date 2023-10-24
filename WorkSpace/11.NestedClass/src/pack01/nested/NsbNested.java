package pack01.nested;

public class NsbNested {
	public class Test{
		public class Test_Sub{
			public int test = 10;
			public void method() {
				System.out.println("메인에서 test 변수랑 method 호출해보기");
			}
		}
	}
	
	public static class Test1{
		static int test1 = 20;
		
	}
	
}
