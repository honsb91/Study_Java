package pack02.map;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		// key, value 
		// HashMap<Key extends Object , Value extends Object>
		// key : 데이터를 식별하기 위한 식별자 , value : 데이터
		// HashMap은 데이터를 key로 관리함 (index)
		// key 값이 중복되면 데이터 입력 x  ex)주민등록번호 => value : 이름 , 나이 등등
		// put 데이터 넣기
		// HashMap = 키값 중복 방지를 하게 해줌.
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "ㅎㅎㅎ");
		map.put(1, "ㄷㄷㄷ");
		map.put(2, "ㅅㅅㅅ");
		map.remove(2);
		System.out.println(map.get(1));
		System.out.println(map.size());
	}
}
