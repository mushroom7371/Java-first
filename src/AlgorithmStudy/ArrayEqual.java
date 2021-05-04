package AlgorithmStudy;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int [] a, int [] b){	//static �޼���� Ŭ������ �޸𸮿� ����� �� �����ȴ�. ���� ��ü�� �������� �ʾƵ���
		if(a.length != b.length)	//�迭 a�� ���̿� �迭 b�� ���̰� ���� �ʴٸ�
			return false;	//��ȯ������ false�� ��ȯ�ϰ� ����ȴ�. ���ٸ� ������ ����
		
		for(int i = 0; i<a.length; i++) {	//�迭a�� ���̸�ŭ �ݺ��Ѵ�.
			if(a[i] != b[i])	//�迭a�� �������� ���� �迭b�� �������� ���� ���� �ʴٸ�
				return false;	//false�� ��ȯ�ϰ� �����Ѵ�.
		}
		
		return true;	//�迭a�� �迭b�� ���ٸ� true�� ��ȯ�Ѵ�.
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner Ÿ���� �������� sc�� ���� �ϰ� Scanner Ŭ�����κ��� ��ü�� �����Ͽ� �� �ּҰ��� �������� sc�� �����Ѵ�.
		// System.in �� Ű����� ����� ǥ�� �Է� ��Ʈ��(standard input stream)�� �ǹ���.
		
		System.out.println("a�迭�� ��ڼ� : ");
		int ns = sc.nextInt();	//sc�� nextInt()�޼��带 �̿��Ͽ� �Է¹��� ���ڰ��� ���� ns�� ����
		
		int [] a = new int[ns];	//ns�� ����ŭ�� ���̸� ���� intŸ���� �迭�� ������ �� �������� a�� �ּҰ��� �����Ѵ�.
		
		for(int i = 0; i < ns; i++) {	//ns�� ����ŭ �ݺ�
			System.out.print("a[" + i +"] : ");
			a[i] = sc.nextInt();	//�迭 a�� i������ Ű����� �Է¹��� ���� �����Ѵ�.
		}
		
		System.out.println("b�迭�� ��ڼ� : ");
		int nb = sc.nextInt();
		
		int [] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i +"] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("�迭 a�� �迭 b �� " + (equals(a,b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		// �ռ� ������ equals() �޼��带 ���Ͽ� �迭 a�� �迭b�� �Ű������� �ް� �̸� ���Ͽ� ������(true) "�����ϴ�"�� ��� �ٸ���(false)"�ٸ��ϴ�"�� ���
	}

}
