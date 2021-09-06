package CollectionsFramework;

import static java.util.Collections.*;	//�÷��� Ŭ������ �޼��带 ����ϱ� ���� static���� import�Ͽ���.
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

class CollectionsEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);	//���� �Ͽ��� �� �ƹ��͵� ����� ���� ����
		
		addAll(list, 1,2,3,4,5);	//�ռ� import�� Collections Ŭ������ �޼��� ���� ����
		System.out.println(list);	//addAll() �޼���� �������� list�� ����Ű�� ArrayList ��ü�� ������ ���� ����.
		
		rotate(list, 2);	//���������� ��ĭ�� �̵�
		System.out.println(list);
		
		swap(list, 0, 2);	//0������ 2������ ���� �ٲ۴�.
		System.out.println(list);
		
		shuffle(list);	//�ش� ��ü�� ������ ���´�.
		System.out.println(list);
		
		sort(list);	//��ü�� ������ ���������� �����Ѵ�.
		System.out.println(list);
		
		sort(list, reverseOrder());	//�������� �����Ѵ�.
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	//��ü���� �ش� �������� �������� ã�� ��ȯ�Ѵ�.
		System.out.println("index of 3 : " + idx);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
		System.out.println("min = " + max(list, reverseOrder()));	//�ݴ�� ������ ���·� max���� ã�� �Ǹ� �翬�� min���� ���´�.
		
		fill(list, 9);	//��ü�� �����͸� 9�� ä���. ���� �迭�� ���̴� �����ȴ�.
		System.out.println(list);
		
		List newList = nCopies(list.size(), 2);	//list�� ���� ũ���� ���ο� list�� �����ϰ� ������ 2�� ä���.
		System.out.println("newList = " + newList);
		
		System.out.println(disjoint(list, newList));	//�� ���������� ����Ű�� ��ü�� �����Ұ� ������ true�� ��ȯ��
		
		copy(list, newList);	//�������� list�� newList�� ����Ű�� ��ü�� ������.
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);	//list�� ����Ű�� ��ü�� ������ 2�� ��� 1�� ��ü
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2 = " + list2);
		
	}
}
