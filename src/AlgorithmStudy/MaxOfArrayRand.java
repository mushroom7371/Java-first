package AlgorithmStudy;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	static int maxOf(int[]a) {	// ���� MaxOfArray Ŭ�������� ��κ��� ������ ������
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) 
			if(a[i] > max) 
				max = a[i];
				
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();	//Random Ŭ������ ����ϱ� ���� �ν��Ͻ�ȭ �Ͽ� ���������� �ּҸ� ��Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int [] height = new int[num];	//Ű����� �Է¹��� ������ ũ�⸸ŭ�� ���̸� ���� �迭�� ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		
		for(int i = 0; i < height.length; i++) {
			height[i] = 100 +  rand.nextInt(90);	//RandomŬ������ nextInt�� ����Ͽ� 0~89(0~n-1)������ ������ ���Ѵ�.
			System.out.println( i + "��° ����� Ű : " + height[i]);
		}
		
		System.out.println("���� ū ����� Ű�� : " + maxOf(height) + " �Դϴ�.");
	}

}
