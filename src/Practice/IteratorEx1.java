package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList(); //ArrayList 타입의 참조변수 list 선언
		list.add("1");	//list 배열 안에 1을 추가함
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}
}
