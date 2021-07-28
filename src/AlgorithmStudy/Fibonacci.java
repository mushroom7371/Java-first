package AlgorithmStudy;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է� : ");
		
		int num = sc.nextInt();
		//���ϴ� �Ǻ���ġ ������ ���� �Է¹���
		
		
		System.out.println("�ݺ����� �̿��� �Ǻ���ġ n�� ���ϱ�");
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
		
		System.out.println();
		System.out.println("����Լ��� �̿��� �Ǻ���ġ n�� ���ϱ�");
		
		System.out.println(fibo(num));
		
	}
	
	static int fibo(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}
