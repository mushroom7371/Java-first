package AlgorithmStudy;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� �ϼ���.");
		
		int a = sc.nextInt();
		
		if( a > 0) {
			System.out.println("�� ���� ��� �Դϴ�.");
		}else if( a < 0) {
			System.out.println("�� ���� ���� �Դϴ�.");
		}else
			System.out.println("�� ���� 0 �Դϴ�.");
	}
	
}
