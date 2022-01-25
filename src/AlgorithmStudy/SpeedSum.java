package AlgorithmStudy;

import java.util.Scanner;

public class SpeedSum {
	public static void main(String[] args) {
		//1 ~ n번째 수까지의 합계 구하기
		
		long n;
		long sum = 0;
		
		System.out.print("n번째 수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		
//		for(long i = 1; i <= n; i++) { sum = sum + i; }
//		반복문을 이용하여 변수 sum에 하나하나 더하고 결과값을 출력해도 되지만 반복작업으로 비효율적임
				
		sum = n * (n + 1) / 2;
		//1~n까지의 합계는 가우스 덧셈을 통해 반복하지 않고 구할 수 있음, 불필요한 반복이 없기에 효율적

		System.out.println(sum);
	}
}
