package certificate;

import java.util.Scanner;

class Section032_sort_bubble2 {
	//버블정렬 for문
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		//n = 입력받은 숫자의 갯수, k = 치환에 사용할 임시변수
		int [] data = new int[10];
		//정렬할 숫자가 저장될 배열
		n = -1;
		do {
			n++;	//0번지부터 9번지까지 총 10개의 숫자가 배열에 저장됨
			data[n] = sc.nextInt();	//키보드로 입력받은 숫자가 저장됨
		} while (n < 9);
		for (int i = 1; i <= 9; i++) {	//버블정렬의 마지막 번지의 숫자는 이미 가장 큰 수이므로 해당 번지수를 제외하고 치환을 실시하기 위함.
			for (int j = 0; j <= 9 - i; j++) {	//위의 i의 크기만큼 빼는 이유는 마지막수는 비교할 필요가 없기 때문
				if (data[j] > data[j + 1]) {	//배열에 저장된 2개의 데이터를 비교하여 치환 작업을 실시함.
					k = data[j];
					data[j] = data[j + 1];
					data[j + 1] = k;
				}
			}
		}
		for (int x = 0; x < 10; x++)	//단순 출력용 반복
			System.out.printf("%d ", data[x]);
		sc.close();

	}

}
