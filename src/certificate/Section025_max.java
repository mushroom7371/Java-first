package certificate;

import java.util.Scanner;

class Section025_max {
	//최댓값 구하기
	public static void main(String[] args) {
		int [] a = new int[10];	//입력받을 숫자를 저장할 배열
		int j = -1, max = 0;	//최댓값을 저장할 변수 max와 입력받을 수의 번지수(배열 0번지부터 저장되므로 -1로 초기화)
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10개를 입력해 주세요.");
		
		do {
			j++;	//첫번재 배열의 시작은 0번지부터이다.
			a[j] = sc.nextInt();	//해당 번지수에 저장될 값은 키보드로 부터입력받은 정수값이다.
		}while(j < 9);
		
		for(int i = 0; i <= 9; i++) {
			if(a[i] > max){	//해당 번지의 데이터 값이 max보다 크다면 그 값을 max에 저장함.
				max = a[i];
			}
		}
		
		System.out.println("해당 숫자들의 최댓값은 : " + max + " 입니다.");
	}

}
