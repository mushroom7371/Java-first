package certificate;

import java.util.Scanner;

class Section016_prime1 {
	//������ �������� ������ �Ҽ� ���ϱ�
	public static void main(String[] args) {
		System.out.println("�Ҽ��Ǻ���... ���ڸ� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = a - 1;
		int j = 2;
		
		while(true) {
			if(j <= i) {
				if(a % j == 0) {
					System.out.println("�Ҽ� �ƴ�");
					break;
				}else {
					j++;
				}
			}else {
				System.out.println("�Ҽ���");
				break;
			}
		}
	}

}
