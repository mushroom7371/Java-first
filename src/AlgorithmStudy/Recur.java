package AlgorithmStudy;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {	//static �޼���� ���Ͽ� ��ü �������� ���θ޼��忡�� ��밡��
		if(n > 0) {	//�Է¹��� �Ű������� 0���� ũ�ٸ�
			recur(n - 1);	//�ٽ� �ڱ� �ڽ��� �޼��带 ȣ���ϵ� �Ű������� ���� -1 �Ͽ� �Է�
			System.out.println(n);	//���� �޼��尡 ����Ǿ�� ��μ� ����ȴ�.
			recur(n - 2);
		}
	}
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		recur(x);
	}
}
