package certificate;

import java.util.Scanner;

class Section016_prime2 {
	//나누어 떨어질때 소수 구하기
	public static void main(String[] args) {
		System.out.println("판별할 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 2;	//나누는 수는 2부터 시작
		
		while(i % j != 0) {	//입력받은 숫자 i를 j로 나눴을 때 나머지가 0이 아니라면 소수일 가능성이 있음
			j++;			//j를 1증가하여 다시 반복문을 반복	
		}
		
		//whlie문의 조건식이 거짓이 될 경우 빠져나와 아래의 내용을 실시함(즉, 나눠서 0이 된 경우)
		if( i == j) {	//그 값이 입력받은 수와 같은 수 라면
				System.out.println("소수입니다.");
		}else {			//같지 않다면
			System.out.println("소수가 아닙니다.");
		}
	
	}
}
