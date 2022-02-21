package certificate;

class Section047_diagonal {
	//대각선으로 배열 채우기
	public static void main(String[] args) {
		int i, j, k;
		//i = 바깥쪽 반복문의 반복변수, j = 안쪽 반복문의 반복 변수, k = 배열의 위치
		int a[][] = new int[5][5];
		//크기가 각각 5인 2차원 배열을 생성한다.
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
