package certificate;

import java.util.Scanner;

class Section016_prime3 {
	//�������� �̿��� �Ҽ� ���ϱ�
	public static void main(String[] args) {
		System.out.println("�Ǻ��� ���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 2;	//������ ���� 2���� ����
		
		while(true) {
			if( j <= Math.sqrt(i)) {	//MathŬ������ sqrt()�޼��带 ���� �������� ���� ���Ѵ�.
				if( i % j == 0) {	//�� �������� ���� ���� 0�� �ȴٸ� ������ ���� �����Ѵٴ� ���̹Ƿ� �Ҽ��� �ƴϴ�.
					System.out.println("�Ҽ� �ƴ�");
					break;
				}else {	//���� �������� �ʴ´ٸ� �Ҽ��� ���ɼ��� �����Ƿ� j�� 1���� ��Ų��.
					j++;
				}
			}else {	//������������ �ʰ� ���� ��Ų j�� ���� �Է¹��� ���� �������ٸ� 1�� �ڱ��ڽŸ����� �������� ���̹Ƿ� �Ҽ��̴�.
				System.out.println("�Ҽ���");
				break;
			}
		}
	}
}
