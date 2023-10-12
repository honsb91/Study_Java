package pack01.login;

// DAO : 기능 (메소드) 를 모아놓음.( <- DTO 를 활용해서 CRUD => Create , Read , Update , Delete)
// (Data Access Object)
// 대부분의 DAO 는 따로 field 를 가지고 있지 않음. 

public class MemberDAO {
	// 1. login <- MemberDTO : 내부에 있는 ( 데이터베이스 기준 ) 데이터 포맷을 지정할 수 있음.
	
	public int login(MemberDTO dto) {
		// == : 스택 메모리의 값을 비교
		if (dto.id.equals("admin")&& dto.pw.equals("admin1234")) {
			System.out.println("로그인 되었습니다.");
			return 1;
		}else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요");
		}
		return 0;
	}
}
