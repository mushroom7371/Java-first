package certificate;

class Section026_5multiple {
	//5�� ����� ������ ��
	public static void main(String[] args) {
		int cnt, hap, mok, nmg;	
		//cnt = 5�� ������� ����, hap = 5�� ������� ��, mok = ���ڵ��� 5�� ���� ��, nmg = 5�� ���� ������
		cnt = 0;
		hap = 0;
		
		for(int i = 1; i <= 100; i++) {	//1~100���� �ݺ��� �ǽ���
			mok = i / 5;	//intŸ���� Ư���� �������� �������⿡ ���� �ȴ�.
			
			//nmg = i - mok * 5;	//�̰� ������ �����ڷ� �������� �ʳ�?? 
			nmg = i % 5;	//������ �����ڷ� ����� ����
			
			if(nmg == 0) {
				cnt++;	//5�� ����� �´ٸ� cnt�� �ϳ��� ����
				hap += i;	//�׸��� hap ������ �� ���� ����
			}
		}
		
		System.out.println("5�� ����� ������ : " + cnt + " �� �̸�, �� ���ڵ��� ���� : " + hap + " �Դϴ�.");		
		
	}
}
