package ch04;

	import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		/*���� ����
		 * 4�� ���� �������� ��
		 * �� �� 100�� ���� �������� �ʴ� ��
		 * 400���� ���� �������� ��
		*/	
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ش� ������ �����ϼ���.");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		if(num%4 == 0 && num%100 != 0 || num%400 == 0) {System.out.println("���� �Դϴ�.");}
		else	{System.out.println("������ �ƴմϴ�.");}
		
		}

	}

