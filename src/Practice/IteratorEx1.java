package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList(); //ArrayList Ÿ���� �������� list ����
		list.add("1");	//list �迭 �ȿ� 1�� �߰���
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
