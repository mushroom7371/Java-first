package AlgorithmStudy;

import java.util.Scanner;

public class SumWhile {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� �Է� ���� �������� ���� ���մϴ�.");
		System.out.print("�Է� �Ͻ� ���� : ");
		System.out.println();
		
		int n = sc.nextInt();
		
		int sum = 0;	//�հ踦 �����ϱ� ���� ���� ���� �� �ʱ�ȭ
		int i = 1;	//�ݺ����� ������ ���� ������ �ʱⰪ
		
		while(i <= n) {	//  ���ǽ� nextInt�� �Է¹��� ������ �ݺ��� ������.
			sum = sum + i;	//�հ迡 i�� ���Ѵ�.
			i++;	//i�� ���� 1���� ��Ű�� �ٽ� �ݺ��� ������ �հ踦 ���Ѵ�.
		}
		
		System.out.println("1���� ���� �Է��Ͻ� �������� �� ���� : " + sum + " �Դϴ�.");
	}
}
