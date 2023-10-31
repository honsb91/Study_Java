package pack01.list;

import java.util.ArrayList;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<>();
		boolean isAdd= iList.add(1); // iList.
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.add(5);
		iList.add(1, 9);
		iList.remove(0);
		System.out.println(iList.get(0) + " " + isAdd);
		System.out.println(iList.contains(1) + " 1이 있음.List 요소로 있다.");
		System.out.println(iList.contains(6) + " 6은 없음.List 요소에 없다.");
		//iList.clear(); 객체 삭제
		System.out.println(iList.isEmpty() + " isEmpty는 비어있는지 확인 null X");
	}
}
