package AlgorithmStudy;

public class Multi99Table {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {	//int Ÿ�� ���� i�� �����ϰ� 1�� �ʱ�ȭ �Ѵ��� 9���ϱ��� 1�� �����Ͽ� �ݺ��Ѵ�.
			for(int j = 1; j <=9; j++) {	//i�� �ݺ��Ҷ����� �ٽ� �ݺ��� �����Ѵ�.
				System.out.printf("%3d", i*j);	//%3d �� ���Ͽ� �ڸ��� 3�ڸ��� �����, i*j �� ����ϰ� �Ѵ�.
			}
			System.out.println();	//�� ����Ŭ�� �Ϸ�Ǹ� �ٹٲ��� �ǽ��ϰ� �ٽ� �ݺ��Ѵ�.
		}

	}

}
