package AlgorithmStudy;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {	//static �޼���� Ŭ������ �޸𸮿� �ö󰥶� �����ȴ�.
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		//������ ���� t�� �����Ͽ� �Ű������� ���� �ش� �迭�� �������� ���� �ٲ۴�.
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n; i++) 
			for(int j = n - 1; j > i ; j-- ) 
				if(a[j - 1] > a[j])
					swap(a, j-1,j);
		//�ݺ����� Ȱ���Ͽ� a�迭�� j-1 �������� j �������� ������ ũ�ٸ� swap()�޼��带 Ȱ���Ͽ� ���� ġȯ�ϴ� �۾��� �����Ѵ�.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(���� 1)");
		System.out.print("��ڼ� : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		//��ڼ��� ũ�⸸ŭ �ݺ��Ͽ� Ű����� �Է¹��� ���� �迭�� �����Ѵ�.
		
		bubbleSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < nx; i++) 
			System.out.println("x[" + i + "] : " + x[i]);
		//������ ��ġ�� �� �� ���� ����Ѵ�.
	}
	
}
