package certificate;

class Section010_sum1 {
	//do-while���� �̿��� 1~99 Ȧ�� �� ���ϱ�
	public static void main(String[] args) {
		int i = -1;	//do ���忡�� ù���� 1�� �ǰ� �ϱ� ����
		int sum = 0;
		
		do {
			i += 2;
			sum += i;
		}while(i < 99);
		
		System.out.println(sum);
	}

}
