package certificate;

class Section010_type3 {
	//��ȣ�� �ٲ�� ���� �����ϱ� (-1)*2*(-3)*...*100
	public static void main(String[] args) {
		int i = 0;
		double j = 1;	//����� ũ�Ⱑ ũ�⿡ doubleŸ������ ����
		
		do {
			i++;	//ó���� ���� 1�� ������
			
			if(i % 2 == 0) {	//¦�����
				j *= i;	//��ȣ ������� ���Ѵ�.
			}else {	//Ȧ�����	
				j *= i*(-1);	//-1�� ���� ������ ����� ���Ѵ�.
				
			}
		}	while(i < 100);
		
		System.out.printf("%11.4e", j);
	}
}
