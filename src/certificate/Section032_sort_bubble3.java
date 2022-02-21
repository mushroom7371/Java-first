package certificate;

import java.util.Scanner;

class Section032_sort_bubble3 {
	//버블 정렬 중간종료
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sw, cnt, k;
		//n = 입력받은 숫자의 갯수, sw = 자료교환 여부를 판단할 스위치 변수, cnt = 자료 교환 횟수, k = 치환을 위한 변수
		int [] data = new int[10];
		//정렬할 숫자가 저장될 배열
		
		n = -1;	//0~9까지의 번지수에 저장하기 위해 -1로 초기화
		
		do {
			n++;	//n은 0번지 부터 시작함
			data[n] = sc.nextInt();
		} while (n < 9);
		
		cnt = 0;	//변환이 이뤄지지 않은 상태 0으로 초기화
		
		for (int i = 1; i <= 9; i++) {
			sw = 0;	//스위치 변수는 0과 1 두가지의 경우로 판단 반복을 시작할 때 마다 0으로 초기화 된다.
			for (int j = 0; j <= (9 - i); j++) {	//기존은 버블정렬의 원리와 같음
				if (data[j] > data[j + 1]) {	//비교시 큰 데이터를 뒤로 옮기는 치환
					k = data[j];
					data[j] = data[j + 1];
					data[j + 1] = k;
					cnt++;	//한번의 교환이 이뤄지면 교환 횟수가 추가 된다.
					sw = 1;	//여기 까지 내려왔다는 것은 교환이 이뤄졌다는 의미.
							//만약 교환이 되지 않았다면 여기까지 내려오지 않았고 sw변수는 0으로 초기화 된 상태일 것이다.
				}
			}
			if (sw == 0)	//교환이 되지 않은 상태가 참이라면, 더이상의 반복없이 최상위 for문을 빠져나온다.
				break;
		}
		
		System.out.printf("%d ", cnt);	//출력
		for (int x = 0; x <= 9; x++)
			System.out.printf("%d ", data[x]);
		sc.close();

	}

}
