package pack02.exarray1;

public class Test01_Array {
	public static void main(String[] args) {
		// int형 데이터타입을 묶어놓은 배열 intArray를 선언
		// intArray를 크기 10을 주고 초기화한다.
		// for문을 이용해서 전체 배열에 값을 할당한다.
		// for문을 이용해서 전체 배열에 값을 출력한다.
		// for문을 이용해서 전체 배열의 평균값을 출력한다.
		
		int[] intArray;
		intArray = new int[10];
		
		System.out.println("변수의 크기 : " + intArray.length);
		for(int i =0; i<intArray.length; i++) {
			intArray[i]= i;
			System.out.println(intArray[i]);
		}
		
	}
}
