package certificate;

import java.util.Scanner;

class Section022 {
	//���� ��ȯ 10���� -> 2����
	public static void main(String[] args) {
		System.out.print("��ȯ�� 10������ �Է��ϼ���. : ");
		Scanner sc = new Scanner(System.in);
		int b, bb, c, mok, nmg, i;
		//b = �Է¹��� 10����, bb = 10���� ��¿� ����, c = �迭�� ��ġ�� ������ ����, mok = ��, nmg = ������, i = �迭 ��½� ��ġ
		int a[] = new int[10];
		//��ȯ �� 2������ ��� �迭�� ����
		
		b = sc.nextInt();
		bb = b;
		//�Է¹��� ���� bb�� �����Ѵ�.
		c = -1;
		//�迭�� ��ġ�� 0�������� �����ϱ⿡ �ʱ⿡ -1�� �����ϰ� �ϴ��� do-while ���� ���۽� ++�����ڷ� 0���� ����
		do
		{
			c++;
			mok = b / 2;
			//2�������� ��ȯ�Ϸ� �ϱ⿡ 2�� ������. intŸ���̹Ƿ� �Ҽ����� �ڵ����� ��������.
			nmg = b - mok * 2;
			//�������� ���ϱ� ���ؤ� 10�������� ��*2�� �Ͽ� ����.
			a[c] = nmg;
			//�迭�� 0������ �������� �����Ѵ�.
			b = mok;
			//���� �ݺ������� ���� �ٽ� ����b�� �����Ѵ�.
		} while (mok != 0);	
		//���� 0�� �ƴ϶�� ���� ��ȯ�� ���Ǿ��⿡ �ٽ� do�������� �ö� �ݺ� �Ѵ�.
		System.out.printf("������ %d �� 2������ ", bb);
		for (i = c; i >= 0; i--)
			System.out.printf("%d", a[i]);
		System.out.println(" �Դϴ�.");
		sc.close();
	}

}
