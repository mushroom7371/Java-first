package JavaStudy;

public class ArrayExam {
	public int[] makeArray() {	//�������� ��� �迭�� return�޴� �޼��带 �����Ѵ�.
		int [] array = new int[] {1,2,3,4,5};
		//���� ���� �����ϴ� �迭 Ÿ���� �������� array�� �����ϰ�
		//���� ���� �����ϴ� �迭�� �����ϰ� ���� �ʱ�ȭ �� �� �ּҰ��� �������� array�� �����Ѵ�.
		return array;	//�������� array�� ��ȯ�Ѵ�.
	}
	
	public static void main(String [] args) {
		ArrayExam exam = new ArrayExam();
		//ArrayExam Ÿ���� �������� exam�� �����ϰ� new�� ���� ������ ArrayExam �ν��Ͻ��� �ּҰ��� �����Ѵ�
		int [] array = exam.makeArray();
		//���� ���� �����ϴ� �迭 Ÿ���� �������� array�� �����ϰ� �������� exam�� ����Ű�� ���� �ν��Ͻ��� ����
		//makeArray�޼��带 ȣ���Ͽ� ���ϰ��� �����Ѵ�
		
		for(int i = 0; i < array.length; i++) {	
			//�ݺ��� ���� array.lenght�� �迭�� ���̸� �ǹ��Ѵ�
			System.out.println(array[i]);
		}
		
	}
}
