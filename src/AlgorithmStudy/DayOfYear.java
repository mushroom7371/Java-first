package AlgorithmStudy;

import java.util.Scanner;

public class DayOfYear {
	static int [][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	//���� ������ Ȯ���ϱ� ���� ������ �迭�� �����Ͽ� �ʱ�ȭ �Ͽ���.
	//[0]~[1]������ [0]~[11]������ �� ���� �ϼ��� �Է��Ͽ���.
	//static���� ���Ͽ� �޸𸮰� Ŭ������ ����ɶ� �迭�� �����ȴ�.
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		//year�� 4�� ���� �������� 0 �̸鼭 ���ÿ� year�� 100���� ���� �������� 0�� �ƴѰ�� ��
		//�Ǵ� year�� 400 ���� ���� �������� 0�� ���� 1�� �ƴϸ� 0�� ��ȯ�Ѵ�.
	}
	
	static int dayOfYear(int y, int m , int d) {
		int days = d;	//�ϼ��� �����ϱ� ���� ���� ���� �� �Ű������� ���� ������ �ʱ�ȭ
		
		for(int i = 1; i < m; i++)	//1���� �Ű������� ���� m�� �� �������� 1�� �����ϸ鼭 �ݺ�, �� ���� �ϼ��� �̹� d�� �޾ұ� ������ m�� -1��ŭ�� �ݺ��Ѵ�.
			days = days + mdays[isLeap(y)][i - 1];
		//days�� �ϼ��� �����ϴµ� ���� isLeap()�޼���� �ش� �⵵�� �������� ������� Ȯ���� �ش��ϴ� ���� ���ڼ��� �������� �����ϰ�
		//for ���� ���Ͽ� 1�� ���� �Է¹��� ���� ���������� ���� ���ڸ� ���ϴ� �۾��� �ǽ��Ѵ�.
		return days;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	//Ű����κ��� �Է¹��� ���� �����ͷ� ó���ϱ� ���� Scanner Ŭ������ ���� ��ü�� �����Ͽ���.
		int retry;	//�ٽ� �����ϱ� ���� ������ ������ ���� �ʱ�ȭ�� ���� �ʾ� ���� 0�� �����̴�.
		
		System.out.println("�� ���� ��� �ϼ��� ���մϴ�.");
		
		do {// do while �������� �ּ� 1���� do{}���� ������ �����ϰ� �ȴ�.
			System.out.print("�� : "); int year = sc.nextInt();
			System.out.print("�� : "); int month = sc.nextInt();
			System.out.print("�� : "); int day = sc.nextInt();
			//�ش� ��¥�� �Է��Ͽ� ������ �����Ѵ�.
			
			System.out.printf("�� �� %d ��° �Դϴ�./n", dayOfYear(year, month, day));
			//dayOfYear() �޼��带 ���Ͽ� Ű����� �Է� ���� �����͸� �Ϸ� ��ȯ�Ͽ� ����Ѵ�.
			
			System.out.print("�� �� �� �ұ��? (1. �� / 2.�ƴϿ�) : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		// retry�� 1�̸� �ݺ��� �ٽ� �����ϰ� �ƴϸ� ������ ��ģ��.
	}
}
