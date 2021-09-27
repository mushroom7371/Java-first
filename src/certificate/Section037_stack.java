package certificate;

import java.util.Scanner;
//���� ���� Overflow, Underflow ���
	class Section037_stack {
		static final int MAX = 5;	//������ ũ�⸦ ���� static ����� ����(�ٲ��� ����)�Ͽ� Ŭ������ �޸𸮿� ����ɶ� �����ѹ� �����ȴ�.
		static int Stack[] = new int[MAX];	//int Ÿ���� ũ��5�� �迭�� �����ϰ� �ּҰ��� �������� Stack�� ��´�.
		static int Top = -1;	//�迭�� 0���� ���� �����ϱ� ���� -1�� �ʱ�ȭ
		
		static int push(int ii) {	//���ڰ����� int Ÿ���� ������ �޴� push() �޼��� ��ü �������� ��밡���ϴ�.
			Top++;
			if (Top >= MAX) {	//���� Top�� ���� �迭�� ũ���� 5 �̻��̶��
				System.out.printf("Overflow\n");	//Overflow�� ���
				Top--;	//Top�� �����Ͽ� 4�� �ȴ�.
				return -1;	//-1�� ��ȯ��
			}
			Stack[Top] = ii;	//�ƴ϶��, �� 5�̸��̶��
			return 0;	//0�� ��ȯ��
		}
		
		static int pop() {	//�Ű������� ���� pop()�޼��� ����
			int r;
			if (Top < 0) {	//Top�� ���� 0���� �۴ٸ�, �� �迭�� ũ�⺸�� �۴ٸ�
				System.out.printf("Underflow\n");	//Underflow�� ���
				return -1;	//-1�� ��ȯ��
			}
			r = Stack[Top];	//r�� �������� Stack�� ����Ű�� �迭�� Top������ ������ ����
			Top--;	//Top�� 1���� ��Ŵ
			return r;	//r�� ��ȯ(0)�� ��ȯ
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (true) {	//������ ���̹Ƿ� break���� ������ ������ �ݺ��� �ǽ��Ѵ�.
				int i, j, k;
				//i = �Է��� ��,������ ��, Overflow, Underflow Ȯ�ο� ����, j = �Է�, ������ ������ ����, k = ���ÿ� ����� �ڷḦ �Է� ���� ����
				System.out.printf("�۾��� �����ϼ���.:");
				j = sc.nextInt();	//Ű����� �Է¹��� ������ j�� ����
				if (j == 1) {	//j�� 1�̸�
					System.out.printf("������ ���ڸ� �Է��ϼ���.:");
					k = sc.nextInt();	//Ű����� �Է¹��� ������ k�� ����
					i = push(k);	// push()�޼��带 ȣ���Ͽ� ���ÿ� ������� k���� ����/ ������ �������� -1��, �ƴϸ� 0�� i�� ����
					if (i == -1) break;	//i�� -1�̶�� ������ ���� á�⿡ while���� �������´�.
				}
				else if (j == 2) {	//j�� 2��
					i = pop();	//���ÿ��� �����͸� �����Ѵ�.
					if (i == -1) break;	//������ �����Ͱ� ���ٸ� �ݺ��� �������´�.
					else
						System.out.printf("������ �ڷ�� %d�Դϴ�\n", i);
				}
				else break;	//j�� 1,2�� �ƴ� ��� �ƹ��͵� ���ϰ� �ݺ��� �������´�.
			}
			if (Top < 0)
				System.out.printf("���ÿ� �ڷᰡ �����ϴ�.\n");
			else {
				System.out.printf("������ �ڷ�� ������ �����ϴ�.\n");
				for (int i = Top; i >= 0; i--)
					System.out.printf("%10d\n", Stack[i]);
				}
			sc.close();
	}
}
