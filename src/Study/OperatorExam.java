package Study;

public class OperatorExam {
	public boolean[] calculate(int a, int b) {	
		//������ ���� ���������� public�� ����Ͽ� ���� Ÿ���� �迭�� ��ȯ������ ������
		//�޼��� calculate�� ���� calculate�� ������ Ÿ���� �Ű����� �ΰ��� ������.
		
		boolean c = a > b;	//���� Ÿ�� ���� c�� �����ϰ� �񱳿����ڷ� �Ű������� ��
		
		boolean d = a == b;
		
		boolean e = a != b;
		
		boolean ret[] = {c, d, e};	//���� Ÿ���� �迭 �������� ret�� �����ϰ� c,d,e�� �ּҰ��� ������
		
		return ret;	//�޼����� ��ȯ���� �������� ret��
	}
	
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10);	//������ Ÿ�� ����a�� �����ϰ� 0~1�� �Ǽ����� ��ȯ�ϴ� �޼���
											//10�� ���Ͽ� 1~9�� ������ �����ϸ� �̸� ���������� ����ȯ�Ѵ�.
		int b = (int)(Math.random() * 10);
		
		new OperatorExam().calculate(a, b);	//Ŭ������ ���� �ν��Ͻ��� �����ϰ� �ν������� �޼��带 ȣ���Ѵ�.

	}

}
