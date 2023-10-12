package login;

public class UserDTO {

	// 회원 아이디
	public String id;
	// 회원 비밀번호
	public String password;
	// 회원 이름
	public String name;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
