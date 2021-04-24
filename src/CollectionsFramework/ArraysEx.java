package CollectionsFramework;

import java.util.Arrays;	//Arrays Ŭ������ ����ϱ� ���� import �Ͽ���

public class ArraysEx {
	public static void main(String arg [] ) {
		int [] arr = {0, 1, 2, 3, 4,};	//1���� �迭�� �����ϰ� �ʱ�ȭ �Ѵ�. arr�� ���������� ������ �迭�� �ּҸ� ����Ų��.
		int [] [] arr2D = {{11, 12, 13}, {21, 22, 23}};	//2���� �迭�� �����ϰ� �ʱ�ȭ �Ѵ�. ���������� ���������� �ּҸ� ����Ű�µ� �ּ��� 1�����迭�� �ٽ� 2�����迭�� �ּҸ� ����Ų��.
	
		System.out.println("arr = " + Arrays.toString(arr));	//1���� �迭�� ����ϴµ� ����ϴ� �޼��� toString()
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));	//2���� �迭�� ����Ҷ��� deepToString()�޼��带 ����ؾߵȴ�.
	
		int [] arr2 = Arrays.copyOf(arr, arr.length);	//Arrays Ŭ������ copyOf() �޼��带 �̿��� �迭 ����.���� ���� ������ �ִ��� �߰���
		int [] arr3 = Arrays.copyOf(arr, 3);	//3��° ���������� ���簡 �ƴ϶� �� �������̴�.
		int [] arr4 = Arrays.copyOf(arr, 7);	//������ �Ѿ�� �迭�� 0���� ä���.
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4); //���������� 4��° ������ �ƴ� �� �ձ��� �迭�� �����Ѵ�.
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2 = " + Arrays.toString(arr2)); //���
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int [] arr7 = new int[5];	//���̰� 5�� �迭�� �����Ͽ��� �ʱ�ȭ�� �⺻�� 0 �� ����
		Arrays.fill(arr7, 9);	//fill()�� ����Ͽ� �迭�� ������ ä��µ� 9�� ä����
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);	//i -> (int)(Math.random() * 6) + 1 �� ���ٽ��̶�� �ϴµ� Math.random�� ���� �����ΰ��� �˰���.
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int i : arr7) {	//���� for ������ ������� ���鼭 arr7�� ���� i�� �����Ѵ�. 
			char [] graph = new char[i];	//���⼭�� ������ �迭 �� �����ϰ� �� ������ ���������� arr7�� ���� �����Ѵ�.
			Arrays.fill(graph, '*'); //graph �� ����Ű�� ������ �迭�� �ּҸ��� arr7�� ������ ����ŭ *�� ä���.
			System.out.println(new String(graph) + 1);	//�ܼ��� +1 �� �ϸ鼭 ��踦 ��
		}
		
		String [] [] str2D = new String [] [] {{"aaa", "bbb"},{"AAA", "BBB"}};	//String Ÿ���� 2���� �迭�� ������. 2�����迭�� ��İ��� �������� ��� �ƴ� �ּҰ��� �ּҰ��� ����Ű�� ����
		String [] [] str2D2 = new String [] [] {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));	//�迭�� ���ϴ� �޼���� ������ ������ true�� ��ȯ�Ǿ�� ������ 
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//2���� �迭�� �񱳴� deepEquals()�� ���ؾߵȴ�. deepToString�� ����� ���
	
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};	//������ �������� �ʰ� ���Ƿ� ���ڰ��� �迭�� ������
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//binarySearch() �޼���� chArr�� ����B�� ã�Ƴ��� ������ ������ �߻��Ѵ�. ������ ���� �ʾұ� ����.
		System.out.println("== After sorting ==");
		Arrays.sort(chArr);	//�迭�� �����Ѵ�. �������µ� �����ڵ�� ǥ���Ǳ� ������ ������ �Ҽ��ִ�.
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//���������� ������ �Ϸ� �� �� binarySearch()�� �迭�� �������� ã�� �� �ִ�.
		
	}
}
