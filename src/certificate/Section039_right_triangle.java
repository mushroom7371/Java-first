package certificate;

class Section039_right_triangle {
	//2차원 배열을 통한 직각 삼각형 표현

	public static void main(String[] args) {
		int i, j, k;
		//i = 첫번째 배열의 데이터를 저장하기 위한 번지수 변수, j = 두 번째 배열의 데이터를 저장하기 위한 번지수 변수
		int a[][] = new int[5][5];
		//2차원 배열 선언 및 크기 설정. 참조변수 a는 1차원 배열을 가리키고 그 배열의 각 번지수가 다시 각각 다른 크기 5의 배열을 가리킨다.
		k = 0;	//배열에 저장할 데이터
		
		for (i = 0; i <= 4; i++) {	//배열의 크기 만큼 반복
			for (j = 0; j <= i; j++) {	//j <= i으로 인하여 마치 왼쪽으로 쏠린 형태로 데이터가 배열에 저장된다.
				k++;
				a[i][j] = k;
			}
		}
		for (int x = 0; x <= 4; x++) {	//출력용 반복문
			for (int y = 0; y <= 4; y++)
				System.out.printf("%3d", a[x][y]);
			System.out.printf("\n");
		}
	}

}
