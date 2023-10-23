package pack04.database;

public interface IDataAccessObject {
// DAO : 기능 ( 데이터베이스에 접근 조회 , 추가 , 수정 , 삭제 ) = " CRUD " 
// CRUD ( Create , Read , Update, Delete )
	public void select();
	public void insert();
	public void update();
	public void delete();
}
