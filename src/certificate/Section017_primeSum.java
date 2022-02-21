package certificate;

import java.util.Scanner;

class Section017_primeSum {
	//1부터 입력받은 수 까지 소수를 판별하여 더하기
	public static void main(String[] args) {
		System.out.println("소수의 합을 구할 범위 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int a, hap, k, j;	//a = 범위, hap = 소수의 합, k = 범위안의 소수들, j = 나눌수
		a = sc.nextInt();
		hap = 0;
		k = 2;	//1은 소수로 판단하지 않기에 2부터 시작
		
		while(true) {	//break문을 만나기 전까지 무한반복
			j = 2;	//나누는 수 또한 2부터 시작
			
			while(k % j != 0) {	//범위 안의 숫자 k가 j로 나눴을때 나머지가 0이 아니면 소수일 가능성이 있음
				j++;	//j를 1 증가시켜 주고 나눴을때 0이 될때 까지 반복한다.
			}
			
			if( k == j) {	//k가 j와 같아진다면 소수이므로 합을 저장할 변수 hap에 k를 더한다.	같지 않다면 아무것도 안함
				hap += k;
			}
			
			if(k < a) {	//k는 범위안의 숫자이므로 입력받은 범위 수인 a보다 작다면 1증가 시켜 상단의 while문으로 돌아가 반복을 시작한다.
				k++;
			}else {
				System.out.println("소수의 합은 : " + hap);
				break;
			}
		}
		
	}

}
