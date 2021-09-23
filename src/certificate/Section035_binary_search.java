package certificate;

import java.util.Scanner;

class Section035_binary_search {
	//이분 검색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, L, h, m;
		//j = 입력 받은 찾을 값이 저장될 변수, L = 검색 범위의 시작위치, h = 검색 범위의 마지막 위치, m = 검색 범위의 중간 위치
		int data[] = { 8,15,35,55,60,61,70,80,92,99 };	//배열의 임의의 숫자 10개가 저장되어 있다고 가정
		
		j = sc.nextInt();
		L = 0;	//배열의 시작 위치 0번지
		h = 9;	//배열의 마지막 위치 9번지
		
		while(true) {	//조건이 참이므로 항상 반복한다. 이때 반복을 종료할 예약어 break가 필요
			if (L <= h) {	//시작위치가 마지막 위치보다 작거나 같을때
				m = (L + h) / 2;	//그 둘의 중간 값을 저장함
				
				if (j == data[m]) {	//입력받은 숫자가 data[m] 번지의 값, 즉 중간 위치의 값과 같다면
					System.out.printf("%d %d", j, m + 1);	//해당 값과 중간 위치 + 1을 출력하고 반복을 종료한다.
					break;
				}
				
				if (j < data[m])	//입력받은 숫자가 중간 위치의 값보다 작다면,
					h = m - 1;		//마지막 위치를 중간값 -1로 저장 후 반복 실시
				else
					L = m + 1;		//아니라면, 시작 위치를 중간값 +1 로 저장 후 반복 실시
			}
			else {	//찾을 값이 없다면 입력받은 숫자를 찾을 수 없다는 메시지를 출력하고 종료한다.
				System.out.printf("%d NOT FOUND", j);
				break;
			}
		}
		sc.close();

	}

}
