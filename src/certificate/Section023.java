package certificate;

import java.util.Scanner;

public class Section023 {
	//������ 10���� -> n������ ��ȯ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b, c, d, e, f;
		//b = ��ȯ�� ����, c = �Է��� 10����, e = �ش� ������ �� �ڸ����� ����� �迭�� ������
		char a[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
		//16������ ǥ�� �ϱ� ���� A~F������ ���ڸ� �߰���
		
		System.out.print("��ȯ�� ������ �Է��� �ּ��� : ");
		b = sc.nextInt();
		System.out.print("�����ϱ� ���� 10���� ���ڸ� �Է��ϼ��� : ");
		c = sc.nextInt();
		
		d = 1;
		while (d <= c)
			d *= b;
		while (true)
		{
			if (d > 1)
				d /= b;
			e = c / d;
			f = c - e * d;
			System.out.printf("%c", a[e]);
			if (d != 1)
				c = f;
			else
				break;
		}
		sc.close();
	}
}
