package certificate;

class Section010_sum_type2 {
	//������ ���� 1-2+3-4...+99-100�� ���ϱ�
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(true) {	//���ѹݺ�
			i++;
			sum += i;
			
			if(i >= 99) {	//���� 99�� �Ǹ� ����� �ݺ� ����
				System.out.println(sum);
				break;
			}else {	//�ƴ϶�� ���� ���ڸ� �����ϰ� ����. ���� �ٽ� while�� ó������ ���ư�
				i++;
				sum -= i;
			}
		}
	}
}
