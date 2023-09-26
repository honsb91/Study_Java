package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {
		
		int num1 = 10, num2=20;
		System.out.println("num1: " + num1 + "num2: " + num2);
		
		int tempNum = num1;
		num1= num2;
		num2= tempNum;
		System.out.println("num1: " + num1 + "num2: " + num2);
		
		//swap의 개념을 이용하여 오름차순 또는 내림차순으로 바꿔보기
		int temp;
		int[] arr= {3, 5, 7, 9, 1, 2, 4, 10 };
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
