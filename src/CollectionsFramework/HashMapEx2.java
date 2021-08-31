package CollectionsFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();	//HashMap Ÿ���� ���������� HashMap Ŭ�����κ��� �ν��Ͻ��� �����Ͽ� �ּҰ��� �����Ѵ�.
		map.put("���ڹ�", new Integer(100));	//map�� key ���� value���� �����Ѵ�.
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		Set set = map.entrySet();	//Set Ÿ���� �������� set�� �����ϰ� map�� �����͸� ��Ʈ�� ����(Ű�� ���� ����)�� �����Ѵ�.
		Iterator it = set.iterator();	//set�� iterator()�޼��带 ȣ���Ͽ� ���Ϲ��� ���� Iterator Ÿ���� �������� it�� �����Ѵ�.
										//Iterator�� ����Ͽ� ���� �о���� �غ� �Ѵ�.

		while(it.hasNext()) { //�������� it�� ����Ű�� �ν��Ͻ��� ���� ���� ���������� �ݺ�
			Map.Entry e = (Map.Entry)it.next();	//Map.EntryŸ���� ���������� it.next()�� ����ȯ �Ͽ� �����Ѵ�.
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
			//entry ���·� ����� ���� ���
		}
		
		set = map.keySet();	//�������� set�� kdySet()�޼���� ��ȯ�� ��� Ű ���� ��ȯ�Ѵ�. ���� Ÿ���� Set�̱⿡ ���������� Ÿ�԰� ��ġ�Ѵ�.
		System.out.println("������ ��� = " + set);
		
		Collection values = map.values();	//Collection Ÿ���� ���������� �������� map�� ����Ű�� HashMap ��ü�� ����� ��� ���� Collection ���·� ��ȯ
		it = values.iterator();	//Iterator�� ��Ȱ���� �ȵǹǷ� �ٽ� ���� ������ �д�.
		
		int total = 0;
		
		while(it.hasNext()) {	//it�� �������� ������ ���� �ݺ�
			Integer i = (Integer)it.next();	//it�� ���� �����͸� Integer Ÿ������ ����ȯ �Ͽ� ����i�� ����
			total = total + i.intValue();	//total ������ i�� ���� �����Ѵ�.
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}

}
