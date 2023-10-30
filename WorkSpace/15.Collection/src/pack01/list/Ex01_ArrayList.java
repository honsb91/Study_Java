package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		// String 데이터 5건을 저장할 수 있는 배열을 만들고 각각 A~E 문자 할당하고 출력하기
		
		String[] str = new String[5];
		String[] arr = {"A","B","C","D","E"};
		
		str[0] = "A";
		str[1] = "B";
		str[2] = "C";
		str[3] = "D";
		str[4] = "E";
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i] + " : " + arr[i]);
		}
		
		String[] tempArr = new String[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			tempArr[i] = arr[i];
		}
		tempArr[tempArr.length-1] = "F";
		System.out.println(Arrays.toString(tempArr));
		// 배열은 사이즈를 미리 지정 후 변경이 불가능 -> 데이터 추가 또는 삭제 시 불편한 점이 많음.
		// List <- Interface 
		// List<E> E <= Element(요소) extends Object ( 객체 형태로 초기화 가능) /// 클래스 타입만 가능하다.
		List<String> list = new ArrayList<>();
		list.add("A"); // add : 데이터를 추가하면서 크기가 증가함.(index)
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println("리스트 크기" + " : " + list.size());
		System.out.println("리스트 [0] : " + list.get(0));
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
	}
}
