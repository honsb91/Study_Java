package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO_Old {
	// 통신 전송 결과 -> db연결
	// ResultSet -> '표' 라고 생각하면됨 
	private Connection conn;
	
	public boolean isConnection () {
		//url , user , password -> Properties 파일 ( 접속정보가 파일로 저장되어있는것) Stream으로 파일읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
				return true; // true 일때만 동작하게
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void selectMember() {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" SELECT * FROM MEMBER ");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertMember(String id , String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT INTO MEMBER VALUES ( ? , ? ) ");
				ps.setString(1, id);
				ps.setString(2, pw);
				int result = ps.executeUpdate(); //<- insert , update , delete        ( ? / ? 물음표 갯수만큼 값이 들어감 )		
				System.out.println(conn.getAutoCommit());
				//conn.commit();// ※ 확정되지 않은 작업이 있는 테이블 조회 시 연결 실패 뜸. LOCK ※ 
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateMember(String id , String pw) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("UPDATE MEMBER " + "SET PW = ? "	+ " WHERE ID = ? ");
				ps.setString(1, pw);
				ps.setString(2, id);
				
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

	
