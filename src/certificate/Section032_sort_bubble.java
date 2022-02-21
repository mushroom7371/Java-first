package certificate;

import java.util.Scanner;

class Section032_sort_bubble {
	//버블 정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, k;
		//n = 입력받은 숫자의 갯수, i = 정렬 회전 수, j = 각 회전에서의 비교 횟수 및 배열의 위치, k = 두 값을 교환 할때 사용할 임시변수
		int data[] = new int[10];
		//정렬할 숫자를 저장할 배열
		n = -1;	//배열의 시작은 0번지 부터이므로 하단의 do 문장에서 ++연산자를 사용할 예정으로 -1로 초기화.
		System.out.println("정렬할 숫자 10개를 임의로 입력하세요.");
		
		do {	//입력받은 숫자를  0~9번지 까지 배열에 저장
			n++;
			data[n] = sc.nextInt();
		} while (n < 9);	//9 보다 작을때 까지 반복의 이유는 n이 8일 경우 위의 ++연산자로 9번지가 되기 때문이다.
		
		i = 0;
		
		do {
			i++;	//첫 시작이 1부터인 이유는 정렬이 완료된 수를 빼고 비교하기 위함이다. 하단에 이어 설명
			j = -1;	//비교는 0번지부터 할것이기 때문
			
			do {
				j++;	//처음 비교는 0번지부터 시작
				if (data[j] > data[j + 1]) {	//해당 번지와 그 다음 번지의 데이터를 비교하여 치환 작업을 실시
					k = data[j];				//k에는 j번지의 데이터를 저장
					data[j] = data[j+1];		//j번지에는 j+1번지의 데이터를 저장
					data[j+1] = k;				//j+1번지에는 k의 값(기존 j번지의 데이터)를 저장함.
				}
			} while (j < 9 - i);	//위의 변수 i가 1부터 시작하는 이유, j는 배열의 크기에서 i를 뺀 크기만큼 반복하는데 이는 버블 정렬로 인하여 반복 회차마다 마지막 번지의 수가 최댓값이 될것이기 때문
			
		} while (i < 9);	//i가 8이 된다면 배열의 0번지와 1번지의 숫자만 비교하게 된다.
		for (int x = 0; x <= 9; x++)	//정렬이 완료된 배열의 내부 데이터를 순차적으로 출력
			System.out.printf("%d ", data[x]);
		sc.close();
	}

}
