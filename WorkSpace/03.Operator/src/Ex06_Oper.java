
public class Ex06_Oper {
	public static void main(String[] args) {
		// = ( 대입 , 값 할당) , 대입연산자 : 대입 연산자 기준으로 우측에 있는 값을 좌측에 있는 변수에 할당
		// 비교 연산자 ( == , < , > , <== , >== )
		// 다르다 : !=
		
		// AND(&&) , OR(||)
		// 조건식 뒤에 AND , OR 연산자가 붙으면 조건식이 연결된다.
		// 비교 연산 후에는 반드시 bool형 데이터 true , false 가 나온다.
		
		boolean booleanV1 = 1 < 3 && 1<4;  //t
		// 1*1 = 1 (true)
		boolean booleanV2 = 1 > 3 || 1==1;  //f
		// 0 + 1 = 1 (true)
		boolean booleanV3 = 1 <= 3; //t
		boolean booleanV4 = 1 >= 3; //f
		boolean booleanV5 = 1 == 3; //f
		boolean booleanV6 = 1 != 3; //t

		
	}
}
