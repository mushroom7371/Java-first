package AlgorithmStudy;

import java.util.Scanner;

class BinSearch {
	//binary search(���� �˻�)�̶� ��ġ �������� ��,�ٿ� ���Ӱ� ����ϴ�
	static int binSearch(int [] a, int n, int key)	{	//static �޼���� Ŭ������ �޸𸮿� ����ɶ� ����1�� ������(��ü ���� ��밡��), ���ڰ����� 3������ ������ ������.
		int pl = 0;			//�˻� ������ ù��° �ε���
		int pr = n - 1;		//�˻� ������ ������ �ε���
		
		do {	//���ǿ� �����ϱ� ������ �ݺ��� �����Ѵ�.
			int pc = (pl + pr) / 2;	//�߰� �ε���
			if(a[pc] == key) {		//���ڷ� ���� �������� a�� ����Ű�� �迭�� �߰� �������� ���� key�� ���ٸ�
				return pc;			//�� �߰� �ε����� ��ȯ��(�ѹ��� ����)
			}else if(a[pc] < key) {	//key ������ �߰����� �۴ٸ�
				pl = pc + 1;		//�˻� ������(ù��° �ε�����) 1 �������� �߰��� ������ ���� �˻���(�˻������� ���� �������� ������.)
			}else {					//key ������ �߰����� ũ�ٸ�
				pr = pc - 1;		//�˻� ������(������ �ε�����) 1 ���ҽ��� �߰��� ������ ���� �˻���(�˻������� ���� �������� ������.)
			}
		}while(pl <= pr);			//ù��° �ε����� ������ �ε����� ���ų� �۴ٸ� �ݺ��� �ߴ��Ѵ�.
		
		return -1;					//�˻� ���н� -1�� ��ȯ��
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");	//�迭�� ũ�⸦ �Է¹��� ���� �����Ѵ�.
		int num = sc.nextInt();
		int [] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();	//�迭�� ù��° ���� �Է�
		
		for(int i = 1; i < num; i++) {	//�迭�� 2��° �������� �迭�� ũ�� ������ �ݺ�
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();	//�ش� �������� ���� ������
			}while(x[i] < x[i-1]);		//���� �������� ������ �Է��� ���� ������ �ٽ� �ݺ�
		}
		
		System.out.print("�˻� �� �� : ");
		int ky = sc.nextInt();	//ã�� ��
		
		int idx = binSearch(x, num, ky);	//���� static �޼��带 ȣ���Ͽ� ������ ������
		
		if(idx == -1) {	//��ȯ���� -1�̶�� �ش��ϴ� ��Ұ� ����.
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println(ky + "��/�� x[" + idx + "]�� �ֽ��ϴ�.");	//�ƴ϶�� �ش� ��Ұ��� idx������ �ִ�
		}
	}

}
