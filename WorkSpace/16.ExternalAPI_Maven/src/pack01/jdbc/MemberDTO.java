package pack01.jdbc;

public class MemberDTO {
	// ctrl + shift + y : 소문자 변환
	// ctrl + shift + x : 대문자 변환
	
	private String id, pw; // 데이터 베이스 컬럼 복사

	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
}
