package ch04;

	import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		/*윤년 조건
		 * 4로 나눠 떨어지는 해
		 * 그 중 100을 나눠 떨어지지 않는 해
		 * 400으로 나눠 떨어지는 해
		*/	
		Scanner scanner = new Scanner(System.in);
		System.out.println("해당 연도를 선택하세요.");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		if(num%4 == 0 && num%100 != 0 || num%400 == 0) {System.out.println("윤년 입니다.");}
		else	{System.out.println("윤년이 아닙니다.");}
		
		}

	}

