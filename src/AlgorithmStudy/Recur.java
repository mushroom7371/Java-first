package AlgorithmStudy;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {	//static 메서드로 인하여 객체 생성없이 메인메서드에서 사용가능
		if(n > 0) {	//입력받은 매개변수가 0보다 크다면
			recur(n - 1);	//다시 자기 자신의 메서드를 호출하되 매개변수의 값을 -1 하여 입력
			System.out.println(n);	//위의 메서드가 선행되어야 비로소 실행된다.
			recur(n - 2);
		}
	}
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		recur(x);
	}
}
