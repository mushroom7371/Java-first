package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList();	//저장 순서가 유지되고 중복을 허용하는 ArrayList 타입의 참조변수 list 를 선언하고, 새로운 ArrayList 인스턴스를 만들어 이 주소값을 저장한다. 
		
		list.add("1");	//add()	메서드를 통하여 데이터를 저장한다.
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();	//Iterator 타입의 참조변수 it 를 선언하고 list의 iterator() 메서드를 호출한 리턴값을 저장한다.
		
		while(it.hasNext()) {	//it의 hasNext() 메서드는 다음 값이 있으면 true 없으면 false를 반환하기에 다음 데이터가 있을때 까지 반복을 시행한다.
			Object obj = it.next();		//Object 타입의 참조변수 obj에 it에 있는 next() 메서드를 호출하여 그 리턴값을 저장한다.
			System.out.println(obj);	//조건이 참일 경우 Obj에 저장된 데이터를 출력한다.
		}
	}
}
