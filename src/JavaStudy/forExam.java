package JavaStudy;

public class forExam {
	public static void main(String args []) {
		int total = 0;	//���� Ÿ���� ���� total�� �����ϰ� 0���� ���� �ʱ�ȭ
		
		for(int i = 0; i <= 100; i++) {
			//�ʱ�ȭ, ���ǽ�, �������� �������� �ݺ����� ����ȴ�
			if(i % 2 == 0) {
				//if���ǹ����� i�� 2�� ������ ���� �������� 0�� ��츦 �ǹ� �� ¦���̴�.
				continue;
				//���ǹ����� ¦������ ���ð�� continue�� ���� �ݺ������� �ٽ� �ö󰣴�
				//�� ¦���϶��� ������ �������� �ʰ� �Ǿ� ������ �������� ���� Ȧ���� �ȴ�.
			}
			total = total + i;	//���� continue�� ���Ͽ� Ȧ������ ��������
//			if(i == 50) {
//				break;	//continue�ʹ� �ٸ��� break�� if������ �����ϰ� �Ǹ� ������ ��������.
//			}
		}
		System.out.println(total);
	}
}
