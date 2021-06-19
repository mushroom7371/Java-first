package AlgorithmStudy;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		//static �޼���� Ŭ������ �޸𸮰� ����ɶ� �����ȴ�.
		if(n > 0)	//�Ű������� ���� n�� ���� 0���� ũ�ٸ�
			return n * factorial(n - 1);
			//n*(n-1)*(n-1-1)*(n-1-1-1)*...1 �� ����Ͽ� �ڱ� �ڽ��� �޼��带 ȣ���� ����� ���Ͽ� ��ȯ�Ѵ�.
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.");
		int x = sc.nextInt();
		
		System.out.println(x + " �� ���丮���� " + factorial(x) + " �Դϴ�.");
	}
}
