package certificate;

class Section010_sum {
	//while���� �̿��� 1~100 �ձ��ϱ�
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			i++;
			sum += i;
		}while(i < 100);	//while���� ������ �Ǹ� �ݺ��� �����Ѵ�. 100�̸��� ������ 99�϶� do���忡�� ���������ڷ� 100�� �Ǳ� ����
		
		System.out.println(sum);
	}

}
