package certificate;

import java.util.Scanner;

class Section033_sort_insert {
	//삽입정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, i, k, key;
		//j = 입력받은 숫자의 갯수, i = 정렬 회전수, Key값의 위치를 지정해 주는 변수, k = 비교 대상이 있는 위치를 지정해주는 변수, key = 비교기준인 Key값이 저장될 변수
		int [] a = new int[10]; //정렬할 숫자가 저장될 배열
		j = -1;	//배열의 저장은 0번지부터 시작하므로 -1로 선언
		
		do {
			j++;	//반복 시작이 0번지 부터 저장됨
			a[j] = sc.nextInt();
		} while (j < 9);	//j가 8이 될때까지 반복, j가 8이된다는 말은 do문장의 j++로 인하여 9번지의 자리에 저장되므로 8번지까지가 아니다.
		for (i = 1; i <= 9; i++) {	//key값을 앞뒤로 비교하기 위해 1번지의 데이터를 가지고 시작함
			key = a[i];
			for (k = i - 1; k >= 0; k--) {
				if (a[k] > key)
					a[k + 1] = a[k];
				else
					break;
			}
			a[k + 1] = key;
		}
		for (i = 0; i <= 9; i++)
			System.out.printf("%d ", a[i]);
		sc.close();

	}

}
