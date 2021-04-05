package Practice;

import java.util.*;

public class FlowEx7Dvide {

	public static void main(String[] args) {

		int user = 0;
		int com = 0;
		user = inputMethod1(user);
		com = inputMethod2(com);
		switchMethod(user,com);
	}

	static int inputMethod1(int user) {

		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		System.out.println("����� "+ user + "�Դϴ�.");
		
		return user;

	}

	static int inputMethod2(int com) {

		Scanner scanner = new Scanner(System.in);
		com = (int)(Math.random()*3) + 1;
		
		System.out.println("���� "+ com + "�Դϴ�.");
		
		return com;
	}

	static void switchMethod(int user,int com)	{
		switch(user-com)	{
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}
	}
}

/*
inputMethod();
System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���.");

Scanner scanner = new Scanner(System.in);
int user = scanner.nextInt();
int com = (int)(Math.random()*3) + 1;

System.out.println("����� "+ user + "�Դϴ�.");
System.out.println("���� "+ com + "�Դϴ�.");

switchMethod();
switch(user-com)	{
case 2: case -1:
	System.out.println("����� �����ϴ�.");
	break;
case 1: case -2:
	System.out.println("����� �̰���ϴ�.");
	break;
case 0:
	System.out.println("�����ϴ�.");
	break;
}

}
 */
