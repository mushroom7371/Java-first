package AlgorithmStudy;

import java.util.Scanner;

public class SepSearch {

	static int sepSearch(int [] a, int n, int key) {
		//static �޼���� Ŭ������ �޸𸮿� ����ɶ� �����Ǿ� ���� ��ü�� ������ �ʿ� ���� ��밡���ϴ�
		//int Ÿ���� ���ϰ����� ������ �Ű������� 3���� ���� �޴´�.
		int i = 0;
		//���� ã������ ������ ������ �����ϰ� �ʱⰪ�� 1�� ������.

		while(true) {	//while �ݺ����� �����ϴµ� ���ǽ��� true �̹Ƿ� �׻� ����ȴ�.
			if( i == n)
				return -1;
			//������ �������� n�� ���ٸ� -1�� �����Ѵ�.
			if( a[i] == key)
				return i;
			//�Ű������� ���� �迭�� i������ key�� ���ٸ� i�� ���� �����Ѵ�.
			i++;
			//if ������ ���ǿ� �����ϴ� ��찡 ���� ��� i�� 1 �������� �ݺ��� �����Ѵ�.
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		//Ű����� ���޹��� ���ڸ� int Ÿ���� ���� num�� �����Ѵ�.
		int [] x = new int[num];
		//int Ÿ���� �迭�� ������ �������� x�� �����ϰ� ���⿡ num�� ���ڸ�ŭ�� ���̸� ������ �迭�� �����ϰ� �ּҰ��� �����Ѵ�.
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		//�迭 x�� 0 �������� num-1 �������� Ű����� �Է¹��� ������ �����Ѵ�.
		
		System.out.print("�˻��� �� : ");
		int ky = sc.nextInt();
		//�˻��� ���� �����ϱ����� int Ÿ�� ������ �����ϰ� Ű����� ���� ���� ���� �����Ѵ�.
		int idx = sepSearch(x, num, ky);
		//sepSearch()�޼��带 ȣ���Ͽ� ���Ϲ��� ���� ���� idx�� �����Ѵ�.
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "] �� �ֽ��ϴ�.");
	}

}
