package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapEx1 {
	public static void main(String[] args) {
		String [] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		//String Ÿ���� �����͸� �����ϴ� �迭�� �����ϰ� ���������� �ּҰ��� ��Ҵ�.
		
		TreeMap map = new TreeMap();
		//TreeMap ��ü�� ����
		
		for(int i = 0; i < data.length; i++) {	//data�� ����Ű�� �迭�� ũ�⸸ŭ �ݺ�
			if(map.containsKey(data[i])) {	//�ش� ��ü�� key������ �ݺ����� data[i]������ ���� ������ �ִٸ�
				Integer value = (Integer)map.get(data[i]);	//���� value�� �ش� ������ ���� �о���� ����ȯ �Ͽ� Ÿ���� ��ġ ��Ų�� ���� �����Ѵ�.
				map.put(data[i], new Integer(value.intValue() + 1));	//map�� ����Ű�� ��ü(TreeMap)�� data[i]�� ���� key������ �ϰ� value������ ���� ������ +1 �� ���� �����Ѵ�.
			}else {	//key������ data[i] ������ �����Ͱ� ���ٸ�
				map.put(data[i], new Integer(1));	//�ش� ���� key������ �ϰ� 1�� value������ �����Ѵ�.
			}
		}
		
		Iterator it = map.entrySet().iterator();
		//�ش� ��ü�� ��ü �����͸� �о���̱� ���� Iterator ���������� �����ϰ� map�� iterator()�޼����� ���ϰ���� ��ü�� �����ϰ� �Ͽ���.
		
		System.out.println("=== �⺻ ���� ===");
		
		while(it.hasNext()) {	//�������� it�� ����Ű�� ��ü�� �����Ͱ� ����Ǿ� �ִٸ�
			Map.Entry entry = (Map.Entry)it.next();	//�� �����͸� Map.EntryŸ���� ���������� ���,
			int value = ((Integer)entry.getValue()).intValue();	//�� �����͸� ����ȯ�� ���Ͽ� int Ÿ������ ������ �⺻�� ���� value�� ��´�.
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);	//�ϴܿ� ������ static �޼����� ������ ����� �ǽ��Ѵ�.
		}
		System.out.println();
		//���� ������ ���� HashMapEx4�� ����
		
		//map�� ArrayList�� ��ȯ�� ������ Collections.sort()�� ����
		
		Set set = map.entrySet();
		List list = new ArrayList(set);
		
		//static void sort(List list, Comparator c)
		Collections.sort(list, new ValueComparator());	//CollectionsŬ������ �����ϴ� ���ĸ޼��带 �̿��Ͽ� ���� �̶� ValueComparatorŬ���� ��ü�� �̿��Ͽ� ���� ������ �ȴ�.
		
		it = list.iterator();
		
		System.out.println("=== ���� ũ�Ⱑ ū ������ ���� ===");
		while(it.hasNext()){	//���� ��� ����� ����
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}
	
	static class ValueComparator implements Comparator{	//Comparator �������̽��� ������ Ŭ����
		public int compare(Object o1, Object o2) {	//�ش� �������̽��� �߻� �޼��带 �������̵� �Ͽ���.
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {	//���ڰ����� ���� ��ü�� Map.Entry Ÿ���� �ν��Ͻ����,
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				//Map.Entry Ÿ���� ���������� ������ �����ϵ��� ����ȯ�Ͽ� �ּҰ��� �����Ѵ�.
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				//�ش� ��ü�� value���� �޾ƿ� IntegerŸ������ ����ȯ �� �ٽ� int Ÿ������ �����͸� �����Ѵ�.
				
				return v2 - v1;	//���� ���̸� ��ȯ�Ѵ�.
			}
			
			return -1;
		}
	}	//static class ValueCoparator implements Comparator{
	
	public static String printBar(char ch, int value) {	//�׷��� �������� ����ϱ� ���� �޼���
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}
