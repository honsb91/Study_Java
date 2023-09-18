package exam.operator;

public class Ex01 {
	public static void main(String[] args) {
		
		
		int num1=2 , num2=4;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 마이너스로 반전 시키고 출력하기. 출력 후에는 다시 양수 2로 반전 시키기.
		num1 = -num1;
		num2 = num2 * -1;// 가독성 좋음
		
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		// 증감식을 이용하여 1증가 시키고 num2는 증감식을 이용하여 1마이너스 시키기.
		
		System.out.println(++num1);
		System.out.println(--num2);
		
		// 연산자 3가지를 이용하여 두 변수를 비교하고 결과를 출력하기.
		// ==(같다) , !=(다르다), < (초과) , > (미만) , <= (이상) , >= (이하)
		System.out.println("num1==num2" + (num1==num2) );
		System.out.println("num1!==num2" + (num1!=num2) );
		System.out.println("num1<num2" + (num1<num2) );
		
		//연산자 1개를 사용하는데 AND또는 OR연산자를 이용하여 비교 연산자 1개를 더 연결 시키고 결과출력
		System.out.println("num1==num2 && num1!=num2 " + (num1==num2 && num1!=num2));
		
		//복합 대입연산자 또는 변수의 현재값에 1을 더하기 (num1,num2 둘다 적용)
		num1 = num1 + 1; // 변수에 1 더하기
		num2+=1; // 복합 대입연산자
		
		//삼항 연산자 하나를 이용하여 비교하고 그 결과를 String형태로 받아서 결과 출력
		String resultStr = (num1==num2) ? " 같다 " : (num1>num2) ? "num1큼" : "num2큼";
		System.out.println(resultStr);
		
		
		int score = 85;
		char grade = ( score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		
		
	}

}
