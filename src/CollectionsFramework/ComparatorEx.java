package CollectionsFramework;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorEx {
	public static void main(String[] args) {
		String [] strArr = {"cat", "Dog", "lion", "tiger"};	//�����׽�Ʈ�� ���� ������ String Ÿ�� �迭�� ��� �������� ���� �� �ʱ�ȭ
		
		Arrays.sort(strArr);	//Arrays Ŭ�������� �����ϴ� ���ĸ޼��� ���, String �� Comparable������ ���� ����(���� Comparator�� �������� �ʾұ⿡ Comparable�� ������ Stirng Ŭ������ ������ ���뿡 ���� �����Ͽ���.)
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);	//��ҹ����� ���� ���� ����. ������ Comparator�� ���� ���������� String Ŭ�������� ������ ������ �����Ͽ� �����Ͽ���.
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());	//�Ʒ��� Comparator �������̽��� ������ Descending Ŭ������ ����Ͽ� �������� �����Ѵ�.
		System.out.println("strArr = " + Arrays.toString(strArr));

	}
}

class Descending implements Comparator	{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			//Comparable�� �⺻ ���ı����� �����ϴµ� ���
			//Comparator�� �⺻ ���ı��� �ܿ� �ٸ� �������� �����ϰ��� �Ҷ� ���
			
			return c1.compareTo(c2) * -1;	//�������� �����ϱ� ���� �ܼ��� ��ȯ���� -1�� ���ϴ� �۾��� �Ͽ���.
		}
		
		return -1;
	}
}
