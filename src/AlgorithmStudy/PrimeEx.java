package AlgorithmStudy;

public class PrimeEx {
	public static void main(String[] args) {
		int sum = 0;
		//���� ������ ����
		
		for(int num = 2; num <= 100; num++) {
			int count = 0;
			//�Ҽ����� Ȯ���ϱ����� üũ�ϴ� ����
			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
					//������ �����ڷ� �������� 0�� �Ǵ� ���� 1�� �ڱ� �ڽ��̸� ī��Ʈ��
				}
			}
			
			if(count == 2) {	//���� ����� ī��Ʈ�� 2�� �ȴٸ� �Ҽ��̱� ������ �հ�� �����Ѵ�.
				System.out.println(num);
				sum = sum + num;
			}
		}
		
		System.out.println("sum = " + sum);
		
		
	}//main
}
