package JavaStudy;

public class ReferenceTypeExam {
	public static void main(String args[]) {
		ReferenceTypeExam rtx = new ReferenceTypeExam();
		//Ŭ������ ���� �ν��Ͻ��� �����ϰ� �̸� ReferenceTypeExam Ÿ���� ���������� �ּҰ��� �����Ѵ�.
		
		int value = 10;	// ������ ���� ���� �� �ʱ�ȭ
		rtx.addOne(value);	//�ν��Ͻ��� �޼��带 ȣ���ϰ� �Ű������� value�� �����Ѵ�. 10�� ���Ե�.
		System.out.println("�⺻�� ������ ���� �ٸ� �޼��忡�� ������ ��� :" + value);
		//addOne �޼��忡 value 10�� ���Եǰ� value++�� ���� 11�� �Ǵ°� ������, �ش� �ż���� ���ϰ���
		//������ �̹� Ŭ������ ���� ������ �ν��Ͻ��� value�� ���� ���ϴ°��� �ƴϱ� ������ 10�� ��µȴ�.
		
		int arr [] = {10}; // ������ ���� ��� �迭�� �����ϰ� �ʱ�ȭ �� �� �� �ּҰ��� ������ ���� arr�� �����Ѵ�.
		rtx.addOne(arr);	//�ν��Ͻ��� �޼��带 ȣ���ϰ� �Ű������� �ּҰ��� ������.
        System.out.println("������ ������ ���� �ٸ� �޼��忡�� ������ ���: " + arr[0]);
        //���� ����ʹ� �ٸ��� �迭 arr�� �ν��Ͻ�ȭ �Ǿ� ��������� 10�̶�� ���� ��� �迭�� �ּҰ��� ����Ȱ��̹Ƿ�
        //�޼����� ���� ��� �ּҰ��� ���ϴ°� �ƴ� �ּҰ� ����Ű�� ���� ���� 10�� 11�� ������ ���� ����Ű�� ������
        //��������� ���� ����� 11�� ��µǰ� �ȴ�.
	}
	
	public void addOne(int value) {
		value++;
	}
	
	public void addOne(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
}
