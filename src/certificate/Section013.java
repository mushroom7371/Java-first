package certificate;

class Section013 {
	//���� 1+2+4+7+11+16+...�� 20��° �ձ��ϱ�
	public static void main(String[] args) {
		int i = 0;	//�� ������ �׿� ���� ���� ������
		int j = 1;	//ù ������ 1�� ��(���� ���� �ɰ�)
		int sum = 1;	//������ ������ ����
		
		do {
			i++;
			j += i;
			sum += j;
		}while(i < 19);
		
		System.out.println(sum);
	}

}
