package AlgorithmStudy;

import java.util.Scanner; // Ű����� ���� �Է� ���� ���� ����ϱ� ���� Scanner Ŭ������ �ҷ��´�.

public class MaxMin {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		// Scanner Ÿ���� �������� sc�� ���� �ϰ� Scanner Ŭ�����κ��� ��ü�� �����Ͽ� �� �ּҰ��� �������� sc�� �����Ѵ�.
		// System.in �� Ű����� ����� ǥ�� �Է� ��Ʈ��(standard input stream)�� �ǹ���.
		
		System.out.print("a �� ���� : "); int a = sc.nextInt();
		// ������ �ν��Ͻ��� ���Ե� nextInt() �޼��带 ȣ���ϸ� �̴� Ű����� �Է��� �������� ������ ��������.
		// �׸��� int Ÿ���� ���� a�� �ҷ��� ������ �ʱ�ȭ �Ѵ�.
		System.out.print("b �� ���� : "); int b = sc.nextInt();
		System.out.print("c �� ���� : "); int c = sc.nextInt();
		
		int max = a;	//�ִ밪�� ���� ������ �����ϰ� a�� �ʱ�ȭ �Ѵ�.
		
		if(max < b) {	//���ǹ��� ���Ͽ� max�� ��(a�� ����� ��)�� b���� ������, �� b�� max ���� ũ��
			max = b;	//b�� ���� max�� �����Ѵ�. �̷� ���Ͽ� �� ���� �� ū ���� ���� �� �ִ�.
		}
		
		if(max < c) {	//�������� �۾����� 3��° ������ c �� max ���� ���Ͽ� ���̸� ���� �����Ѵ�.
			max = c;
		}
		
		System.out.println("�Է� ���� ������ �ִ밪�� " + max + " �Դϴ�."); //�������
	}
}
