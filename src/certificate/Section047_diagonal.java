package certificate;

class Section047_diagonal {
	//�밢������ �迭 ä���
	public static void main(String[] args) {
		int i, j, k;
		//i = �ٱ��� �ݺ����� �ݺ�����, j = ���� �ݺ����� �ݺ� ����, k = �迭�� ��ġ
		int a[][] = new int[5][5];
		//ũ�Ⱑ ���� 5�� 2���� �迭�� �����Ѵ�.
		int L = 0;
		for (i = 0; i <= 8; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				k = i - j;
				if (k < 0) continue;
				if (k > 4) continue;
				L++;
				a[j][k] = L;
			}
		}
		for (int x = 0; x <= 4; x++)
		{
			for (int y = 0; y <= 4; y++)
				System.out.printf("%3d", a[x][y]);
			System.out.printf("\n");
		}

	}

}
