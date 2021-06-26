package AlgorithmStudy;

import java.util.Scanner;

public class EuclidGCD {
	//�� �ڿ����� ����� ����� ���� ū ���� ���ϴ� Ŭ����
	static int gcd(int x, int y) {	//static���� ���Ͽ� Ŭ������ �޸𸮿� ����ɶ� �޼��尡 �����ȴ�.(��ü���� ��밡��)
		if(y == 0)
			return x;
		//�ι�° �Ű������� 0�� �Ǹ� ù��° �Ű������� ��ȯ�Ѵ�.
		else
			return gcd(y, x%y);
		//�ٽ� �ڱ� �ڽ��� �޼��带 ȣ���Ͽ� �ִ� ������� ���Ѵ�
//		���� ��� x = 22, y = 8 �϶�
//		8 , 22%8 = 6
//		6 , 8%6 = 2
//		2 , 2%6 = 2
//		2 , 2%2 = 0
//		y == 0 �̹Ƿ� 2�� ��ȯ�ϰ� �ȴ� �� 2�� 22�� 8�� �ִ����� �̴�.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("ù��° ������ �Է��ϼ���. : ");
		int x = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���. : ");
		int y = sc.nextInt();
		
		System.out.println("�ִ� ������� : " + gcd(x,y) + " �Դϴ�.");
	}
}
