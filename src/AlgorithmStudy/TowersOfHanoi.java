package AlgorithmStudy;

import java.util.Scanner;

//��� ȣ���� �̿��� �ϳ����� ž ����
class TowersOfHanoi {
	//static �޼���� Ŭ������ �޸𸮿� �ö󰥶� �����ǹǷ� ��ü �������� ��밡��
	static void move(int no, int x, int y) {
		//no = ���� ����, x = ���� ����� ��ȣ, y = ��ǥ ����� ��ȣ
		//���� �޼��忡�� ȣ���ϴ� move() �޼����� ����� ���� 1�����, �߰� 2�����, ������ 3����� �� 3���� �����Ѵ�.
		//������ ũ��� ������ ��Ÿ���� ������ ũ�Ⱑ Ŀ������ ������ ũ�⵵ ū������ �����Ѵ�.
		//�� ���� ���� ū ���� �ϳ��� �� ���� ������ ����'��'�� �׷����� ��� �ű� �� �ִ�.
		
		if(no > 1) {
			move(no -1, x, 6 - x - y);
			//����� �� 1���, 2���, 3����� ������ ��� ���� �߰��� ����� 6 - ���۱�� - ��ǥ������� ǥ���� �����ϴ�.
		}
		
		System.out.println("����[" + no + "]�� " + x + "��տ��� " + y +"������� �ű�");
		
		if(no > 1) {
			move(no -1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� :");
		int n = sc.nextInt();
		
		move(n, 1, 3);
	}
}
