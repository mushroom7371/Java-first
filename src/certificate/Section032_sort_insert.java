package certificate;

import java.util.Scanner;

class Section033_sort_insert {
	//��������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, i, k, key;
		//j = �Է¹��� ������ ����, i = ���� ȸ����, Key���� ��ġ�� ������ �ִ� ����, k = �� ����� �ִ� ��ġ�� �������ִ� ����, key = �񱳱����� Key���� ����� ����
		int [] a = new int[10]; //������ ���ڰ� ����� �迭
		j = -1;	//�迭�� ������ 0�������� �����ϹǷ� -1�� ����
		
		do {
			j++;	//�ݺ� ������ 0���� ���� �����
			a[j] = sc.nextInt();
		} while (j < 9);	//j�� 8�� �ɶ����� �ݺ�, j�� 8�̵ȴٴ� ���� do������ j++�� ���Ͽ� 9������ �ڸ��� ����ǹǷ� 8���������� �ƴϴ�.
		for (i = 1; i <= 9; i++) {	//key���� �յڷ� ���ϱ� ���� 1������ �����͸� ������ ������
			key = a[i];
			for (k = i - 1; k >= 0; k--) {
				if (a[k] > key)
					a[k + 1] = a[k];
				else
					break;
			}
			a[k + 1] = key;
		}
		for (i = 0; i <= 9; i++)
			System.out.printf("%d ", a[i]);
		sc.close();

	}

}
