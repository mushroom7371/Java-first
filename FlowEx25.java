package ch04;

	import java.util.Scanner;
public class FlowEx25 {
	
	public static void main(String[] args) {
		int num = 0; int sum = 0; int result = 0;
		System.out.println("숫자를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num > 0) {
			result = num%10;
			sum = sum + num%10;
					System.out.printf("sum = %3d num = %5d result = %d%n", sum, num, result);
					num = num/10;
		}

	}

}
