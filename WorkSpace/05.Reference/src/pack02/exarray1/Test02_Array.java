package pack02.exarray1;

public class Test02_Array {
	public static void main(String[] args) {
		// 구구단의 2단 결과를 모두 저장할 수 있는 배열을 자유롭게 만들고 출력
			//* 2 ~ 18 모두 저장되어야함
		// 배열을 이용하여 , 배열에 다음의 값들이 for문을 이용해서 저장 되게 하고 출력하기.
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		
		int[] intArr = new int[9];
		
		
		for(int i=0 ; i<intArr.length ; i++) {
			intArr[i] = (i+1)*2;
			System.out.println("2 X "+ i +" = " + 2*i);
		}
		
		String[] starArr = new String[5];
		for(int i=0; i<starArr.length; i++) {
			if(i==0) {
				starArr[i] = "★";
			}else {
				starArr[i] = starArr[i-1] + "★";
			}
		}
		System.out.println("");
	}
}
