package JavaStudy;

public class OperatorExam {
	public int [] calculate() {	//intŸ���� �迭 calculate�� �����ϰ� �ʱ�ȭ������ �ʱ�ȭ
		int a = 7; //������ int Ÿ���� ���� a�� �����ϰ� �̿� ��7�� �Է���.
		int b = 3;
		
		int c = a + b;	//�����ڸ� �̿��� ��Ģ����
		int d = a - b;
		int e = a * b;
		int f = a % b;	//%�� ������ �����ڷ� a�� b�� ���� �������� ��ȯ��
		
		System.out.println(c); //���
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		int [] rat = {c,d,e,f};	//int Ÿ���� �迭�� c,d,e,f�� �����ϰ� �������� rat�� �� �迭�� �ּҰ��� ����
		
		return rat;	//	rat�� ��ȯ�Ѵ�.
		
	}
	
	public static void main(String [] args) {
		new OperatorExam().calculate();	//new�� ���Ͽ� �ν��Ͻ��� �����ϰ� �ν��Ͻ� ���� �޼��带 ȣ���Ѵ�.
	}
}
