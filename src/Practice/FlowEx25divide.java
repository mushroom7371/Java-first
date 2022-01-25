package Practice;

import java.util.*;

public class FlowEx25divide {

	public static void main(String[] args) {

		int num = 0, sum = 0, tmp = 0;
		num = inputMethod(num);
		sumMethod(num, sum);
	}

	static int inputMethod(int num){
		System.out.println("숫자를 입력하세요. -> ");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		return num;
	}


	static void sumMethod(int num, int sum) {
		while(num != 0) {
			sum = sum + num%10;
			System.out.printf("sum = %3d num = %d%n",sum, num);
			num = num/10;

		}

		System.out.print("각 자리수의 합 : " + sum);
	}

}
