package certificate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Section050_money {
	//�츮���� ȭ���� ������ �ż� ���
	
	//static ����� ���� Ŭ������ �����Ͽ� ��ü �������� Ŭ������ �޸𸮿� �ö󰡸� �ٷ� ��밡���ϴ�.
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
			t = data.p;
			m = 50000;
			sw = 1;
			
			for (k = 0; k <= LENGTH - 1; k++) {
				data.pm[k] = t / m;
				t -= data.pm[k] * m;
				if (sw == 1) {
					m /= 5;
					sw = 0;
				}
				else {
					m /= 2;
					sw = 1;
				}
			}
			
			System.out.printf("%s %d", data.n, data.p);
			
			for (k = 0; k <= LENGTH - 1; k++) {
				System.out.printf("%5d", data.pm[k]);
				tm[k] += data.pm[k];
			}
			
			System.out.printf("\n");
			
			if(!sc.hasNext()) break;
			
			data.n = sc.next();
			data.p = sc.nextInt();
		}
		
		System.out.printf("��ü ȭ�� �ż�        ");
		for (k = 0; k <= LENGTH - 1; k++)
			System.out.printf("%5d", tm[k]);
		sc.close();
	}

}
