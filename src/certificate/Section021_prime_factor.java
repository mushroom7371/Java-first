package certificate;

import java.util.Scanner;

class Section021_prime_factor {
	//���μ� �����ϱ�
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int b, c, d, e, mok = 0, nmg;
		//b = �Է¹��� ��, c = ���μ��� ������ �迭�� ��ġ, d = ������ ����� ���� 2���� ����, e = �Է¹��� ���� �������� ����� ����, mok = ��, nmg = ������
		
		int a[] = new int[100];
		b = sc.nextInt();
		
		c = -1;	//�迭�� �������� 0���� ���� �����̹Ƿ� -1�� �ʱ�ȭ, while������ ���������ڷ� ���Ͽ� 0������ ���۵�.
		d = 2;	//������ ���� 2���� ����
		while (true)
		{
			e = (int)Math.sqrt(b);	//MathŬ������ sqrt()�޼���� �������� ���ϰ�, ����ȯ �Ͽ� ������ ����
			while (true)
			{
				if (d > e)
				{
					d = b;
					break;
				}
				
				mok = b / d;	//��� �������� ���ϴ� ������ ����
				nmg = b - mok*d;
				
				if (nmg == 0)
					break;
				else
					d++;
			}
			
			c++;
			a[c] = d;
			if (b == d)
				break;
			b = mok;
		}
		for (int i = 0; i <= c; i++)
			System.out.printf("%d ", a[i]);
		sc.close();
	}
}
