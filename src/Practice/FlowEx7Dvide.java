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

		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		System.out.println("당신은 "+ user + "입니다.");
		
		return user;

	}

	static int inputMethod2(int com) {

		Scanner scanner = new Scanner(System.in);
		com = (int)(Math.random()*3) + 1;
		
		System.out.println("컴은 "+ com + "입니다.");
		
		return com;
	}

	static void switchMethod(int user,int com)	{
		switch(user-com)	{
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}
}

/*
inputMethod();
System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.");

Scanner scanner = new Scanner(System.in);
int user = scanner.nextInt();
int com = (int)(Math.random()*3) + 1;

System.out.println("당신은 "+ user + "입니다.");
System.out.println("컴은 "+ com + "입니다.");

switchMethod();
switch(user-com)	{
case 2: case -1:
	System.out.println("당신이 졌습니다.");
	break;
case 1: case -2:
	System.out.println("당신이 이겼습니다.");
	break;
case 0:
	System.out.println("비겼습니다.");
	break;
}

}
 */
