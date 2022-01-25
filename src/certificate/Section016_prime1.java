package certificate;

import java.util.Scanner;

class Section016_prime1 {
	//나누어 떨어지지 않을때 소수 구하기
	public static void main(String[] args) {
		System.out.println("소수판별기... 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = a - 1;
		int j = 2;
		
		while(true) {
			if(j <= i) {
				if(a % j == 0) {
					System.out.println("소수 아님");
					break;
				}else {
					j++;
				}
			}else {
				System.out.println("소수임");
				break;
			}
		}
	}

}
