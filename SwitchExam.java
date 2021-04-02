package Study;

import java.util.Calendar;

public class SwitchExam {
	public static void main(String[] args) {
		// month���� ������ �� ������ ��� �ֽ��ϴ�.
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; //���� ��Ÿ���� ��� �߸�
		String season = "";	//���ڿ� Ÿ���� �������� season�� �����ϰ� ""�� �ּҰ��� ������
		// switch���� �̿��ؼ� season�� ������ � �������� ��Ÿ���� ��������.
		switch (month){	//����ġ ���忡 ������ �޾ƿ� ������ ������ �Ű������� �Է��Ͽ� ���� ��
		case 1: case 2: case 12:	//1,2,12 �϶�
			season = "�ܿ�";			//���������� ����Ű�� ���� ���� "�ܿ�"�� �Է�
			break;					//������ �����ϸ� ����ġ ���� ���������� �����ϴ� ������ ������ �Ʒ��� ������
			
		case 3: case 4: case 5:		//���� ����
			season = "��";
			break;
			
		case 6: case 7: case 8:		//���� ����
			season = "����";
			break;
			
		case 9: case 10: case 11:	//���Ͱ���
			season = "����";
			break;
			
		}

		System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
	}
}

