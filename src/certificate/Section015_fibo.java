package certificate;

class Section015_fibo {
	//�Ǻ���ġ ��
	public static void main(String[] args) {
		int hap = 2, cnt = 2;	//1�װ� 2���� 1�� �����߱⿡ 2�� �ʱ�ȭ�ߴ�.
		int a = 1, b = 1;	//1,2�� ���� �� �ʱ�ȭ
		int c;
		
		while(true) {	//break���� ���� �ݺ�
			c = a + b;	//�Ǻ���ġ ������ �⺻
			hap += c;	//���� ����
			cnt++;		//���° ������ ���ϴ� ����
			
			if(cnt < 20) {
				a = b;
				b = c;
			}else {
				System.out.println(hap);
				break;
			}
		}
	}
}
