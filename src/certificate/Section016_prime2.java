package certificate;

import java.util.Scanner;

class Section016_prime2 {
	//������ �������� �Ҽ� ���ϱ�
	public static void main(String[] args) {
		System.out.println("�Ǻ��� ���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 2;	//������ ���� 2���� ����
		
		while(i % j != 0) {	//�Է¹��� ���� i�� j�� ������ �� �������� 0�� �ƴ϶�� �Ҽ��� ���ɼ��� ����
			j++;			//j�� 1�����Ͽ� �ٽ� �ݺ����� �ݺ�	
		}
		
		//whlie���� ���ǽ��� ������ �� ��� �������� �Ʒ��� ������ �ǽ���(��, ������ 0�� �� ���)
		if( i == j) {	//�� ���� �Է¹��� ���� ���� �� ���
				System.out.println("�Ҽ��Դϴ�.");
		}else {			//���� �ʴٸ�
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	
	}
}
