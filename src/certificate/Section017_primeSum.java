package certificate;

import java.util.Scanner;

class Section017_primeSum {
	//1���� �Է¹��� �� ���� �Ҽ��� �Ǻ��Ͽ� ���ϱ�
	public static void main(String[] args) {
		System.out.println("�Ҽ��� ���� ���� ���� ���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		int a, hap, k, j;	//a = ����, hap = �Ҽ��� ��, k = �������� �Ҽ���, j = ������
		a = sc.nextInt();
		hap = 0;
		k = 2;	//1�� �Ҽ��� �Ǵ����� �ʱ⿡ 2���� ����
		
		while(true) {	//break���� ������ ������ ���ѹݺ�
			j = 2;	//������ �� ���� 2���� ����
			
			while(k % j != 0) {	//���� ���� ���� k�� j�� �������� �������� 0�� �ƴϸ� �Ҽ��� ���ɼ��� ����
				j++;	//j�� 1 �������� �ְ� �������� 0�� �ɶ� ���� �ݺ��Ѵ�.
			}
			
			if( k == j) {	//k�� j�� �������ٸ� �Ҽ��̹Ƿ� ���� ������ ���� hap�� k�� ���Ѵ�.	���� �ʴٸ� �ƹ��͵� ����
				hap += k;
			}
			
			if(k < a) {	//k�� �������� �����̹Ƿ� �Է¹��� ���� ���� a���� �۴ٸ� 1���� ���� ����� while������ ���ư� �ݺ��� �����Ѵ�.
				k++;
			}else {
				System.out.println("�Ҽ��� ���� : " + hap);
				break;
			}
		}
		
	}

}
