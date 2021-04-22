package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList origin = new ArrayList(10);	//ArrayList Ÿ���� ���������� �����ϰ� ���������� ���ο� ArrayList �ν��Ͻ��� �����Ͽ� �� �ּҰ��� ������.
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i = 0; i < 10; i++) {
			origin.add(i + "");		//origin�� ����Ű�� ���� �ν��Ͻ��� 0���� 9������ ���� ���ڿ��� ������
		}
		
		Iterator it = origin.iterator();	//Iterator Ÿ���� ���������� �����ϰ� ���⿡ origin �� iterator()�� ȣ���ϰ� ���Ϲ��� �����͸� ������
		
		while(it.hasNext()) {
			copy1.add(it.next());	//�������� ���� ��� copy1�� �ν��Ͻ��� �� ���� ���������� ����
		}
		
		System.out.println("origin ���� copy1 ���� ������ ����");
		System.out.println("origin = " + origin);
		System.out.println("copy1 = " + copy1);
		
		it = origin.iterator();	//iterator�� ������ �Ұ����Ͽ� �̹� ������� ���������� �ٽ� �ѹ� �޼��带 ȣ���Ͽ� �����͸� �����Ѵ�.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();	//copy1���� �ٸ��� ������ �� �����͸� �����Ѵ�.
		}
		
		System.out.println("origin ���� copy2 ���� ������ �̵�");
		System.out.println("origin = " + origin);
		System.out.println("copy2 = " + copy2);

	}

}
