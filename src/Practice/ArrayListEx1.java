package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String args []) {
		ArrayList list1 = new ArrayList(10); //크기가 10인 ArrayList 생성
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //subList의 생성자안의 의미는 1포함 4미포함임.
		print(list1, list2);
		
		Collections.sort(list1); //Collections.sort로 배열 안의 숫자를 정렬한다.
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		// list1이 list2의 모든 요소를 포함 하고 있을때만 true를 출력한다.
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //list2 의 3번지 주소에 A를 추가(add(Object obj))를 이용함.
		print(list1, list2);
		
		list2.set(3, "AA"); //list2의 3번지 주소의 값을 AA로 변경
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		//list1에서 list2와 곂치는 부분만 남기고 나머지를 삭제함.
		
		print(list1, list2);
		
		for(int i = list2.size()-1; i >=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		} //list2 에서 list1이 포함된 객체들을 삭제하는 기능
		
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
