package certificate;

class Section010_sum_type1 {
	//����ġ ������ �̿��� 1-2+3-4...+99-100�� ���ϱ�
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		boolean sw = true;	//+-�� �����ϱ� ���� �������� ����Ǵ� ������ ����
		
		do {
			i++;	//�ݺ��� ���鼭 1�� �����ȴ�.
			if(sw) {
				sum += i;
				
				sw = false;	//�ѹ� �����, �ѹ� ������ �ǵ��� ����
			}else {
				sum -= i;
				
				sw = true;
			}
		}while(i < 100);
		
		System.out.println(sum);
	}

}
