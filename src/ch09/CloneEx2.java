package ch09;

import java.util.Arrays;

class CloneEx2 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int [] arrClone = arr.clone();
		//�迭�� ��ü�̹Ƿ� Object Ŭ������ ��ӹް�, Cloneable �������̽��� Serializable�������̽��� �����Ǿ� �ִ�.
		//���� clone() �޼����� protected ���� public���� �������̵� �Ǿ������� ������ ���� ��ȯŸ���� ��ȯ�Ͽ� ����ȯ�� �ʿ����.
		arrClone[0] = 6;
		int [] arrClone2 = new int[arr.length];
		System.arraycopy(arr, 0, arrClone2, 0, arr.length);
		//arraycoyp() �޼��带 ���ؼ� �迭 ���縦 �Ҽ��� �ִ�. clone()�޼��带 ����� �Ͱ� �Ȱ���.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrClone2));
	}
}
