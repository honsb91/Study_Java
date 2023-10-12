package login;

import java.util.Scanner;

public class UserMember {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();

		dto.id = scan.nextLine();
		dto.pw = scan.nextLine();

		if (dao.loginCheck(dto)) {
			System.out.println("메인 화면 이동");
		} else {
			System.out.println("로그인 페이지 이동");
		}
		scan.close();

	}
}