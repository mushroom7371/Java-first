package AlgorithmStudy;

import java.util.Scanner;

public class SpeedSum {
	public static void main(String[] args) {
		//1 ~ n��° �������� �հ� ���ϱ�
		
		long n;
		long sum = 0;
		
		System.out.print("n��° ���� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		
//		for(long i = 1; i <= n; i++) { sum = sum + i; }
//		�ݺ����� �̿��Ͽ� ���� sum�� �ϳ��ϳ� ���ϰ� ������� ����ص� ������ �ݺ��۾����� ��ȿ������
				
		sum = n * (n + 1) / 2;
		//1~n������ �հ�� ���콺 ������ ���� �ݺ����� �ʰ� ���� �� ����, ���ʿ��� �ݺ��� ���⿡ ȿ����

		System.out.println(sum);
	}
}
