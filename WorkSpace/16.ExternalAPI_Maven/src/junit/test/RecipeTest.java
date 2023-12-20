package junit.test;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Main.DAO;
import Main.RecipeDTO;

class RecipeTest {
	
	@DisplayName("레시피테이블 조회")
	@Test
	void printRecipe() {
		DAO dao = new DAO();
		ArrayList<RecipeDTO> list =dao.printRecipe();
		assertTrue(list.size() !=0); // 조회 후 list의 개수
	}
	@Test
	void modifyRecipe() {
		DAO dao = new DAO();
	}
	
	@Test
	void deleteRecipe() {
		
	}

}
