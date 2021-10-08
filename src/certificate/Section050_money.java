package certificate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Section050_money {
	//�츮���� ȭ���� ������ �ż� ���... Ŀ�Էα� ���� �ѹ� ������¡... ���� �Ϸ� git �ʹ� �����
	
	//static ����� ���� Ŭ������ �����Ͽ� ��ü �������� Ŭ������ �޸𸮿� ����Ǹ� ��밡��(��, ���� Ŭ������ Ŭ�����̱� ������ ��ü�� ����� ���������� �����Ѿߵ�)
	static final int LENGTH = 10;	//����� �����Ͽ� ������ �ʵ��� �����ߴ�.
	static class member {	//���� Ŭ����
		String n;	//�̸��� ����� ����
		int p;		//����� ����� ����
		int [] pm = new int[10];	//���κ� ����� ���޾׿� ���� ȭ������� �ż��� ����ϴ� �迭
	}
	
	public static void main(String[] args) throws IOException {	//����� ó���� ���� ó���� �ѱ��� ������ ������ �߻��Ѵ�.
		File file = new File("money_data.txt");	//�������� file�� �ش� ������ ��θ� ��´�.
//		File file = new File("C:\\eclipse\\workspace\\JavaStudy\\Java-first\\money_data.txt");
		
		Scanner sc = new Scanner(new FileReader(file));
		//Scanner Ÿ���� ���뺯�� sc�� �����ϰ� ���⿡ FileReader�� ����Ͽ� �������� file�� ����Ű�� ��ü, �� money_data.txt ���Ϸκ��� �о������ �Ѵ�.

		member data = new member();	//static Ŭ������ ���� ��ü�� �����Ͽ� ���������� ����Ű���� ��
		int [] tm = new int[10];	//�� ȭ�� ������ ��ü ȭ�� �ż��� ����ϴ� �迭
		
		int k, t, m, sw;
		//k = ȭ�� �ż��� ����ϰų� ����� �� ���, t = ȭ�� ������ �ż��� ����� �ݾ�, m = ȭ�� ����, sw = ȭ�� ���� ���� ����ġ����
		System.out.printf("\t\t\t\t����� ����ǥ\n");
		System.out.printf("���� ��������޾�      ����      �ϸ�      ��õ     ��õ      ����     �Ϲ�      ����      �Ͻ�       ��         ��\n");
		
		for (k = 0; k <= LENGTH - 1; k++)
			tm[k] = data.pm[k] = 0;
		data.n = sc.next();
		data.p = sc.nextInt();
		
		while (true) {
			t = data.p;	//���� ȭ���� ������ ���ϱ����� ���ʷ� ����� ����
			m = 50000;	//ȭ���� ����, �츮���� �ְ� ȭ��� 5�������� �̸� �̿��Ͽ� 2�� 5�� ���� ��� ������ ������ Ȯ���Ҽ��ִ�
			sw = 1;	//2 �Ǵ� 5�� �������� ���� ����ġ ����
			
			//ù������ �������� �ּ�ó�� ������ �ݺ��� ������ �ۼ��ϸ� ���� ���� ����
			for (k = 0; k <= LENGTH - 1; k++) {	//�迭�� ���̸� 10���� �����Ͽ��⿡ 0���� ���� 9�������� �ݺ�
				data.pm[k] = t / m;	//����� 5�������� ���� ������ 5���� ������ ������ ���� int Ÿ���� Ư���� �������� ��������.
				t -= data.pm[k] * m;	//����� 5������ * ������ �Ͽ� �缳��
				if (sw == 1) {	//����ġ ������ 1�̶��
					m /= 5;	//5�������� 5�������� ���� 1�������� �Ǵµ� �̴� �ι�°�� ���� ȭ������̴�.
					sw = 0;	//���� ����ġ ������ 0���� ����
				}
				else {	//����ġ ������ 0�� �ƴϸ�
					m /= 2;	//ȭ���� ������ 2�� ������ �Ǵµ� �̴� 5õ������ �Ǹ� �̴� 3��°�� ���� ȭ������� �ȴ�.
					sw = 1;	//ȭ���� ������ �ٲ�⿡ �ٽ� ����ġ ������ 1�� �����Ѵ�.
				}
			}
			
			System.out.printf("%s %d", data.n, data.p);
			
			for (k = 0; k <= LENGTH - 1; k++) {
				System.out.printf("%5d", data.pm[k]);
				tm[k] += data.pm[k];
			}
			
			System.out.printf("\n");
			
			if(!sc.hasNext()) break;	//�ش� ������ while���� ���� ������ ǥ���ϸ� txt���Ϸ� ���� ������ �����Ͱ� ���ٸ� �����ϰڴٴ� �ǹ�
			
			data.n = sc.next();	//�����Ͱ� �����ִٸ� �ش� �����ʹ� txt������ �̸�, �� next()�޼���� ���� string���� �޴´�
			data.p = sc.nextInt();	//���������� int���� �����Ƿ� �̴� ����� �ȴ�.
		}
		
		System.out.printf("��ü ȭ�� �ż�        ");	//���� �ջ� �����
		for (k = 0; k <= LENGTH - 1; k++)
			System.out.printf("%5d", tm[k]);
		sc.close();
	}

}
