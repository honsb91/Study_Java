package Main;

import java.util.ArrayList;

public class CookDTO {

	private String cookName, createdDate, createdBy;
	private int cookNum, score;
	private ArrayList<RecipeDTO> recipeList;

	public CookDTO(String cookName, String createdDate, String createdBy, int cookNum, int score,
			ArrayList<RecipeDTO> recipeList) {
		this.cookName = cookName;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.cookNum = cookNum;
		this.score = score;
		this.recipeList = recipeList;
	}

	public String getCookName() {
		return cookName;
	}

	public void setCookName(String cookName) {
		this.cookName = cookName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getCookNum() {
		return cookNum;
	}

	public void setCookNum(int cookNum) {
		this.cookNum = cookNum;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<RecipeDTO> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(ArrayList<RecipeDTO> recipeList) {
		this.recipeList = recipeList;
	}
	
	

}