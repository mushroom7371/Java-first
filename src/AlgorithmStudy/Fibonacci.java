package AlgorithmStudy;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է� : ");
		
		int num = sc.nextInt();
		//���ϴ� �Ǻ���ġ ������ ���� �Է¹���
		
		int su1, su2, sum;
		//������ ���ϱ� ���� ���� ����
		
		su1 = 0;
		su2 = 1;
		sum = 1;
		
		for(int i = 0; i < num; i++) {
			System.out.print(sum + " ");
			sum = su1 + su2;
			su1 = su2;
			su2 = sum;
			//ù��° �װ� �ι�°���� ������ �� �о�� ������ �Ǻ���ġ ������ ���Ѵ�.
		}
	}
}
