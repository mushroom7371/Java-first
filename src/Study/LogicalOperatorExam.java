package Study;

public class LogicalOperatorExam {
	public boolean isAgeTwenties(int age) { //���� ���� ��ȯ�ް� �Ű������� ������ ���� ������ �޼��带 ����
		boolean isTwenties = false;			//���� ������ �����ϰ� �ʱ�ȭ�Ѵ� �̶� ������ ��������
		
		if( age >= 20 && age < 30) {		//���ǹ��� ���ǽĿ� �����ڸ� �̿��Ͽ� �Ű������� ������ �Է��Ѵ�
			isTwenties = true;				//������ ���϶� ������ true�� ����
		}
		else {								//������ ���� �ƴҶ�
			isTwenties = false;				//������ false�� ����
		}
			
		return isTwenties;					//if���� ����� ������ ����� ���� �޼����� ��ȯ������ ��ȯ
	}
	
	public static void main(String [] args) {
		LogicalOperatorExam exam = new LogicalOperatorExam();	//Ŭ������ ���� �ν��Ͻ��� �����ϰ� �ּҰ��� ���������� ����
		
		exam.isAgeTwenties(29);	//������ �ν��Ͻ��� �޼��带 ȣ���ϰ� �Ű������� ���� �Է�
		exam.isAgeTwenties(30);
		
	}
}
