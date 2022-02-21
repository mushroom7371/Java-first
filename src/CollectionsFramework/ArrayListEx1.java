package CollectionsFramework;

import java.util.*;	// java util 폴더내의 모든 클래스를 사용하기 위해서 import함

public class ArrayListEx1 {
	public static void main(String args []) {
		ArrayList list1 = new ArrayList();
		//ArrayList 타입의 참조변수 list1 을 선언하고 객채를 생성후 주소값을 저장함, ArrayList의 기본 생성길이는 10이다.
		
		list1.add(0, 5);	//ArrayList 내부의 add 메서드를 호출, 해당 인덱스에 값을 추가한다.
		list1.add(1, 4);
		list1.add(2, 2);
		list1.add(3, 0);
		list1.add(4, 1);
		list1.add(5, 3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// 새로운 ArrayList 인스턴스를 생성하고, subList 메서드를 통해서 1번지 자리에서 3번지 자리까지를 잘라서 저장한다. 4는 4번지가 아님. 그 앞까지임, 주의
		print(list1, list2);	//출력 메서드 하단에 static 메서드로 정의
		
		Collections.sort(list1);	//ArrayList는 List 인터페이스를 상속 받고 List 인터페이스는 Collections 인터페이스를 상속받므로
		Collections.sort(list2);	//Collections 인터페이스에 정의된 메서드 사용이 가능하다. 해당 sort() 메서드는 정렬하기위한 기능이있다.
		
		print(list1, list2);
		
		list2.add("B");	//list2의 다음 인덱스에 문자열을 추가한다.
		list2.add("C");
		list2.add(3, "A");	//3번지 자리에 문자열을 추가하고, 기존에 있던 내용은 다음 인덱스로 밀려난다.
		
		print(list1, list2);
		
		list2.set(3, "AA");	//3번지의 내용을 변경
		
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		//list1 안에 list2 의 내용이 모두 담겨져있으면(retainAll) true를 반환한다.
		
		print(list1, list2);
		
		for(int i = list2.size()-1; i >= 0; i--) {
			//삭제를 하기 위한 for 반복문, ArrayList를 0부터 순차적으로 증가시키면서 삭제를 하게되면
			//없어진 인덱스의 자리에 뒷내용이 당겨져 오기때문에 삭제에 오류가 생길수 있다.
			//예를 들어 3번지 4번지의 내용을 연달아 삭제해야 되는 경우, i=3의 경우 삭제를 완료하고 i=4로 반복이 실행되게 되는데
			//기존에 있던 i=4의 번지수에 있던 내용은 i=3의 내용이 삭제될시 당겨져 i=3의 번지로 당겨지게 되므로 삭제 작업이 불가능하게 된다.
			if(list1.contains(list2.get(i))) {
				//list1의 ArrayList가 포함하고 있느냐?(contains) 무엇을? list2의 i 번지수의 값을 이때 get은 i번지수의 값을 나타낸다.
				list2.remove(i);	//만약 list1이 list2의 i번지수의 값을 가지고 있다면, 해당 i번지수의 값을 제거(remove)한다.
			}
		}
		
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) { //내용 확인용 출력 메서드
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
