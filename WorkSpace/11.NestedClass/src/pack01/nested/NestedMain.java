package pack01.nested;

import pack01.nested.Nested.NesInner;
import pack01.nested.Nested.NesInner2;

public class NestedMain {
	public static void main(String[] args) {
		// static 은 항상 메모리에 먼저 올라가는 성질이 있음 -> 바로사용.
		Nested nes = new Nested();
		
		
		nes.field = 10;
		Nested.field2 = 20;
		
		nes.method();
		Nested.method2();
		

		NesInner ns = nes.new NesInner();
		ns.iField = "sss";
		ns.iMethod();
		
		System.out.println(NesInner2.sField2);
		NesInner2 nes2 = new NesInner2();
		nes2.iField = "sss";
		nes2.iMethod();
		
		
		
		
		
				
	}
}
