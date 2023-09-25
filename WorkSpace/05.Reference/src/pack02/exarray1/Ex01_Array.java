package pack02.exarray1;

public class Ex01_Array {

	public static void main(String[] args) {
		//학생 점수 scoreN에 각각 1부터 5까지의 값을 할당하고 그 결과를 각각 출력 , 평균 출력
//		int score1 = 1;
//		int score2 = 2;
//		int score3 = 3;
//		int score4 = 4;
//		int score5 = 5;
		
		//배열 : 자료형 변수를 생성하고 사용할 때 주로 사용하며
		// 1) : "동일한" 자료형(데이터타입)을 "정해진 수"만큼 저장하고 사용하는 3)"객체"
		// 4) : 각각의 데이터는 "index라는 주소"로 구분한다. 5) 중간에 크기 변경이 불가능하다.
		//해당 데이터를 알아볼수있는 단어 뒤에 ( s붙이기 , Arr붙이기 )
		// int[] intArr; <= 변수의 선언
		// intArr = new int[4]; <= 초기화식
		int[] intArr;
		//배열에 데이터타입이 주어지면 한칸은 해당하는 타입의 변수와 같다.
		//배열의 크기가 n이 주어졌을때 배열의 인덱스는 0 ~ n-1 까지를 의미함.
		intArr = new int[4];//stack[intArr , memoryNum] == > heap memoryNum: 0[]1[]2[]3[]
		System.out.println(intArr); //[I@3d012ddd <= 힙의 어드레스주소 [우리한테 의미없는 값]
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		// 출력 ( 배열의 값 출력 해보기 )"배열의 크기 : " 
		System.out.println("배열의 크기 : " + intArr.length);
		for(int i =0; i<intArr.length ; i++) {
			System.out.println(intArr[i]);
		}
		
		
	}

}
