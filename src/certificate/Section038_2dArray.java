package certificate;

class Section038_2dArray {
	//2차원 배열 숫자 순서도
	public static void main(String[] args) {
		int i, j, k;
		//i = 첫번째 배열의 데이터를 저장하기 위한 번지수 변수, j = 두 번째 배열의 데이터를 저장하기 위한 번지수 변수
		int [][] a = new int[5][5];
		//2차원 배열 선언 및 크기 설정. 참조변수 a는 1차원 배열을 가리키고 그 배열의 각 번지수가 다시 각각 다른 크기 5의 배열을 가리킨다.
		k = 0; //배열의 위치마다 데이터를 저장할 변수
		
		for (i = 0; i <= 4; i++) {	//0~4까지 반복 첫 번째 배열의 번지수를 의미
			for (j = 0; j <= 4; j++) {	//0~4까지 반복 두 번째 배열의 번지수를 의미
				k++;	//1부터 시작된다.
				a[i][j] = k;	//정확한 표현은 아니지만, 1행1열 = 1, 1행2열 = 2 ... , 5행 5열 = 25까지 저장된다.
			}
		}
		for (int x = 0; x <= 4; x++) {	//출력을 위한 반복문
			for (int y = 0; y <= 4; y++)
				System.out.printf("%3d", a[x][y]);
			System.out.printf("\n");
		}
	}

}
