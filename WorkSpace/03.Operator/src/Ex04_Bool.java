
public class Ex04_Bool {
	public static void main(String[] args) {
		// true 와 false 만 저장이 가능한 변수 타입 : boolean
		// boolean 변수 두개를 만들고 각각 true 와 false 값을 할당하고 초기화 해보기.
		
		boolean booleanV1 = true, booleanV2 = false;
		System.out.println(booleanV1);
		System.out.println(booleanV2);
		
		//※ true(1) , false(0) ※
		//AND 연산자
		//논리곱 : N개의 조건이 있다면 모든 조건이 true일 때만 true
		// 1 * 1 * 1 * ... 0 = false;
		
		//OR 연산자
		//논리합 : N개의 조건 중 하나라도 true 가 있다면 true
		// 1 + 1 + 1 ... + 0 = true;
		
		// ! <= NOT
		// 어떤 true , false(bool)앞에 붙이면 해당 결과를 반전시킴.
		System.out.println(!booleanV1);
		System.out.println(!booleanV2);
	}
}
