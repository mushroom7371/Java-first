package JavaStudy;

import java.util.Scanner;	//java.util �� �ִ� Scanner�� import �ϰڴ�

public class DoWhileExam {
	public static void main(String [] args) {
		
		int value = 0;	//���� Ÿ���� ������ �����ϰ� �ʱ�ȭ
		Scanner scan = new Scanner(System.in);
		// Scanner Ÿ���� �������� scan�� �����ϰ� ���⿡�� �ּҰ��� ����ȴ�.
		// �� �ּҰ��� new�� ���Ͽ� Scanner Ŭ������ ���� ������ �ν��Ͻ��� �ּҰ��̴�.
		// ���� ���� �ν��Ͻ����� Ű����� ���� ���� �Է¹޴� ����� �ִ�.
		
		do { //�ѹ��� ����Ǵ� �κ�
			value = scan.nextInt();	// ���� value �� scan�� ����Ű�� �ν��Ͻ��� nextInt() �޼��带 ȣ���ϰ� �����Ѵ�
			System.out.println(value);	//���
		}while(value != 10);
		//while�� ������ true �϶� ��� �ݺ��ϹǷ� 'value�� 10�� �ƴϴ�' �� ���ΰ��
		//�� 10�� �ƴϸ� ��� do�� �ö󰡰�, 'value�� 10�� �ƴϴ�'�� ������ ���
		//�� 10�̸� �ߴ��ϰ� �ȴ�.
		
		System.out.println("�ݺ��� ����");
	}
}
