package certificate;

import java.util.Scanner;

class Section034_type1 {
	//�������ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, j;
		//m = �Է¹��� ������ ����(�Է½�), n = �Է¹��� ������ ����(���� �ݺ���), i = ȸ�� �� ���� ������ ��ġ, j = ȸ�������� �� Ƚ��
		int jumsu[] = new int[10];	//������ ����� �迭
		int rank[] = new int[10];	//������ ����� �迭
		m = -1;	//�迭 ����� 0�������� �ݺ��ϵ��� -1�� �ʱ�ȭ
		
		do {
			m++;	//0�������� ����
			jumsu[m] = sc.nextInt();
		} while (m < 9);	//m�� 8�� �Ǿ��� �� ++�����ڷ� 9������ �����
		
		n = 9;
		i = 0;
		
		while (i <= n) {	//�迭�� �� �������� ������ 1,2,3...,9������ ������ ����
			rank[i] = 1;
			i++;
		}
		
		i = 0;	//�ݸ�п��� ����� ���� �ʱ�ȭ
		
		while (i <= n) {	//i�� 0���� 9�������� �ݺ�
			j = 0;
			while (j <= n) {	//j�� 9���� ������ ���� �ݺ�
				if (jumsu[i] < jumsu[j])	//jumsu[]�迭�� i������ ���� j������ ������ �۴ٸ�
					rank[i]++;	//rank[] �迭�� i������ ���� 1 ���� �Ѵ�.	��, ������ �� ū ���� �ִٸ� ������ 1���� �þ�� �ȴ�.
				j++;	//if���� ������� j�� 1 ������ �ٽ� �ݺ��� �ǽ��Ѵ�.
			}
			i++;	//i�� 1����
		}
		
		for (int x = 0; x < 10; x++)
			System.out.printf("%d ", jumsu[x]);
		System.out.printf("\n");
		for (int x = 0; x < 10; x++)
			System.out.printf("%d ", rank[x]);
		sc.close();
	}

}
