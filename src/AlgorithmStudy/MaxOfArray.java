package AlgorithmStudy;

import java.util.Scanner;

public class MaxOfArray {

	static int maxOf(int[] a) {	//static �����ڷ� Ŭ������ �޸𸮿� �ö󰥶� �����ȴ�. ����, ��ü�� ���� ���� ��밡���ϴ�.
								//int Ÿ���� ���ϰ��� ������ �Ű������� �迭Ÿ���� ���������� ������.
		int max = a[0];	//int Ÿ���� ������ �����ϰ� �Ű������� ���� �迭�� 0������ �ʱⰪ���� ������.
		
		for(int i = 0; i < a.length; i++ )	//�迭�� ���̸�ŭ 0���� 1�� �����ϸ� �ݺ��Ѵ�.
			if(a[i] > max)	//a�� �������� ���� max�� ������ ũ�ٸ�
				max = a[i];	//max�� a�� �ش� �������� ������ �����Ѵ�.
			return max;		//�ݺ��� ���� �� max�� ��ȯ�Ѵ�.
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Ű����� ���� �Է¹��� ���� ����ϱ� ���� Scanner Ÿ���� ���������� �����ϰ� Scanner��ü�� �����Ѵ�.
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.println("��� �� : ");
		int num = sc.nextInt();	//int�� ���� num�� �����ϰ� Ű����� �Է¹��� ���� nextInt()�޼��带 ���� ���������� ��ȯ�Ͽ� �����Ѵ�.
		
		int [] height = new int[num];	//������ Ÿ���� ���� �����ϴ� �迭�� �����ϰ� ���̸� �Է¹��� num�� ������ �����Ͽ� �������� height�� �ּҸ� �����Ѵ�.
		
		for(int i = 0; i < num; i++) { //0�������� num�� ���� ������ �ݺ�
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();	//�ݺ��� ���� �ɶ� ���� Ű����� ������ �Է¹޾� �����Ѵ�. �� �迭�� ������ ���� ���� ������.
		}

		System.out.println("�ִ��� " + maxOf(height) + " �Դϴ�.");	//���� static �޼��忡�� �ִ밪�� ���ϴ� ����� �ҷ��� height �迭�� ���뿡�� �ִ밪�� ���Ѵ�.
	}

}
