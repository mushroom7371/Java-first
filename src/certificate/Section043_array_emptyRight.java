package certificate;

import java.util.Scanner;

class Section043_array_emptyRight {
	//�����ʿ� �� �ﰢ�� ��� �����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, m, k, i, j, L;
		//x = �迭�� ũ��, m = �迭�� �߰� �� ��ȣ, k = 1�� ����� ��, i = �迭�� ���� ��ġ, j = �迭�� ���� ��ġ, L = �࿡�� ���ڸ� �Է��� ���� �� ��ġ
		x = sc.nextInt();	//Ű����� �Է¹��� ������ x�� ����
		
		int [][] a = new int[x][x];	//ũ�Ⱑ x�� 2���� �迭 ����
		k = 0;	//�迭�� ����� ������ �ʱ�ȭ
		m = x / 2;	//ũ�⸦ 2�� ���� �迭�� �߰���ġ�� �ǹ�(������ �������� �������� ������)
		
		for (i = 0; i <= x - 1; i++) {	//ù��° �迭�� ũ��-1 ��ŭ �ݺ������Ѵ�.
			if (i < m)	//�߰��� �����̶��
				L = x - i;	//�ι�° �迭���� �����Ͱ� ����� ������ ��ġ�� ũ�� -i�� �����Ѵ�.
			else		//�߰��� ���� ũ�ų� ���ٸ�
				L = i + 1;	//������ ��ġ�� �ٽ� 1�� �����ش�.
			for (j = 0; j <= L - 1; j++) {	//�迭�� ������ ��ġ���� �ݺ�����
				k++;	//����� �����Ͱ� 1�� �����Ѵ�.
				a[i][j] = k;	//�ش� ��ġ�� ������ ����
			}
		}
		for (int y = 0; y < x; y++) {	//��¿� �ݺ���
			for (int z = 0; z < x; z++)
				System.out.printf("%3d", a[y][z]);
			System.out.printf("\n");
		}
		sc.close();
	}

}
