package pack01.nested;

import pack01.nested.NsbNested.Test;
import pack01.nested.NsbNested.Test.Test_Sub;

public class NsbMain {
	public static void main(String[] args) {
		
	 NsbNested nsb = new NsbNested();
	 Test tt = nsb.new Test();
	 Test_Sub tt1 = tt.new Test_Sub();
	 
	 
	 
	 System.out.println(tt1.test);
	 tt1.method();
	 
		
	}
}
