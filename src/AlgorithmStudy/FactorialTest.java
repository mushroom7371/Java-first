package AlgorithmStudy;

public class FactorialTest {
	static long factorial(int n) {	//static �޼���� �޸𸮿� Ŭ������ ����ɶ� ������ ��ü �������� ��밡��
		if(n <= 0 || n > 20)
			return -1;
		//�Ű������� ��ȿ�� �˻縦 ���� �ۼ��� if��
		if(n <= 1)
			return 1;
		//���ȣ�� �� �Ű����� n-1 �� ���Ͽ� �Ű������� 1�� �ɽ� ��ȯ���� 1�� ����
		
		return n * factorial(n-1);
		//��� ȣ��
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("��ȿ���� ���� ���Դϴ�. (0 < n <= 20) : %d%n", n);
				break;
			}
			//�Ű����� ��ȿ�� �˻�� ������ �� �� �ȳ����� ��� �� break�� �ݺ����� ���� ����
			
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}
}
