package pack02.member;

public class MemberMain {
	public static void main(String[] args) {
		System.out.println(Member.sField);
		
		Member member = new Member();
		
		member.iMethod();
		member.iMethod(0);
		member.iMethod("A");
		member.iMethod("A" , 1);
		
	}
}
