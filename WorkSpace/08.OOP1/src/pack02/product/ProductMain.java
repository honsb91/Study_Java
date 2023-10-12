package pack02.product;

public class ProductMain {
	public static void main(String[] args) {

		ProductDAO dao = new ProductDAO();
//		ProductDTO[] dtos = dao.selectRead();
//
//		dao.userInputNum();
//		
//		//dao.display(dtos[1]);
		
		dao.find();
	}
}