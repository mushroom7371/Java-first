package certificate;

class Section012 {
	//���� -(1/2) + (2/3) - (3/4) +... -(99/100) ���ϱ�
	public static void main(String[] args) {
		double i = 0;
		double j = 0;
		
		do {
			i++;
			
			if(i % 2 == 1) {	//i�� Ȧ�����
				j -= (i/(i+1));	//�ش� ���� ����.
			}else {				//i�� ¦�����
				j += (i/(i+1));	//�ش� ���� ���Ѵ�.
			}
		}while(i < 99);
		
		System.out.printf("%f", j);
	}

}
