package certificate;

import java.util.Scanner;

class Section020_divisor {
	//��� ���ϱ�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b, mok, nmg, i;
		//b = �Է��� ��, mok = ��, nmg = ������, i = ������ �迭�� ����
		
		int a[] = new int[100];
		//����� ������ �迭
		System.out.print("���ڸ� �Է��ϼ���. : ");
		b = sc.nextInt();
		
		int c = 0, d = -1;
		//1���� ������ �ϱ� ������ c�� �ʱⰪ�� 0���� �� while������ ++�� ���� ù �ݺ��� 1�� �ȴ�.
		//�������� �ش� �����͸� ������ �迭�� ����, �迭�� 0���� ���� �����ϹǷ� -1�� �ʱ�ȭ
		while (true)
		{
			c++;
			if (c <= b)	//����� �������� �Է��� ������ Ŭ �� ����.
			{
				mok = b / c;	//int�� Ư��, ���� ���Ҷ� �������� ������ ������ �ٸ� ���밡 �ʿ� ����
				nmg = b - mok * c;	//�������� �Է��� �� - ��*�������� ��
				if (nmg == 0)	//�������� 0�̸� ����̴�.
				{
					d++;
					a[d] = c;
				}
			}
			else
			{
				System.out.println("�Է��� ������ �����");
				for (i = 0; i <= d; i++)
					System.out.printf("%d ", a[i]);
				break;
			}
		}
		sc.close();
	}
}
