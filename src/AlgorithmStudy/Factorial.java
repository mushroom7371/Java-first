package AlgorithmStudy;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		//static 메서드로 클래스에 메모리가 적재될때 생성된다.
		if(n > 0)	//매개변수로 받은 n의 값이 0보다 크다면
			return n * factorial(n - 1);
			//n*(n-1)*(n-1-1)*(n-1-1-1)*...1 로 계속하여 자기 자신의 메서드를 호출한 결과를 곱하여 반환한다.
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int x = sc.nextInt();
		
		System.out.println(x + " 의 팩토리얼은 " + factorial(x) + " 입니다.");
	}
}
