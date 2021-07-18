package AlgorithmStudy;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 정수 입력 : ");
		
		int num = sc.nextInt();
		//원하는 피보나치 수열의 항을 입력받음
		
		int su1, su2, sum;
		//수열을 구하기 위한 변수 선언
		
		su1 = 0;
		su2 = 1;
		sum = 1;
		
		for(int i = 0; i < num; i++) {
			System.out.print(sum + " ");
			sum = su1 + su2;
			su1 = su2;
			su2 = sum;
			//첫번째 항과 두번째항을 고정한 후 밀어내기 식으로 피보나치 수열을 구한다.
		}
	}
}
