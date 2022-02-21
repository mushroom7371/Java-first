package certificate;

import java.util.Scanner;

class Section043_array_emptyRight {
	//오른쪽에 빈 삼각형 모양 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, m, k, i, j, L;
		//x = 배열의 크기, m = 배열의 중간 행 번호, k = 1씩 저장될 수, i = 배열의 행의 위치, j = 배열의 열의 위치, L = 행에서 숫자를 입력할 열의 끝 위치
		x = sc.nextInt();	//키보드로 입력받은 정수를 x에 저장
		
		int [][] a = new int[x][x];	//크기가 x인 2차원 배열 생성
		k = 0;	//배열에 저장될 데이터 초기화
		m = x / 2;	//크기를 2로 나눠 배열의 중간위치를 의미(정수를 나눴을때 나머지는 버린다)
		
		for (i = 0; i <= x - 1; i++) {	//첫번째 배열을 크기-1 만큼 반복시행한다.
			if (i < m)	//중간행 이전이라면
				L = x - i;	//두번째 배열에서 데이터가 저장될 마지막 위치를 크기 -i로 설정한다.
			else		//중간행 보다 크거나 같다면
				L = i + 1;	//마지막 위치를 다시 1씩 더해준다.
			for (j = 0; j <= L - 1; j++) {	//배열의 마지막 위치까지 반복시행
				k++;	//저장될 데이터가 1씩 증가한다.
				a[i][j] = k;	//해당 위치에 데이터 저장
			}
		}
		for (int y = 0; y < x; y++) {	//출력용 반복문
			for (int z = 0; z < x; z++)
				System.out.printf("%3d", a[y][z]);
			System.out.printf("\n");
		}
		sc.close();
	}

}
