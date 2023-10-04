package exam.array;

import java.util.Arrays;

public class Ex01_Array {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int endPoint = 90/2;
		for(int i=0; i<numbers.length; i++) {
			endPoint -= numbers[i];
		}
		System.out.println(endPoint);
		

		int[] tempArray = new int[10];
		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i == numbers[j]) {
					tempArray[i] = 1;
				}
			}
		}
		System.out.println(Arrays.toString(tempArray));
		int sum = 0;
		for(int i=0; i<tempArray.length; i++) {
			if(tempArray[i]==0) {
				sum+=i;
				System.out.println("비어있는 숫자 : " + i + " ");
			}
		}
	}

}
