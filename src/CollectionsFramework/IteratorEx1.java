package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String [] args) {
		ArrayList list = new ArrayList();	//���� ������ �����ǰ� �ߺ��� ����ϴ� ArrayList Ÿ���� �������� list �� �����ϰ�, ���ο� ArrayList �ν��Ͻ��� ����� �� �ּҰ��� �����Ѵ�. 
		
		list.add("1");	//add()	�޼��带 ���Ͽ� �����͸� �����Ѵ�.
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();	//Iterator Ÿ���� �������� it �� �����ϰ� list�� iterator() �޼��带 ȣ���� ���ϰ��� �����Ѵ�.
		
		while(it.hasNext()) {	//it�� hasNext() �޼���� ���� ���� ������ true ������ false�� ��ȯ�ϱ⿡ ���� �����Ͱ� ������ ���� �ݺ��� �����Ѵ�.
			Object obj = it.next();		//Object Ÿ���� �������� obj�� it�� �ִ� next() �޼��带 ȣ���Ͽ� �� ���ϰ��� �����Ѵ�.
			System.out.println(obj);	//������ ���� ��� Obj�� ����� �����͸� ����Ѵ�.
		}
	}
}
