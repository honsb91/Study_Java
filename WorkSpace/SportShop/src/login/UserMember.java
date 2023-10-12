package login;

import java.util.Scanner;


public class UserMember {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		UserDTO dto = new UserDTO();
		UserDAO dao = new UserDAO();
		
		dto.id = scan.nextLine();
		dto.password = scan.nextLine();
		dto.name = scan.nextLine();
		
		if(dao.login(dto) == 1) {
			System.out.println("화면이동");
		}else {
			System.out.println("다시 입력");
		}
		
		System.out.println(dto.id);
		scan.close();
		
		
	}

}
