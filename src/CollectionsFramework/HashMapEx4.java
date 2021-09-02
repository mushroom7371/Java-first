package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashMapEx4 {
	public static void main(String[] args) {
		String [] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		//String Ÿ���� �����͸� �����ϴ� �迭�� �����ϰ� ���������� �ּҰ��� ��Ҵ�.
		
		HashMap map = new HashMap();
		//HashMap ��ü�� ����
		
		for(int i = 0; i < data.length; i++) {	//�������� data�� ����Ű�� �迭�� ���̸�ŭ �ݺ�
			if(map.containsKey(data[i])) {	//HashMap��ü�� data�� ����Ű�� �迭�� ���������� �����͸� ������ �ִٸ�
				Integer value = (Integer)map.get(data[i]);	//HashMap��ü�� �������ִ� �ش� �����͸� ���ͼ� ����ȯ�� ���� Ÿ���� ��ġ ��Ų ��, ���� value�� �� ���� �����Ѵ�.
				map.put(data[i], new Integer(value.intValue() + 1));	//HashMap��ü�� �ش� �������� ���� value�� 1���� ��Ų �� �����Ѵ�.
			}else {
				map.put(data[i], new Integer(1));	//������ ���� �ʴٸ� 1�� �����Ѵ�.
			}
		}
		
		Iterator it = map.entrySet().iterator();	//HashMap�� �����͸� �о�������� �غ�.
		
		while(it.hasNext()){	//�ϴ��� �޼��带 ���Ͽ� ����� �ǽ��Ѵ�.
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}
	}
	
	public static String printBar(char ch, int value) {	//�׷��� �������� ����ϱ� ���� �޼���
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}
