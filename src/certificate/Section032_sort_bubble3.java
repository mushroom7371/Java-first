package certificate;

import java.util.Scanner;

class Section032_sort_bubble3 {
	//���� ���� �߰�����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sw, cnt, k;
		//n = �Է¹��� ������ ����, sw = �ڷᱳȯ ���θ� �Ǵ��� ����ġ ����, cnt = �ڷ� ��ȯ Ƚ��, k = ġȯ�� ���� ����
		int [] data = new int[10];
		//������ ���ڰ� ����� �迭
		
		n = -1;	//0~9������ �������� �����ϱ� ���� -1�� �ʱ�ȭ
		
		do {
			n++;	//n�� 0���� ���� ������
			data[n] = sc.nextInt();
		} while (n < 9);
		
		cnt = 0;	//��ȯ�� �̷����� ���� ���� 0���� �ʱ�ȭ
		
		for (int i = 1; i <= 9; i++) {
			sw = 0;	//����ġ ������ 0�� 1 �ΰ����� ���� �Ǵ� �ݺ��� ������ �� ���� 0���� �ʱ�ȭ �ȴ�.
			for (int j = 0; j <= (9 - i); j++) {	//������ ���������� ������ ����
				if (data[j] > data[j + 1]) {	//�񱳽� ū �����͸� �ڷ� �ű�� ġȯ
					k = data[j];
					data[j] = data[j + 1];
					data[j + 1] = k;
					cnt++;	//�ѹ��� ��ȯ�� �̷����� ��ȯ Ƚ���� �߰� �ȴ�.
					sw = 1;	//���� ���� �����Դٴ� ���� ��ȯ�� �̷����ٴ� �ǹ�.
							//���� ��ȯ�� ���� �ʾҴٸ� ������� �������� �ʾҰ� sw������ 0���� �ʱ�ȭ �� ������ ���̴�.
				}
			}
			if (sw == 0)	//��ȯ�� ���� ���� ���°� ���̶��, ���̻��� �ݺ����� �ֻ��� for���� �������´�.
				break;
		}
		
		System.out.printf("%d ", cnt);	//���
		for (int x = 0; x <= 9; x++)
			System.out.printf("%d ", data[x]);
		sc.close();

	}

}
