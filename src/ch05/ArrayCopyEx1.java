package ch05;

import java.util.Arrays;

public class ArrayCopyEx1 {
	public static void main(String args []) {
		int [] arr = {1, 2, 3, 4, 5};
		//int Ÿ���� �����͸� �����ϴ� �迭 ����� ���ÿ� �ʱ�ȭ. ���̴� �ڵ����� �ʱ�ȭ ������ ������ ������
		int [] temp = new int[arr.length*2];
		//�迭�� ���縦 ���� ������ �迭, ũ�Ⱚ�� �迭 arr�� ������ �ι�� ������ �ξ��� �ʱⰪ�� 0
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//temp�迭�� �� �������� arr�迭�� ������ �����͸� ������.
		
		arr = temp;
		//�̷� ���� �������� arr�� ������ ����Ű�� �ּҰ��� �Ҿ������ �迭temp�� �ּҰ��� ������.
		//�Ҿ���� �ּҴ� GC ������ �÷��Ϳ� ���� �����Ǿ� �������.
		
		System.out.println(Arrays.toString(temp));
		//�迭�� ����ϱ� ���� Arrays Ŭ������ toString() �޼��带 ���
		
		
		//arraycopy�� �̿��� �迭 ����
		char [] abc = {'a', 'b', 'c', 'd'};
		char [] num = {'0', '1', '2', '3'};
		
		char [] result = new char[abc.length + num.length];
		//���� ����� �迭�� �����ϰ� ���̸� �迭 abc, num�� ũ�⸦ ���� ��ŭ �����Ѵ�.
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		//System Ŭ�������� �����ϴ� arraycopy() �޼��带 ���Ͽ� ���縦 �ǽ��Ѵ�.
		System.out.println(Arrays.toString(result));
	}
}
