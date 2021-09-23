package certificate;

import java.util.Scanner;

class Section034_type1 {
	//석차구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, j;
		//m = 입력받은 점수의 갯수(입력시), n = 입력받은 점수의 갯수(석차 반복시), i = 회전 수 석차 점수의 위치, j = 회전에서의 비교 횟수
		int jumsu[] = new int[10];	//점수가 저장될 배열
		int rank[] = new int[10];	//석차가 저장될 배열
		m = -1;	//배열 저장시 0번지부터 반복하도록 -1로 초기화
		
		do {
			m++;	//0번지부터 시작
			jumsu[m] = sc.nextInt();
		} while (m < 9);	//m이 8이 되었을 시 ++연산자로 9번지에 저장됨
		
		n = 9;
		i = 0;
		
		while (i <= n) {	//배열에 각 번지마다 값으로 1,2,3...,9까지의 석차를 저장
			rank[i] = 1;
			i++;
		}
		
		i = 0;	//반목분에서 사용할 변수 초기화
		
		while (i <= n) {	//i가 0부터 9번지까지 반복
			j = 0;
			while (j <= n) {	//j가 9보다 작을때 까지 반복
				if (jumsu[i] < jumsu[j])	//jumsu[]배열의 i번지의 값이 j번지의 값보다 작다면
					rank[i]++;	//rank[] 배열의 i번지의 값을 1 증가 한다.	즉, 점수가 더 큰 값이 있다면 석차는 1개씩 늘어나게 된다.
				j++;	//if문과 상관없이 j는 1 증가후 다시 반복을 실시한다.
			}
			i++;	//i도 1증가
		}
		
		for (int x = 0; x < 10; x++)
			System.out.printf("%d ", jumsu[x]);
		System.out.printf("\n");
		for (int x = 0; x < 10; x++)
			System.out.printf("%d ", rank[x]);
		sc.close();
	}

}
