package login;


public class UserDAO {

	public boolean loginCheck(UserDTO dto) {
		dto.idPw.put("user", "user1");

		if (dto.idPw.containsKey(dto.id) && dto.idPw.get(dto.id).equals(dto.pw)) {
			System.out.println("로그인 성공");
			return true;
		}
		System.out.println("아이디 또는 비밀번호 확인");
		return false;
	}
}
