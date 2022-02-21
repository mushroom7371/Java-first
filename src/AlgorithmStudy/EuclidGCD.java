package AlgorithmStudy;

import java.util.Scanner;

public class EuclidGCD {
	//두 자연수의 공통된 약수중 가장 큰 수를 구하는 클래스
	static int gcd(int x, int y) {	//static으로 인하여 클래스가 메모리에 적재될때 메서드가 생성된다.(객체없이 사용가능)
		if(y == 0)
			return x;
		//두번째 매개변수가 0이 되면 첫번째 매개변수를 반환한다.
		else
			return gcd(y, x%y);
		//다시 자기 자신의 메서드를 호출하여 최대 공약수를 구한다
//		예를 들어 x = 22, y = 8 일때
//		8 , 22%8 = 6
//		6 , 8%6 = 2
//		2 , 2%6 = 2
//		2 , 2%2 = 0
//		y == 0 이므로 2를 반환하게 된다 즉 2가 22와 8의 최대공약수 이다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("첫번째 정수를 입력하세요. : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요. : ");
		int y = sc.nextInt();
		
		System.out.println("최대 공약수는 : " + gcd(x,y) + " 입니다.");
	}
}
