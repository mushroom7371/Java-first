package Study;

import java.util.Calendar;	//�ڹ� ��ƿ�� Ķ���� Ŭ������ �����ְ� �޾ƿ�?

public class TernaryExam {
	public static void main(String [] args) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		//������ ������ �����ϰ� Calendar �ν��Ͻ�?�� getIntance()�޼��带 ȣ���ϰ�,
		//get()�޼��忡 �Ű������� Calendar�ν��Ͻ��� HOUR_OF_DAY�� �����Ѵ�?
		
		String ampm;	//���ڿ� Ÿ���� ������ ����
		
		ampm = hour < 12 ? "����" : "����";	//���ڿ� Ÿ�Ժ����� ���׿����ڸ� �̿��Ͽ� ���� ����
		
		System.out.println("���� �ð��� "+ hour + " �� �̸� " + ampm +" �Դϴ�.");	//���
	}
}
