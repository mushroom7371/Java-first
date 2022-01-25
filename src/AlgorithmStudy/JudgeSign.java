package AlgorithmStudy;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하세요.");
		
		int a = sc.nextInt();
		
		if( a > 0) {
			System.out.println("이 수는 양수 입니다.");
		}else if( a < 0) {
			System.out.println("이 수는 음수 입니다.");
		}else
			System.out.println("이 수는 0 입니다.");
	}
	
}
