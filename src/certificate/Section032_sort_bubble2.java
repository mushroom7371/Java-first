package certificate;

import java.util.Scanner;

class Section032_sort_bubble2 {
	//�������� for��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		//n = �Է¹��� ������ ����, k = ġȯ�� ����� �ӽú���
		int [] data = new int[10];
		//������ ���ڰ� ����� �迭
		n = -1;
		do {
			n++;	//0�������� 9�������� �� 10���� ���ڰ� �迭�� �����
			data[n] = sc.nextInt();	//Ű����� �Է¹��� ���ڰ� �����
		} while (n < 9);
		for (int i = 1; i <= 9; i++) {	//���������� ������ ������ ���ڴ� �̹� ���� ū ���̹Ƿ� �ش� �������� �����ϰ� ġȯ�� �ǽ��ϱ� ����.
			for (int j = 0; j <= 9 - i; j++) {	//���� i�� ũ�⸸ŭ ���� ������ ���������� ���� �ʿ䰡 ���� ����
				if (data[j] > data[j + 1]) {	//�迭�� ����� 2���� �����͸� ���Ͽ� ġȯ �۾��� �ǽ���.
					k = data[j];
					data[j] = data[j + 1];
					data[j + 1] = k;
				}
			}
		}
		for (int x = 0; x < 10; x++)	//�ܼ� ��¿� �ݺ�
			System.out.printf("%d ", data[x]);
		sc.close();

	}

}
