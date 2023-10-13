package member;

public class MemberDAO {
	
	private String member_id; // 회원 아이디
	private String member_name; // 회원 이름
	private int member_password; // 회원 비밀번호
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public int getMember_password() {
		return member_password;
	}
	public void setMember_password(int member_password) {
		this.member_password = member_password;
	}
	
	
}
