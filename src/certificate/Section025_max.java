package certificate;

import java.util.Scanner;

class Section025_max {
	//�ִ� ���ϱ�
	public static void main(String[] args) {
		int [] a = new int[10];	//�Է¹��� ���ڸ� ������ �迭
		int j = -1, max = 0;	//�ִ��� ������ ���� max�� �Է¹��� ���� ������(�迭 0�������� ����ǹǷ� -1�� �ʱ�ȭ)
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 10���� �Է��� �ּ���.");
		
		do {
			j++;	//ù���� �迭�� ������ 0���������̴�.
			a[j] = sc.nextInt();	//�ش� �������� ����� ���� Ű����� �����Է¹��� �������̴�.
		}while(j < 9);
		
		for(int i = 0; i <= 9; i++) {
			if(a[i] > max){	//�ش� ������ ������ ���� max���� ũ�ٸ� �� ���� max�� ������.
				max = a[i];
			}
		}
		
		System.out.println("�ش� ���ڵ��� �ִ��� : " + max + " �Դϴ�.");
	}

}
