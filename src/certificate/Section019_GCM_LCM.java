package certificate;

import java.util.Scanner;

class Section019_GCM_LCM {
	//�ִ�����, �ּҰ���� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, big, small, mok, nmg, gcm, lcm;
		//a = ù��° �Է�, b = �ι�° �Է�, big = ū��, small = ������, mok = ��, nmg = ������, gcm = �ִ�����, lcm = �ּҰ����
		
		System.out.print("ù��°�� �Է� : ");
		a = sc.nextInt();
		System.out.print("�ι�°�� �Է� : ");
		b = sc.nextInt();
		
		if(a >= b) {	//�Է¹��� ���� ũ���� ������ ����
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}
		
		while(true) {
			mok = big/small;	//int Ÿ���� �����̹Ƿ� �Ҽ����� �������⿡ ������ �߰� �۾����� ����
			nmg = big - small*mok;	//�������� int Ÿ���� Ư¡�� �̿��ؼ� �������� ����
			
			if(nmg == 0) {
				gcm = small;
				lcm = a * b / gcm;
				System.out.println("gcm = " + gcm + ", lcm = " + lcm);
				break;
			}
			
			big = small;
			small = nmg;
		}
		
		sc.close();
	}

}
