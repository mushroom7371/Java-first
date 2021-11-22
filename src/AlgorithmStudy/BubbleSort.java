package AlgorithmStudy;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {	//static �޼���� Ŭ������ �޸𸮿� �ö󰥶� �����ȴ�.
		//���� ��Ʈ�� ġȯ�� �⺻���� �̷�� ����.
		int t = a[idx1];		//int Ÿ�� ���� t�� �迭 a�� idx1������ �����͸� �����Ѵ�.
		a[idx1] = a[idx2];		//�迭 a�� idx1 ������ �����͸� a[idx2]�� �����ͷ� �ٲٰ�
		a[idx2] = t;			//a[idx2]�� �����͸� t�� �����ͷ� ġȯ�Ѵ�.
		//�ᱹ 2���� ������ ���� �ٲٱ� ���� �ӽ� ������ �̿��ϴ� ���̴�.
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n; i++) 			//0�������� ���ڰ����� ���� n���� 1�� �����ϸ鼭 �ݺ��Ѵ�.
			for(int j = n - 1; j > i ; j-- ) 	//�� �������� i���� Ŭ�� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�.
				if(a[j - 1] > a[j])				//���� �迭a�� j-1������ �����Ͱ� j������ ������ ���� ũ�ٸ� ������ ���� �ʾұ⿡ swap() �޼��带 �̿��Ͽ� ��ġ�� �����Ѵ�.
					swap(a, j-1,j);
		//�ݺ����� Ȱ���Ͽ� a�迭�� j-1 �������� j �������� ������ ũ�ٸ� swap()�޼��带 Ȱ���Ͽ� ���� ġȯ�ϴ� �۾��� �����Ѵ�.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(���� 1)");
		System.out.print("��ڼ� : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];		//Ű����� �Է¹��� ���ڸ� �迭�� ũ��� �����Ѵ�.
		
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
