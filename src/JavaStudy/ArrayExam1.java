package JavaStudy;

public class ArrayExam1 {
	public static void main(String [] args) {
		int [] array = new int[100];
		//���� Ÿ���� ���� �����ϴ� �迭�� ���� ����� ũ�⸦ 100���� ���Ѵ�.
		//���� ���� �迭�� �ּҰ��� �������� array�� �����Ѵ�
		int sum = 0;	//���������� �����ϸ� �ݺ������ ���� �����ϰ� ������ ����� ����ǹǷ� ��������� ����
		
		for(int i = 0; i < array.length; i++) {	//for �ݺ���
			array[i] = i + 1;	//�迭�� ù ������ 0���� �����ϹǷ� ���ڸ� ���߱� ���� 1�� ������
			
			System.out.println(array[i]);	//�ܼ� �迭 �������� ����� ���� ���
		}
		
		for(int i = 0; i <array.length; i++) {
			sum = sum + array[i];	//���� sum�� �迭�� ���������� ���� ���������� ��������̱⿡ ���� �����ȴ�.
		}
		System.out.println(sum);
	}
}
