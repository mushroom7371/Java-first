package ch05;

import java.util.Arrays;

public class ArrayConjugation3 {
	public static void main(String[] args) {
		int [] bubbleSort = new int[10];
		int temp;
		
		for(int i = 0; i < bubbleSort.length; i++) {
			bubbleSort[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i = 0; i < bubbleSort.length-1; i++) {	//���� Ư���� ������ �������� ����Ǹ� �ȵǱ⶧���� -1�� ������
			boolean flag = false;
			//�ݺ��� ���������� ���� ����
			
			for(int j = 0; j < bubbleSort.length-1-i; j++) {
				//0�������� �����ϵ� ������ ���� ���� �ʿ䰡 ���� �� ���ķ� ���Ͽ� ������ ������ �����ʹ� �ִ밪�̱� ����
				if(bubbleSort[j] > bubbleSort[j+1]) {
					temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j+1];
					bubbleSort[j+1] = temp;
					flag = true;
				}
			}
			
			if(!flag) {	//�ݺ����� flag ���� true�� �����ϱ� ������ ture�� �ڸ��ٲ��� �Ͼ ���̹Ƿ� ���ǹ��� ���� �Ǿ� �ٽ� �ݺ��� �ǽ���
						//������ �ڸ��ٲ��� �Ͼ�� �ʾҴٸ� flag ���� false�̹Ƿ� ���� �ƴϱ⿡ �ݺ��� �����Ѵ�.
				break;
			}
		}
		
		System.out.println(Arrays.toString(bubbleSort));
		
		int [] sort = new int[10];
		
		for(int i = 0; i < sort.length; i++) {
			sort[i] = (int)(Math.random() * 10 + 1);
		}
		
		Arrays.sort(sort);
		//Arrays Ŭ�������� �����ϴ� sort() �޼��带 ����ϸ� ���� ���� ���� ������ �Ϸ�ȴ�.
		//BubbleSort�� �Ź� �ݺ��ϰ� Ȯ���ϱ� ������ �ð����⵵�� ����.
		System.out.println(Arrays.toString(sort));
	}
}
