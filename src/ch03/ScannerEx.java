package ch03;

import java.util.Scanner;

	public class ScannerEx {
		public static void main(String[] args)	{
			Scanner Scanner = new Scanner(System.in);
			
			System.out.print("ù��° ������ �Է����ּ���.>");
			String input = Scanner.nextLine();
			int num1 = Integer.parseInt(input);
				
			System.out.println("�Է³��� :"+input);
			System.out.printf("num1=%d%n", num1);
			
			System.out.print("�ι�° ������ �Է����ּ���.>");
			String input1 = Scanner.nextLine();
			int num2 = Integer.parseInt(input1);
				
			System.out.println("�Է³��� :"+input1);
			System.out.printf("num2=%d%n", num2);
		}
	}