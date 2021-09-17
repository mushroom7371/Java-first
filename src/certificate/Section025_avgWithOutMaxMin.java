package certificate;

import java.util.Scanner;

class Section025_avgWithOutMaxMin {
	//최댓값과 최소값을 제외한 평균 구하기
	public static void main(String[] args) {
		int i, hap, max, min, avg, m;
		//i = 저장된 배열의 번지, hap = 숫자들의 합, max = 최댓값, min = 최솟값, avg = 평균, m = 저장할 배열의 번지수
		int [] a = new int[7];	//숫자를 저장할 배열 선언 및 크기 설정
		Scanner sc = new Scanner(System.in);
		m = -1;	//배열은 0번지 부터 시작하기에 -1로 선언
		
		System.out.println("평균을 구할 숫자 7개를 입력하세요.");
		
		do {
			m++;
			a[m] = sc.nextInt();
		}while(m < 6);	//0~6번지의 데이터를 저장하도록 7번 반복한다.
		
		min = a[0];
		max = a[0];
		hap = 0;
		i = 0;
		
		while(i < 6) {
			i++;
			hap += a[i];	//각 번지수에 저장된 데이터를 반복하며 변수 hap에 더한다.
			if(a[i] > max) {	//해당 번지수의 데이터가 max의 값보다 크다면 그 값을 변수 max에 저장
				max = a[i];
			}
			if(a[i] < min) {	//해당 번지수의 데이터가 min의 값보다 작다면 그 값을 변수 min에 저장
				min = a[i];
			}
		}
		
		hap = hap - min - max;	//hap에는 배열의 데이터 전부가 담겨있으므로 최댓값, 최솟값을 뺀다.
		avg = hap/5;	//나머지 값들을 5로 나눠 평균값을 구한다.
		
		
		System.out.println("최댓값은 : " + max + " 입니다.");
		System.out.println("최솟값은 : " + min + " 입니다.");
		System.out.println("입력하신 숫자들에서 최댓값,최솟값을 제외한 나머지 수의 평균은 : " + avg + " 입니다.");
	}

}
