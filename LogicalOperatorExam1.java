package Study;

public class LogicalOperatorExam1 {
	public boolean isAgeDiscountable(int age) {	//�Ű������� �������� ������ ��ȯ�� �������� �޴� �޼��带 ����
		boolean isDiscount = false; //���� ������ �����ϰ� false�� �ʱ�ȭ �Ѵ�
		
		if(age<=19 || age>=60) {	//���ǹ� if�� ���ǽĿ� �����ڸ� �̿��Ͽ� ���� �ۼ�
			isDiscount = true;		//������ true�̸� ������ true�� ����
		}
		else {
			isDiscount = false;		//else������ if������ false�϶� ������ false�� ����
		}
		
		return isDiscount;			//���� Ÿ���� ������ ��ȯ�Ѵ�
	}
	
	public static void main(String [] args) {
		LogicalOperatorExam1 exam = new LogicalOperatorExam1();
		//LogicalOperatorExam1 Ÿ���� �������� exam�� �����ϰ�
		//LogicalOperatorExam1 Ŭ�����κ��� �ν��Ͻ��� �����Ͽ� �� �ּҰ��� ���������� �����Ѵ�
		
		exam.isAgeDiscountable(15);	//���������� ����Ű�� �ּ��� LogicalOperatorExam1 �ν��Ͻ��� �ִ�
		exam.isAgeDiscountable(62); //isAgeDiscountable �޼��带 ȣ���ϰ� �������� �Ű������� �ִ´�
	}
}
