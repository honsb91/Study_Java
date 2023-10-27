package hello;


// 회원 저장소
public interface MemberRepository {

	void save(Member member); // 회원저장
	
	Member findById(Long memberId); // 아이디 찾기
}
