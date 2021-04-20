package CollectionsFramework;

import java.util.*;	// java util �������� ��� Ŭ������ ����ϱ� ���ؼ� import��

public class ArrayListEx1 {
	public static void main(String args []) {
		ArrayList list1 = new ArrayList();
		//ArrayList Ÿ���� �������� list1 �� �����ϰ� ��ä�� ������ �ּҰ��� ������, ArrayList�� �⺻ �������̴� 10�̴�.
		
		list1.add(0, 5);	//ArrayList ������ add �޼��带 ȣ��, �ش� �ε����� ���� �߰��Ѵ�.
		list1.add(1, 4);
		list1.add(2, 2);
		list1.add(3, 0);
		list1.add(4, 1);
		list1.add(5, 3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// ���ο� ArrayList �ν��Ͻ��� �����ϰ�, subList �޼��带 ���ؼ� 1���� �ڸ����� 3���� �ڸ������� �߶� �����Ѵ�. 4�� 4������ �ƴ�. �� �ձ�����, ����
		print(list1, list2);	//��� �޼��� �ϴܿ� static �޼���� ����
		
		Collections.sort(list1);	//ArrayList�� List �������̽��� ��� �ް� List �������̽��� Collections �������̽��� ��ӹ޹Ƿ�
		Collections.sort(list2);	//Collections �������̽��� ���ǵ� �޼��� ����� �����ϴ�. �ش� sort() �޼���� �����ϱ����� ������ִ�.
		
		print(list1, list2);
		
		list2.add("B");	//list2�� ���� �ε����� ���ڿ��� �߰��Ѵ�.
		list2.add("C");
		list2.add(3, "A");	//3���� �ڸ��� ���ڿ��� �߰��ϰ�, ������ �ִ� ������ ���� �ε����� �з�����.
		
		print(list1, list2);
		
		list2.set(3, "AA");	//3������ ������ ����
		
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		//list1 �ȿ� list2 �� ������ ��� �����������(retainAll) true�� ��ȯ�Ѵ�.
		
		print(list1, list2);
		
		for(int i = list2.size()-1; i >= 0; i--) {
			//������ �ϱ� ���� for �ݺ���, ArrayList�� 0���� ���������� ������Ű�鼭 ������ �ϰԵǸ�
			//������ �ε����� �ڸ��� �޳����� ����� ���⶧���� ������ ������ ����� �ִ�.
			//���� ��� 3���� 4������ ������ ���޾� �����ؾ� �Ǵ� ���, i=3�� ��� ������ �Ϸ��ϰ� i=4�� �ݺ��� ����ǰ� �Ǵµ�
			//������ �ִ� i=4�� �������� �ִ� ������ i=3�� ������ �����ɽ� ����� i=3�� ������ ������� �ǹǷ� ���� �۾��� �Ұ����ϰ� �ȴ�.
			if(list1.contains(list2.get(i))) {
				//list1�� ArrayList�� �����ϰ� �ִ���?(contains) ������? list2�� i �������� ���� �̶� get�� i�������� ���� ��Ÿ����.
				list2.remove(i);	//���� list1�� list2�� i�������� ���� ������ �ִٸ�, �ش� i�������� ���� ����(remove)�Ѵ�.
			}
		}
		
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) { //���� Ȯ�ο� ��� �޼���
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
