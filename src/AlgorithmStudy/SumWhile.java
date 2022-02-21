package AlgorithmStudy;

import java.util.Scanner;

public class SumWhile {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1에서 입력 받은 수까지의 합을 구합니다.");
		System.out.print("입력 하신 수는 : ");
		System.out.println();
		
		int n = sc.nextInt();
		
		int sum = 0;	//합계를 저장하기 위한 변수 선언 및 초기화
		int i = 1;	//반복문을 돌리기 위해 선언한 초기값
		
		while(i <= n) {	//  조건식 nextInt로 입력받은 수까지 반복을 돌린다.
			sum = sum + i;	//합계에 i를 더한다.
			i++;	//i의 값을 1증가 시키고 다시 반복을 돌리며 합계를 구한다.
		}
		
		System.out.println("1에서 부터 입력하신 수까지의 총 합은 : " + sum + " 입니다.");
	}
}
