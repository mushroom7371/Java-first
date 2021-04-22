package CollectionsFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();	//ArrayList 타입의 참조변수에 새로만든 ArrayList 객체의 주소값을 저장함
		
		list.add("1");	//ArrayList 인스턴스에 데이터를 추가함.
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();	//ListIterator 타입의 참조변수 it을 선언하고 listIterator()메서드를 호출하여 리턴값을 저장함
		
		while(it.hasNext()) {	//it가 가리키는 인스턴스에 다음 데이터가 있는 경우
			System.out.println(it.next());	//그 데이터를 불러와서 출력한다.
		}
		
		System.out.println("--------------");
		
		while(it.hasPrevious()) {	//Iterator와는 다르게 ListIterator 에는 양방향으로 값을 읽어올 수있다 hasPrevious()는 이전 값이 있는지 없는지 유무를 판단함.
			System.out.println(it.previous());	//이전에 읽어올 데이터가 있다면 그 데이터를 불러오고 이를 출력한다.
		}
	}

}
