package certificate;

import java.util.Scanner;

class Section025_avgWithOutMaxMin {
	//�ִ񰪰� �ּҰ��� ������ ��� ���ϱ�
	public static void main(String[] args) {
		int i, hap, max, min, avg, m;
		//i = ����� �迭�� ����, hap = ���ڵ��� ��, max = �ִ�, min = �ּڰ�, avg = ���, m = ������ �迭�� ������
		int [] a = new int[7];	//���ڸ� ������ �迭 ���� �� ũ�� ����
		Scanner sc = new Scanner(System.in);
		m = -1;	//�迭�� 0���� ���� �����ϱ⿡ -1�� ����
		
		System.out.println("����� ���� ���� 7���� �Է��ϼ���.");
		
		do {
			m++;
			a[m] = sc.nextInt();
		}while(m < 6);	//0~6������ �����͸� �����ϵ��� 7�� �ݺ��Ѵ�.
		
		min = a[0];
		max = a[0];
		hap = 0;
		i = 0;
		
		while(i < 6) {
			i++;
			hap += a[i];	//�� �������� ����� �����͸� �ݺ��ϸ� ���� hap�� ���Ѵ�.
			if(a[i] > max) {	//�ش� �������� �����Ͱ� max�� ������ ũ�ٸ� �� ���� ���� max�� ����
				max = a[i];
			}
			if(a[i] < min) {	//�ش� �������� �����Ͱ� min�� ������ �۴ٸ� �� ���� ���� min�� ����
				min = a[i];
			}
		}
		
		hap = hap - min - max;	//hap���� �迭�� ������ ���ΰ� ��������Ƿ� �ִ�, �ּڰ��� ����.
		avg = hap/5;	//������ ������ 5�� ���� ��հ��� ���Ѵ�.
		
		
		System.out.println("�ִ��� : " + max + " �Դϴ�.");
		System.out.println("�ּڰ��� : " + min + " �Դϴ�.");
		System.out.println("�Է��Ͻ� ���ڵ鿡�� �ִ�,�ּڰ��� ������ ������ ���� ����� : " + avg + " �Դϴ�.");
	}

}
