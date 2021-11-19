package AlgorithmStudy;
import java.util.Scanner;
//���ϴ� ������ �����͸� �Է� �޾� ��ڼ��� N�� �迭�� ������ N���� ����

//�� ���� Ȱ�� Ŭ����
class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		final int N = 10;			//������ ������ ����� ������.
		int [] a = new int[N];		//N�� ũ�⸸ŭ �迭 ����
		int cnt = 0;				//�Է� ���� �� ������ ����
		int retry;					//��õ�

		System.out.println("������ �Է��ϼ���.");

		do {	//do whlie ���� �̿��Ͽ� �ּ� �ѹ��� ������ �����Ѵ�.
			
			System.out.printf("%d��° ������", cnt + 1);	//cnt�� �ʱ� ������ 0 �̹Ƿ� ù��° �������� ���۵�.
			a[cnt++ % N] = stdIn.nextInt();				//������ �����ڸ� �̿��Ͽ� 10�� ���� �������� ���� ������ �����͸� Ű����� �Է¹��� ���ڷ� �����Ѵ�.
			//���� ��� ù��° ������ ��� a[0 % 10] ��, a[0]�� ���� �Է¹��� ���� �����ϰ� cnt�� ���� 1 ������Ų��.
			// % 10 �� ���Ͽ� �ݺ� ����� ���� 0~9������ ���� �����͸� �����Ѵ�.

			System.out.print("��� �ұ��? (��.1���ƴϿ�.0����");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		//��¿� ����
		int i = cnt - N;
		if (i < 0) i = 0;

		for ( ; i < cnt; i++)
			System.out.printf("%2d��°�� ���� �� %d\n", i + 1, a[i % N]);
	}
}
