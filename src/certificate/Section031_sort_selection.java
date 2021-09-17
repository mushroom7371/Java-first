package certificate;

import java.util.Scanner;

class Section031_sort_selection {
	//선택 정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, i, j, k, x;
		//m = 입력받는 숫자가 저장될 변수, i = 정렬 회전수, j = 비교 대상이 있는 위치를 지정할 변수, k = 자료를 교환 할때 사용할 임시 변수, x = 정렬된 숫자 출력시 배열의 위치를 저장할 변수
		int data[] = new int[10];
		//정렬할 숫자가 저장될 변수
		m = -1;
		//배열의 시작은 0번지 이므로 -1로 초기화
		
		System.out.println("정렬할 숫자 10개를 임의로 입력하세요.");
		
		do {	//임의의 숫자 10개를 순차적으로 배열에 저장한다.
			m++;
			data[m] = sc.nextInt();
		} while (m < 9);
		
		i = -1;
		
		do {
			i++;	//정렬할 기준 데이터를 배열의 0번지 데이터 부터 시작한다.
			j = i;	//비교할 번지수를 i와 같게 설정(하단의 do 문장에 ++연산자로 인하여 기준데이터 보다 이후의 번지에 있는 데이터가 지정된다.)
			do {
				j++;	//앞의 기준 번지 데이터 이후의 데이터이다.
				
				if (data[i] > data[j]) {	//데이터 치환을 이용한다. 앞의 값이 뒤의 데이터 보다 크다면
					k = data[i];			//치환을 위해 사용할 임시 변수에 i번지의 데이터를 저장하고,
					data[i] = data[j];		//i번지의 데이터는 j번지의 데이터로,
					data[j] = k;			//j번지의 데이터는 k에 저장된(기존의 i번지에 저장된 데이터이다.) 값으로 대입한다.
				}
			} while (j < 9);	//배열의 크기가 10이므로 마지막인 9번지의 데이터까지 비교를 실시
		} while (i < 8);	//기준 데이터의 번지를 의미하는 i가 8이 되야 하는 이유는 마지막 비교가 9번째 10번째의 데이터이기 때문이다.
		for (x = 0; x <= 9; x++)	//출력용 반복문
			System.out.printf("%d ", data[x]);
		sc.close();
	}
	
}
