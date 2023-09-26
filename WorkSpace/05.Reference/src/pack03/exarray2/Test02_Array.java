package pack03.exarray2;

public class Test02_Array {

	public static void main(String[] args) {
		//강아지 , 진돗개 , 불독 , 시츄의 문자열을 요소로 가지는 배열을 만들고 출력
		//페르시안 , 고양이 , 노르웨이 의 문자열을 요소로 가지는 배열을 만들고 출력
		
			String[] dogs = {"강아지","진돗개","불독","시츄"};
			String[] cats = {"페르시안","고양이","노르웨이"};
			for(int i=0; i<dogs.length; i++) {
				System.out.print(dogs[i] + " ");
			}
			
			String[][] animals = {dogs, cats};
			String[][] animalArr = new String[2][];
			animalArr[0]=dogs;
			animalArr[1]=cats;
			for(int i=0; i<animals.length; i++) {
				for(int j=0; j<animals[i].length; j++) {
					System.out.println(animals[i][j] + " ");
				}
				System.out.println();
			}
			

	}

}
