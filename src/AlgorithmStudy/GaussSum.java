package AlgorithmStudy;

import java.util.Scanner;

public class GaussSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요.");
		int n = sc.nextInt();
		
		int sum = (n * (n + 1))/2;

	
		System.out.println("1에서 n까지의 합은 : " + sum);

	}

}
