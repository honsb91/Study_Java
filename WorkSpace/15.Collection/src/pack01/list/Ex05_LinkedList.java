package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		// 공부 x , 많이 사용 안함
		// 데이터를 중간에 추가하는것 빠름 ( 추가 , 삭제 )
		List<String> arrList = new ArrayList<>();
		List<String> linkList = new ArrayList<>();
		
		long startTime = 0;
		long endTime = 0;
		startTime = System.nanoTime(); // 작업에 걸린 시간을 판단하는 것
		for(int i=0; i<1000000; i++) {
			arrList.add(new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList로 작업 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime(); // 작업에 걸린 시간을 판단하는 것
		for(int i=0; i<1000000; i++) {
			linkList.add(new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("linkedList로 작업 시간 : " + (endTime - startTime) + "ns");
	}
}
